import javax.swing.ImageIcon;

public class Lion extends Animal{
    public Lion(boolean color) {
            this.isRedSide = color;
            this.canSwim = false;
            this.canJump = true;
            this.power = 7;
        if (color) {
            this.name = "Red Lion";
            this.theIcon = new ImageIcon(getClass().getResource("animal/chess/Assets/red/r7.png"));
            this.coord.setX(6);
            this.coord.setY(0);
        }
        else {
            this.name = "Black Lion";
            this.theIcon = new ImageIcon(getClass().getResource("animal/chess/Assets/black/b7.png"));
            this.coord.setX(0);
            this.coord.setY(8);
        }
    }
}
