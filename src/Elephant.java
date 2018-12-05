import javax.swing.ImageIcon;

public class Elephant extends Animal{
    public Elephant(boolean color) {
            this.isRedSide = color;
            this.canSwim = false;
            this.canJump = false;
            this.power = 8;
        if (color) {
        	this.name = "Red Elephant";
        	this.theIcon = new ImageIcon(getClass().getResource("animal/chess/Assets/red/r8.png"));
        	this.coord.setX(0);
        	this.coord.setY(2);
        }
        else {
        	this.name = "Black Elephant";
        	this.theIcon = new ImageIcon(getClass().getResource("animal/chess/Assets/black/b8.png"));
        	this.coord.setX(6);
        	this.coord.setY(6);
        }
    }
}
