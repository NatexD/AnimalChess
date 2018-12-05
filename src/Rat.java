import javax.swing.ImageIcon;

public class Rat extends Animal {
    public Rat(boolean color) {
            this.isRedSide = color;
            this.canSwim = true;
            this.canJump = false;
            this.power = 1;
        if (color) {
            this.name = "Red Rat";
            this.theIcon = new ImageIcon(getClass().getResource("animal/chess/Assets/red/r1.png"));
            this.coord.setX(6);
            this.coord.setY(2);
        }
        else {
            this.name = "Black Rat";
            this.theIcon = new ImageIcon(getClass().getResource("animal/chess/Assets/black/b1.png"));
            this.coord.setX(0);
            this.coord.setY(6);
        }
    }
}
	
