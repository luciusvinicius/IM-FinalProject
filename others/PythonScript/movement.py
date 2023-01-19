import json
from IModality import IModality

directions = ["FRONT", "BACK", "LEFT", "RIGHT"]

def main():
    
    speech = IModality(class_name="Speech")
    speech.parameters.append("shape,SQUARE")
    speech.parameters.append("shape,TRIANGLE")
    speech.generate_file()
    
    # Example:
    # "Action,MOVE,KNIGHT,LEFT,1,RIGHT,2"
    
main()