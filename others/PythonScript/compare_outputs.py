
FILE = "movement"
ARG1 = "speech"
ARG2 = "output"
ARG3 = "" # not always used
TYPE = "Single"

ARG_DICT = {
    "speech": "Speech",
    "output": "Output",
    "gesture": "SecondMod"
}

PATTERN = "{}_{}_output.java"

def main():
    # fg.Single(Speech.INIT, Output.INIT);
    output = ""
    
    with open(PATTERN.format(ARG1, FILE), "r") as file1:
        with open(PATTERN.format(ARG2, FILE), "r") as file2:
            f1 = file1.readline()
            f2 = file2.readline()
            while f1 and f2:
                line1 = f1.split("(")[0]
                line2 = f2.split("(")[0]
                
                output += f"fg.{TYPE}({ARG_DICT[ARG1]}.{line1}, {ARG_DICT[ARG2]}.{line2});\n"
                
                f1 = file1.readline()
                f2 = file2.readline()
            
    with open("comparation_output.java", "w") as output_file:
        output_file.write(output)
            
    
    
    
    pass

if __name__ == "__main__":
    main()