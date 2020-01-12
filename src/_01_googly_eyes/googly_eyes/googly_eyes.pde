PImage face;
void setup() {
   face = loadImage("download.png");
   size(800,600);
    face.resize(width,height);


}

void draw() {
      background(face);
  fill(8,1,1);
  
  if(mouseX>325){ 
    mouseX=325;
  }
 
    if(mouseY>180){ 
    mouseY=180;
  }
 
  
    if(mouseY<165){ 
    mouseY=165;
  }
  
    if(mouseX<240){ 
    mouseX=240;
  }
  
  
  
  
  ellipse(mouseX,mouseY,20,20);
  
  
  
  ellipse(mouseX+220,mouseY,20,20);
  
  




}
