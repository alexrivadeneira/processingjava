import processing.core.PApplet;

public class MainApp extends PApplet {
    public static void main(String[] args){
        PApplet.main("MainApp", args);
    }

    public void settings(){
        size(800,600);

    }

    public void setup(){
        background(0);

    }

    public void draw(){
        stroke(0);
        fill(255,0,255);
        ellipse(100,200,150,100);
        rect(mouseX, mouseY,100,200);


    }


}
