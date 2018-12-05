import javax.swing.ImageIcon;

public class Leopard extends Animal{
    public Leopard(boolean color) {
            this.isRedSide = color;
            this.canSwim = false;
            this.canJump = false;
            this.power = 5;
        if (color) {
        	this.name = "Red Leopard";
        	this.theIcon = new ImageIcon(getClass().getResource("animal/chess/Assets/red/r5.png"));
        	this.coord.setX(4);
        	this.coord.setY(2);
        }
        else {
        	this.name = "Black Leopard";
        	this.theIcon = new ImageIcon(getClass().getResource("animal/chess/Assets/black/b5.png"));
        	this.coord.setX(2);
        	this.coord.setY(6);
        }
    }
}
