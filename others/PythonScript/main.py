import json
from IModality import IModality

def main():
    with open("structure.json", "r") as json_file:
        jsn = json.load(json_file)
        
    voice = jsn["voice"]
    gesture = jsn["gesture"]
    structure = jsn["structure"]
    
    speech = IModality(class_name="Speech")
    speech.parameters.append("shape,SQUARE")
    speech.generate_file()
    
    pass

main()