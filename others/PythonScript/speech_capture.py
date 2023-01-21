
from pathlib import Path
	
import json
from IModality import IModality

directions = ["FRONT", "BACK", "LEFT", "RIGHT"]
positions = ["i", "1", "2", "3", "4"]
pieces = ["KNIGHT", "BISHOP", "ROOK", "PAWN", "QUEEN", "KING"]

def main():
 
    action = IModality(class_name="Action", add_timer=True)

    for piece in pieces:
        for piece2 in pieces:
            for direction in directions:
                for direction2 in directions:
                    for position in positions:
                        for position2 in positions:
                            result = "-Action,"
                            result += "CAPTURE,"
                            result += "-Entity" + ","
                            result += piece
                            if piece == "PAWN":
                                result += f"_{position}"
                            result += ","
                            result += "-PositionInitial" + "," #initial direction
                            result += direction + ","
                            result += "-Target,"
                            result += piece2
                            if piece2 == "PAWN":
                                result += f"_{position2}"
                            result += ","
                            result += "-PositionFinal" + ","
                            result += direction2
                            
                            action.parameters.append(result)
                            
                            if piece2 != "PAWN":
                                break
                        
                        if piece != "PAWN":
                            break
                        # print(result)


    action.generate_file(f"{Path(__file__).stem}_output.java")

main()

