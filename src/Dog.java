import javax.swing.ImageIcon;

public class Dog extends Animal{
    public Dog(boolean color) {
            this.isRedSide = color;
            this.canSwim = false;
            this.canJump = false;
            this.power = 3;
        if (color) {
        	this.name = "Red Dog";
        	this.theIcon = new ImageIcon(getClass().getResource("animal/chess/Assets/red/r3.png"));
        	this.coord.setX(5);
        	this.coord.setY(1);
        }
        else {
        	this.name = "Black Dog";
        	this.theIcon = new ImageIcon(getClass().getResource("animal/chess/Assets/black/b3.png"));
        	this.coord.setX(1);
        	this.coord.setY(7);
        }
    }
}
