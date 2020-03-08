PImage bluemarker;
void setup() {
  
size(2000,1000);

bluemarker=loadImage("bluecrayon.png");

bluemarker.resize(80,80);







}

void draw() {
  
 

if(mousePressed){
  

 image(bluemarker, mouseX, mouseY);

}
}
