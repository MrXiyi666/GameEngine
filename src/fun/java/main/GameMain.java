package fun.java.main;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.Timer;
import fun.java.main.game.Game;
import fun.java.main.scene.Scene;
import fun.java.main.scene.Scene_Title;

public class GameMain {
	
	public static void main(String[] args) {
        Game.frame = new JFrame(Game.name);
        Game.frame.setSize(Game.width, Game.height);
        Game.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Game.frame.setLocationRelativeTo(null);
        Game.frame.setLayout(null);
        Game.frame.setVisible(true); 
        Game.gameTimer = new Timer(1000 / 60, _->{
        	Container contentPane = Game.frame.getContentPane();
            Component[] children = contentPane.getComponents();
            for(Component comp : children){
                if(comp instanceof Scene){
                    Scene scene = (Scene) comp;
                    scene.update();
                    scene.repaint();
                }
            }
    	});
        Game.gameTimer.start();
        Game.scene = new Scene_Title();
        Game.frame.add(Game.scene);
	}

}
