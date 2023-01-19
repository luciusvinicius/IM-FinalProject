import json
from IModality import IModality

directions = ["FRONT", "BACK", "LEFT", "RIGHT"]
positions = ["i", "0", "1", "2"]
pieces = ["KNIGHT", "BISHOP", "ROOK", "PAWN", "QUEEN", "KING"]

def main():
    
    speech = IModality(class_name="Speech")
    speech.parameters.append("shape,SQUARE")
    speech.parameters.append("shape,TRIANGLE")
    speech.generate_file()
    
    # Example:
    # "MOVE,KNIGHT,LEFT,1,RIGHT,2"
    action = IModality(class_name="Action")

    for piece in pieces:
        for direction in directions:
            for direction2 in directions:
                #for position in positions:
                    #for position2 in positions:
                            result = ""
                            result += "MOVE,"
                            result += piece + ","
                            result += direction + ","
                            result += direction2
                            #result += direction + "," + position + ","
                            #result += direction2 + "," + position2
                            action.parameters.append(result)
                            print(result)


    action.generate_file()

main()