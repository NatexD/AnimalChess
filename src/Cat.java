import javax.swing.ImageIcon;

public class Cat extends Animal{
    public Cat(boolean color) {
            this.isRedSide = color;
            this.canSwim = false;
            this.canJump = false;
            this.power = 2;
        if (color) {
        	this.name = "Red Cat";
        	this.theIcon = new ImageIcon(getClass().getResource("animal/chess/Assets/red/r2.png"));
        	this.coord.setX(1);
        	this.coord.setY(1);
        }
        else {
        	this.name = "Black Cat";
        	this.theIcon = new ImageIcon(getClass().getResource("animal/chess/Assets/black/b2.png"));
        	this.coord.setX(5);
        	this.coord.setY(7);
        }
    }
}
