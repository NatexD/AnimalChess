import javax.swing.ImageIcon;

public class Wolf extends Animal{
    public Wolf(boolean color) {
            this.isRedSide = color;
            this.canSwim = false;
            this.canJump = false;
            this.power = 4;
        if (color) {
        	this.name = "Red Wolf";
        	this.theIcon = new ImageIcon(getClass().getResource("animal/chess/Assets/red/r4.png"));
        	this.coord.setX(2);
        	this.coord.setY(2);
        }
        else {
        	this.name = "Black Wolf";
        	this.theIcon = new ImageIcon(getClass().getResource("animal/chess/Assets/black/b4.png"));
        	this.coord.setX(4);
        	this.coord.setY(6);
        }
    }
}
