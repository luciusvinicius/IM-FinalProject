from dataclasses import dataclass, field
import re

BASE_PATH = "./IModality-base"
END_PATH = "./IModality-end"


@dataclass
class IModality():
    """Class to create the output in Java format"""
    class_name: str
    parameters: list[str] = field(default_factory=list)
    time: int = 1500
    
    def generate_file(self, filename:str="output.java") -> str:
        with open(BASE_PATH, "r") as base_file:
            output = base_file.read() + "\n"
            
        output += "public enum " + self.class_name + " implements IModality { \n\n"
        # ADD PARAMETERS
        
        # string = 'Geeksforgeeksfor'
        # pattern = 'for'
        # match= [m.start() for m in re.finditer(pattern, string)]
        
        # #getting the starting index using match.start()
        # print ("starting index", match)
        
        #Getting the start and end index in tuple format using match.span()
        # print ("start and end index", match.span())
        
        for parameter in self.parameters:
            splt_parameter = parameter.split(",")
            parameter_name = ""
            for i in range(1, len(splt_parameter), 2):
                parameter_name += splt_parameter[i] + "_"
                
            parameter_name = parameter_name[:-1]
            
            output += "\t" + parameter_name + "(\""
            
            for param in splt_parameter:
                output += "[" + param + "]"
            
            output += "\"," + str(self.time) + "),\n"
            
            
            # output += "\t" + parameter + ","
            # SQUARE("[shape][SQUARE]",1500),
            # TRIANGLE("[shape][TRIANGLE]",1500),
            # CIRCLE("[shape][CIRCLE]",1500);
        
        output = output[:-2] + ";\n\n"
        
        # CLOSE CLASS
        with open(END_PATH, "r") as end_file:
            output += end_file.read()
        
        with open(filename, "w") as output_file:
            output_file.write(output)
        
        return output