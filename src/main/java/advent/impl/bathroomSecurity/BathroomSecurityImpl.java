package advent.impl.bathroomSecurity;

import advent.BathroomSecurity;
import advent.PuzzleInput;

import java.util.List;

/**
 * Created by brant on 12/5/2016.
 */
public class BathroomSecurityImpl implements BathroomSecurity{

    private PuzzleInput puzzleInput;

    public BathroomSecurityImpl(PuzzleInput puzzleInput){
        this.puzzleInput= puzzleInput;
    }

    public String objective1(){
        List<String> instructions = puzzleInput.getInputFromFile("day2.txt");
        KeyPad keypad = new KeyPad('5');
        String passCode = "";
        for(String instruction:instructions){
            for(int i=0; i<instruction.length(); i++){
                keypad.movePosition(instruction.charAt(i));
            }
            passCode+= keypad.getPosition();
        }
        return passCode;
    }

    public String objective2(){
        List<String> instructions = puzzleInput.getInputFromFile("day2.txt");
        BathroomKeyPad keypad = new BathroomKeyPad();
        String passCode = "";
        for(String instruction:instructions){
            for(int i=0; i<instruction.length(); i++){
                keypad.movePosition(instruction.charAt(i));
            }
            passCode+= keypad.getPosition();
        }
        return passCode;
    }


}
