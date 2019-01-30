PImage face;
void setup(){
face = loadImage("cat.jpg");
size(500,500);
face.resize(500,500);
background(face);
}
void draw(){
background(face);
int lX=mouseX;
int ly=mouseY;
if(lX<130){
lX=130;
}  
if(ly>195){
 ly=195; 
}  
if(lX>149){
 lX=149; 
}
if(ly<183){
 ly=183;
}
int rx=lX + 93;
int ry=ly +2;
fill(255,255,255);
ellipse(233,192,35,30);  
ellipse(140,190,35,30);
fill(0,0,0);
ellipse(lX,ly,10,10);
ellipse(rx,ry,10,10);
if(mousePressed){
 println(mouseX+" " +mouseY);
 

}


}