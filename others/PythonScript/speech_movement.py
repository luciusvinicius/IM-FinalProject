#gerar isto  "recognized": ["Action","MOVE", "NumberInitial","1", "Entity","KNIGHT", "PositionInitial","LEFT", "NumberFinal","1", "PositionFinal","FRONT"] }

from pathlib import Path
	

import json
from IModality import IModality

directions = ["FRONT", "BACK", "LEFT", "RIGHT"]
positions = ["i", "1", "2", "3", "4"]
pieces = ["KNIGHT", "BISHOP", "ROOK", "PAWN", "QUEEN", "KING"]

def main():
    
    # speech = IModality(class_name="Speech", add_timer=True)
    # speech.parameters.append("shape,SQUARE")
    # speech.parameters.append("shape,TRIANGLE")
    # speech.generate_file()
 
    action = IModality(class_name="Action", add_timer=True)

    for piece in pieces:
        for direction in directions:
            for direction2 in directions:
                for position in positions:
                    #for position2 in positions:
                    result = "-Action,"
                    result += "MOVE,"
                    if piece == "PAWN":
                        result += "-NumberInitial" + ","
                        result += position + "," #number - initial position
                    result += "-Entity" + ","
                    result += piece + ","
                    result += "-PositionInitial" + "," #initial direction
                    result += direction + ","
                    # result += "-NumberFinal" + ","
                    # result += "1" + "," #number - final position
                    result += "-PositionFinal" + "," #final direction
                    result += direction2
                    action.parameters.append(result)
                    
                    if piece != "PAWN":
                        break
                    # print(result)


    action.generate_file(f"{Path(__file__).stem}_output.java")

main()

