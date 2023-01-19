#{ "recognized": ["Action","CAPTURE", "Target","PAWN", "PositionFinal","LEFT", "Entity","KNIGHT", "PositionInitial","RIGHT"] }

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
 
    action = IModality(class_name="Action")

    for pieceCaptured in pieces:
        for directionCaptured in directions:
            for pieceCapturing in pieces:
                for directionPieceCapturing in directions:
                
                                result = ""
                                result += "CAPTURE,"
                                result += "Target" + ","
                                result += pieceCaptured + ","
                                result += "PositionFinal" + "," #initial direction
                                result += directionCaptured + ","
                                result += "Entity" + ","
                                result += pieceCapturing + ","
                                result += "PositionInitial" + "," #final direction
                                result += directionPieceCapturing
                                #result += direction + "," + position + ","
                                #result += direction2 + "," + position2
                                action.parameters.append(result)
                                print(result)


    action.generate_file()

main()

