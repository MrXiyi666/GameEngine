package fun.java.main.scene;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import fun.java.main.game.Game;
import fun.java.main.sprite.Sprite;

public class Scene extends JPanel{
	// 存放所有精灵
    private List<Sprite> spriteList = new ArrayList<>();
    
    public Scene() {
    	this.setBounds(0, 0, Game.width, Game.height);
    }
    
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // 这个是动态绘制的话 还是只绘制一次
        for(Sprite sp : spriteList){
            sp.draw(g);
        }
    }
	
    //这个是动态更新的吗
    public void update(){
        for(Sprite sp : spriteList){
            sp.update();
        }
    }
	
	public void addView(Sprite sprite) {
		spriteList.add(sprite);
	}
	
	public void removeView(Sprite sprite) {
		spriteList.remove(sprite);
	}
	
	public void resize(int width, int height) {
		this.setBounds(0, 0, width, height);
	}
	
}