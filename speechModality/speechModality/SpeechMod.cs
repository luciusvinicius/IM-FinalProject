﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using mmisharp;
using Microsoft.Speech.Recognition;
using System.Xml.Linq;
using System.Globalization;
//using Newtonsoft.Json;

namespace speechModality
{
    public class SpeechMod
    {
        // changed 16 april 2020
        private static SpeechRecognitionEngine sre= new SpeechRecognitionEngine(new System.Globalization.CultureInfo("pt-PT"));
        private Grammar gr;

        private List<string> initial_phrases = new List<string>() {
            "Olá, eu me chamo Magnot, seu programa de Xadrez e Estou pronto para receber ordens. Inicie a outra aplicação AppGUI para começarmos.",
            "Olá, sou o Magnot. Estás pronto para mais uma partida de xadrez? Basta abrir o AppGUI, a outra aplicação, e serás levado para a aplicação web."
        };


        public event EventHandler<SpeechEventArg> Recognized;
        protected virtual void onRecognized(SpeechEventArg msg)
        {
            EventHandler<SpeechEventArg> handler = Recognized;
            if (handler != null)
            {
                handler(this, msg);
            }
        }

        private LifeCycleEvents lce;
        private MmiCommunication mmic;

        //  NEW 16 april
        private static Tts tts = new Tts(sre);
        private MmiCommunication mmiReceiver;

        public SpeechMod()
        {
            //init LifeCycleEvents..
            lce = new LifeCycleEvents("ASR", "FUSION", "speech-1", "acoustic", "command");
            mmic = new MmiCommunication("localhost", 9876, "User1", "ASR");

            mmic.Send(lce.NewContextRequest());

            //load pt recognizer
            //sre = new SpeechRecognitionEngine(new System.Globalization.CultureInfo("pt-PT"));
            gr = new Grammar(Environment.CurrentDirectory + "\\chess_grammar.grxml", "rootRule");
            sre.LoadGrammar(gr);


            sre.SetInputToDefaultAudioDevice();
            sre.RecognizeAsync(RecognizeMode.Multiple);
            sre.SpeechRecognized += Sre_SpeechRecognized;
            sre.SpeechHypothesized += Sre_SpeechHypothesized;

            // NEW - TTS support 16 April
            Random rnd = new Random();
            int index = rnd.Next(initial_phrases.Count);
            string phrase = initial_phrases[index];

            tts.Speak(phrase);


            //  o TTS  no final indica que se recebe mensagens enviadas para TTS
            mmiReceiver = new MmiCommunication("localhost",8000, "User1", "TTS");
            mmiReceiver.Message += MmiReceived_Message;
            mmiReceiver.Start();


        }


    private void Sre_SpeechHypothesized(object sender, SpeechHypothesizedEventArgs e)
        {
            onRecognized(new SpeechEventArg() { Text = e.Result.Text, Confidence = e.Result.Confidence, Final = false });
        }

        private void Sre_SpeechRecognized(object sender, SpeechRecognizedEventArgs e)
        {
            onRecognized(new SpeechEventArg() { Text = e.Result.Text, Confidence = e.Result.Confidence, Final = true });


            // CHANGED FOR FUSION ---------------------------------------
            //SEND
            string json = "{ \"recognized\": [";
            foreach (var resultSemantic in e.Result.Semantics)
            {
                json += "\"" + resultSemantic.Key + "\",\"" + resultSemantic.Value.Value + "\", ";
            }
            json = json.Substring(0, json.Length - 2);
            json += "] }";
            Console.WriteLine(json);
            // END CHANGED FOR FUSION ---------------------------------------

            var exNot = lce.ExtensionNotification(e.Result.Audio.StartTime + "", e.Result.Audio.StartTime.Add(e.Result.Audio.Duration) + "", e.Result.Confidence, json);
            mmic.Send(exNot);
        }

       


        //  NEW 16 April 2020   - create receiver, answer to messages received
        //  Adapted from AppGUI code






        //MmiReceived_Message;

        private void MmiReceived_Message(object sender, MmiEventArgs e)
        {
            Console.WriteLine(e.Message);

            var doc = XDocument.Parse(e.Message);
            var com = doc.Descendants("command").FirstOrDefault().Value;

            Console.WriteLine(com);


            tts.Speak(com);

            //dynamic json = JsonConvert.DeserializeObject(com);

            /*
            Shape _s = null;
            switch ((string)json.recognized[0].ToString())
            {
                case "SQUARE":
                    _s = rectangle;
                    break;
                case "CIRCLE":
                    _s = circle;
                    break;
                case "TRIANGLE":
                    _s = triangle;
                    break;
            }

            App.Current.Dispatcher.Invoke(() =>
            {
                switch ((string)json.recognized[1].ToString())
                {
                    case "GREEN":
                        _s.Fill = Brushes.Green;
                        break;
                    case "BLUE":
                        _s.Fill = Brushes.Blue;
                        break;
                    case "RED":
                        _s.Fill = Brushes.Red;
                        break;
                }
            });
            */


        }
    }
}
