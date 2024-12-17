// imports
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyEvent;

public class Player {
    // instance variables
        // integers
        public int x, y, w;

        // booleans

        // strings

        // arrays

        // classes
        public final Color c;

    // constructors
    public Player(int px, int py, int pw, Color pc) {
        // integers
        x = px; y = py; w = pw;
        c = pc;

        // booleans

        // strings
    }
    // actions
        // movement
        public void movement(KeyEvent k) {
            // neg y (up)
            if (k.getKeyChar() == 'w') {
                y -= w;
            // pos y (down)
            } else if (k.getKeyChar() == 's') {
                y += w;
            // neg x (left)
            } else if (k.getKeyChar() == 'a') {
                x -= w;
            // pos x (right)
            } else if (k.getKeyChar() == 'd') {
                x += w;
            }
        }

        // shooting

    // update
        // draw to screen
        public void drawPlayer(Graphics p) {
            p.setColor(c);
            p.fillRect(x, y, w, w);
        }
}