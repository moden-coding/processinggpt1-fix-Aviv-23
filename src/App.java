import processing.core.PApplet;

public class App extends PApplet {

    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {
        size(800, 600);  // Window size: 800 by 600
    }

    public void setup() {
        background(200);                // Light gray background
        fill(255, 255, 0);              // Fill color: yellow
        stroke(0);                      // Stroke color: black
        strokeWeight(2);                // Stroke thickness: 2 pixels
        triangle(600, 100, 700, 200, 500, 200); // Draw the triangle
    }

    public void draw() {
        // Nothing here since we just want one triangle
    }
}
