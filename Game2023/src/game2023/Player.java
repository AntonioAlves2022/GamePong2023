
package game2023;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
    public boolean left, right;
    public int x,y;
    public int width, height;
    
    public Player(int x, int y){
        this.x = x;
        this.y = y;
        this.width = 40;
        this.height = 5;
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
        // Impedir o jogador de sair da tela
        if(x + width > Game.WIDTH){
            x = Game.WIDTH - width;
        }else if(x < 0){
            x = 0;
        }
        
    }
}
