
package game2023;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
    public boolean left, right;
    public int x,y;
    
    public Player(int x, int y){
        this.x = x;
        this.y = y;
    }
    void render(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(x, y, 40, 5);
    }
    
    void tick(){
        if(right){
            x++;
        }else if(left){
            x--;
        }
    }
}
