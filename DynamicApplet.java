import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="DynamicApplet" width="300" height="200">
</applet>
*/
public class DynamicApplet extends Applet {
    private String message;

    @Override
    public void init() {
        // This method is called when the applet is initialized
        message = "Hello, Applet!";
    }

    @Override
    public void paint(Graphics g) {
        // This method is used to draw content dynamically
        g.drawString(message, 50, 100);
    }

    @Override
    public void start() {
        // Change message when the applet starts
        message = "Applet is running!";
        repaint();
    }

    @Override
    public void stop() {
        // Update message when the applet stops
        message = "Applet stopped!";
        repaint();
    }
}
