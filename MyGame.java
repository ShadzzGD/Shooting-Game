
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class MyGame extends Game  {
    
        public static final String TITLE = "MyGame";
        public static final int SCREEN_WIDTH = 1200;
        public static final int SCREEN_HEIGHT = 800;

        // classes
        Player p;

        // integers

        // strings

        // booleans
        
		
	public MyGame() {
                // classes
                p = new Player(100, 100, 50, Color.RED);

                // integers

                // strings

                // booleans
        }
        

	public void update() {

        }
	
	public void draw(Graphics pen) {
                // draw player 1    
                p.drawPlayer(pen);
        }
        
    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {}

    @Override
    public void keyReleased(KeyEvent ke) {
        p.movement(ke);
    }

    @Override
    public void mouseClicked(MouseEvent ke) { }

    @Override
    public void mousePressed(MouseEvent me) {}
    @Override
    public void mouseReleased(MouseEvent me) {}

    @Override
    public void mouseEntered(MouseEvent me) {}

    @Override
    public void mouseExited(MouseEvent me) {}
        
        
    //Launches the Game
    public static void main(String[] args) { new MyGame().start(TITLE, SCREEN_WIDTH,SCREEN_HEIGHT); }
}