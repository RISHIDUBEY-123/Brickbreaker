package brickbreaker;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MapGenerator {
 public int map[][];
 public int bricwidth;
 public int bricheight;
 public MapGenerator(int row ,int col){
	map = new int[row][col];
	for(int i=0;i<map.length; i++){
		for(int j=0; j<map[0].length;j++){
			map[i][j] =1;//ball not intersected with the bricks
			
			
		}
	}
	bricwidth =548/col;
	bricheight = 150/row;
 }
 public void draw(Graphics2D g){
	 for(int i=0;i<map.length; i++){
for(int j=0; j<map[0].length;j++){
				if(map[i][j] >0){
				g.setColor(Color.ORANGE);
				g.fillRect(j* bricwidth+80 , i*bricheight + 50,bricwidth,bricheight);
				
				g.setStroke(new BasicStroke(6));
				g.setColor(Color.RED);
				g.drawRect(j* bricwidth+80 , i*bricheight + 50,bricwidth,bricheight);
				
          }
				
      }
   }
}
public void setBricValue(int value ,int row, int col ){
	map[row][col]= value;
			}
}