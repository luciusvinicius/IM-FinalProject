package scxmlgen.Modalities;

import scxmlgen.interfaces.IOutput;



public enum Output implements IOutput{
    

    INIT("[Action][START][Entity][GAME]"),
    GO_BACK("[Action][GO_BACK]"),
    SOUND_OFF("[Action][SOUND_OFF]"),
    SOUND_ON("[Action][SOUND_ON]"),
    ROQUE("[Action][SPECIAL][SpecialMove][ROQUE]"),
    END("[Action][END]"),

    // Movement

    MOVE_UP("[Action][MOVE][PositionFinal][FRONT]"),
    MOVE_DOWN("[Action][MOVE][PositionFinal][BACK]"),
    MOVE_LEFT("[Action][MOVE][PositionFinal][LEFT]"),
    MOVE_RIGHT("[Action][MOVE][PositionFinal][RIGHT]"),

    ;
    
    
    private String event;

    Output(String m) {
        event=m;
    }
    
    public String getEvent(){
        return this.toString();
    }

    public String getEventName(){
        return event;
    }
}
