package scxmlgen.Modalities;

import scxmlgen.interfaces.IModality;

/**
 *
 * @author nunof
 */
public enum SecondMod implements IModality{

    // RED("[color][RED]",1500),
    // BLUE("[color][BLUE]",1500),
    // YELLOW("[color][YELLOW]",1500);

    INIT("[2][Init]",1500),
	MOVE_FRONT("[4][MoveA]",1500),
    MOVE_BACK("[5][MoveB]",1500),
    MOVE_LEFT("[6][MoveL]",1500),
    MOVE_RIGHT("[7][MoveR]",1500);

    
    
    private String event;
    private int timeout;


    SecondMod(String m, int time) {
        event=m;
        timeout=time;
    }

    @Override
    public int getTimeOut() {
        return timeout;
    }

    @Override
    public String getEventName() {
        //return getModalityName()+"."+event;
        return event;
    }

    @Override
    public String getEvName() {
        return getModalityName().toLowerCase()+event.toLowerCase();
    }
    
}
