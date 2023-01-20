
FILE = "movement"
ARG1 = "speech_sequence"
ARG2 = "gesture"
ARG3 = "output" # not always used
TYPE = "Complementary"

ARG_DICT = {
    "speech_sequence": "Speech",
    "output": "Output",
    "gesture": "SecondMod"
}

PATTERN = "{}_{}_output.java"

def main():
    # fg.Single(Speech.INIT, Output.INIT);
    output = ""
    gestures = []
    with open(PATTERN.format(ARG2, FILE), "r") as gesture_file:
        gestures = gesture_file.readlines()
    
    
    with open(PATTERN.format(ARG1, FILE), "r") as speech_file:
        with open(PATTERN.format(ARG3, FILE), "r") as output_file:
            f1 = speech_file.readline()
            while f1:
                line1 = f1.split("(")[0]
                for gesture in gestures:
                    f2 = output_file.readline()
                    line2 = f2.split("(")[0]
                    
                    ges_line = gesture.split("(")[0]
                
                    output += f"fg.{TYPE}({ARG_DICT[ARG1]}.{line1}, {ARG_DICT[ARG2]}.{ges_line}, {ARG_DICT[ARG3]}.{line2});\n"
                
                f1 = speech_file.readline()
                
            
    with open("movement_sequence_output.java", "w") as output_file2:
        output_file2.write(output)
            
    
    
    
    pass

if __name__ == "__main__":
    main()