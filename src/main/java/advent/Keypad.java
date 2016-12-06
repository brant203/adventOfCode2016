package advent;


public interface Keypad {

    public char getPosition();
    public void setPosition(char position);
    public void movePosition(char instruction);

}
