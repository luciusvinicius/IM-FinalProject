
from pathlib import Path
	
import json
from IModality import IModality

directions = ["FRONT", "BACK", "LEFT", "RIGHT"]
positions = ["i", "1", "2", "3", "4"]
pieces = ["KNIGHT", "BISHOP", "ROOK", "PAWN", "QUEEN", "KING"]

def main():
 
    action = IModality(class_name="Action", add_timer=True)

    for piece in pieces:
        for direction in directions:
                for position in positions:
                    #for position2 in positions:
                    result = "-Action,"
                    result += "SELECT,"
                    if piece == "PAWN":
                        result += "-NumberInitial" + ","
                        result += position + "," #number - initial position
                    result += "-Entity" + ","
                    result += piece + ","
                    result += "-PositionInitial" + "," #initial direction
                    result += direction
                    action.parameters.append(result)
                    
                    if piece != "PAWN":
                        break
                    # print(result)


    action.generate_file(f"{Path(__file__).stem}_output.java")

main()

