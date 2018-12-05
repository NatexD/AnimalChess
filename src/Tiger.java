import javax.swing.ImageIcon;

public class Tiger extends Animal{
    public Tiger(boolean color) {
            this.isRedSide = color;
            this.canSwim = false;
            this.canJump = true;
            this.power = 6;
        if (color) {
            this.name = "Red Tiger";
            this.theIcon = new ImageIcon(getClass().getResource("animal/chess/Assets/red/r6.png"));
            this.coord.setX(0);
            this.coord.setY(0);
        }
        else {
            this.name = "Black Tiger";
            this.theIcon = new ImageIcon(getClass().getResource("animal/chess/Assets/black/b6.png"));
            this.coord.setX(6);
            this.coord.setY(8);
        }
    }
}
