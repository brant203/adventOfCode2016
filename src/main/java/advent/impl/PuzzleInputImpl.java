package advent.impl;

import advent.PuzzleInput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by brant on 12/4/2016.
 */
public class PuzzleInputImpl implements PuzzleInput{

    public List<String> getInputFromFile(String fileName){
        try{

            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/"+fileName));
            List<String> lines = new ArrayList<String>();
            String line;
            while((line = br.readLine()) != null){
                lines.add(line);
            }
            return lines;
        }catch(IOException e){
            System.out.println(e);
            return null;
        }
    }
}
