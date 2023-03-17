package game2023;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {

    public static final int WIDTH = 160;
    public static final int HEIGHT = 120;
    public static final int SCALE = 4;
    public BufferedImage layer = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    
    //  public static Player player;
    
    // construtor
    public Game(){
         this.setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
         // player = new Player();
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("PING PONG 2023");
        Game game = new Game();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(game);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);    
    }
    
    void render(){
        
    }
    
    void tick(){
        
    }
    
    
    @Override
    public void run() {
        while(true){
            tick();
            render();
            
            try{
               Thread.sleep(1000/60);
            }catch(InterruptedException ex){
                System.out.println("Erro: "+ ex.getMessage());
            }
        }
    }

}
