package advent.impl.bathroomSecurity;

import advent.BathroomSecurity;


public class BathroomKeyPad extends KeyPad {


    @Override
    public void movePosition(char instruction) {
        char position = super.getPosition();
        if (position == '1') {
            switch (instruction) {
                case 'D':
                    position = '3';
                    break;
                default:
                    break;
            }
        } else if (position == '2') {
            switch (instruction) {
                case 'R':
                    position = '3';
                    break;
                case 'D':
                    position = '6';
                    break;
                default:
                    break;
            }
        } else if (position == '3') {
            switch (instruction) {
                case 'U':
                    position = '1';
                    break;
                case 'R':
                    position = '4';
                    break;
                case 'D':
                    position = '7';
                    break;
                case 'L':
                    position = '2';
                    break;
                default:
                    break;
            }
        } else if (position == '4') {
            switch (instruction) {
                case 'D':
                    position = '8';
                    break;
                case 'L':
                    position = '3';
                    break;
                default:
                    break;
            }
        } else if (position == '5') {
            switch (instruction) {
                case 'R':
                    position = '6';
                    break;
                default:
                    break;
            }
        } else if (position == '6') {
            switch (instruction) {
                case 'U':
                    position = '2';
                    break;
                case 'R':
                    position = '7';
                    break;
                case 'D':
                    position = 'A';
                    break;
                case 'L':
                    position = '5';
                    break;
                default:
                    break;
            }
        } else if (position == '7') {
            switch (instruction) {
                case 'U':
                    position = '3';
                    break;
                case 'R':
                    position = '8';
                    break;
                case 'D':
                    position = 'B';
                    break;
                case 'L':
                    position = '6';
                    break;
                default:
                    break;
            }
        } else if (position == '8') {
            switch (instruction) {
                case 'U':
                    position = '4';
                    break;
                case 'R':
                    position = '9';
                    break;
                case 'D':
                    position = 'C';
                    break;
                case 'L':
                    position = '7';
                    break;
                default:
                    break;
            }
        } else if (position == '9') {
            switch (instruction) {
                case 'L':
                    position = '8';
                    break;
                default:
                    break;
            }
        } else if (position == 'A') {
            switch (instruction) {
                case 'U':
                    position = '6';
                    break;
                case 'R':
                    position = 'B';
                    break;
                default:
                    break;
            }
        } else if (position == 'B') {
            switch (instruction) {
                case 'U':
                    position = '7';
                    break;
                case 'R':
                    position = 'C';
                    break;
                case 'D':
                    position = 'D';
                    break;
                case 'L':
                    position = 'A';
                    break;
                default:
                    break;
            }
        } else if (position == 'C') {
            switch (instruction) {
                case 'U':
                    position = '8';
                    break;
                case 'L':
                    position = 'B';
                    break;
                default:
                    break;
            }
        } else if (position == 'D') {
            switch (instruction) {
                case 'U':
                    position = 'B';
                    break;
                default:
                    break;
            }
        }
        super.setPosition(position);
    }
}
