import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  background(125);
    stroke(0);
    //Horizontal lines for boxes
    for (int drawLineX = width/20; drawLineX <= width/2; drawLineX += width/20){
      line(drawLineX, 0, drawLineX, width/2);
    }
    //Vertical Lines for Boxes
    for (int drawLineY = height/20; drawLineY <= height/2; drawLineY += height/20){
      line(0, drawLineY, height/2, drawLineY);
    }
    //circles
    for (int drawcircleY = 0; drawcircleY <= (height/2) - (height/40); drawcircleY += height/10){
      for (int drawcircleX = width - (width/10); drawcircleX >= width/2; drawcircleX -= height/10){
        fill(255);
        ellipse(drawcircleX + 20, drawcircleY + 20, (width/10) - width/40, (height/10) - height/40);
      }
    }
    //gradient
    for (int intColour = 0; intColour < (width/2); intColour++){
      stroke(intColour,intColour,intColour);
      line(intColour,200,intColour,height);
    }
    //center of flower
    fill(255, 255, 0);
    ellipse((float)(width/1.3333333),(float)(height/1.3333333),(float)(width/13.3333333),(float)(height/13.3333333));

    //petals of flower
    fill(0, 120, 20);
    translate((float)(width/1.3333333),(float)(height/1.3333333));
    for (int intPetals = 0; intPetals <=360; intPetals += 45){

        //rotates the petals 45 degrees each time one is drawn
        rotate(radians(intPetals));
        ellipse(0,0 - width/15, height/30, height/11);
        }
    
   
  
  }
  

  
  
  
  // define other methods down here.
}