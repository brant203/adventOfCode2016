package advent.impl.bathroomSecurity;

import advent.Keypad;

public class KeyPad implements Keypad {

    private char position = '5';

    public KeyPad(){}

    public KeyPad(char position){
        this.position = position;
    }

    public char getPosition(){return position;}

    public void setPosition(char position){this.position=position;}

    public void movePosition(char instruction){
        if(position == '1'){
            switch (instruction){
                case 'R': position = '2';
                    break;
                case 'D': position = '4';
                    break;
                default: break;
            }
        }
        else if(position == '2'){
            switch(instruction){
                case 'R': position = '3';
                    break;
                case 'L': position = '1';
                    break;
                case 'D': position = '5';
                    break;
                default:break;
            }
        }
        else if(position == '3'){
            switch(instruction){
                case 'L': position = '2';
                    break;
                case 'D': position = '3';
                    break;
                default:break;
            }
        }
        else if(position == '4'){
            switch(instruction){
                case 'U': position = '1';
                    break;
                case 'R': position = '5';
                    break;
                case 'D': position = '7';
                    break;
                default: break;
            }
        }
        else if(position == '5'){
            switch (instruction){
                case 'U': position = '2';
                    break;
                case 'R': position = '6';
                    break;
                case 'D': position = '8';
                    break;
                case 'L': position = '4';
                    break;
                default: break;
            }
        }
        else if(position == '6'){
            switch (instruction){
                case 'U': position = '3';
                    break;
                case 'D': position = '9';
                    break;
                case 'L': position = '5';
                    break;
                default: break;
            }
        }
        else if(position == '7'){
            switch (instruction){
                case 'U': position = '4';
                    break;
                case 'R': position = '8';
                    break;
                default: break;
            }
        }
        else if(position == '8'){
            switch (instruction){
                case 'U': position = '5';
                    break;
                case 'R': position = '9';
                    break;
                case 'L': position = '7';
                    break;
                default: break;
            }
        }
        else if(position == '9'){
            switch (instruction){
                case 'U': position = '6';
                    break;
                case 'L': position = '8';
                    break;
                default: break;
            }
        }
    }
}
