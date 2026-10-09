package fun.java.main.sprite;

import java.awt.Graphics;
import fun.java.main.bitmap.Bitmap;

public class Sprite {
	public Bitmap bitmap;
	public int x, y, width, height;
	
	public void draw(Graphics g) {
		if (bitmap != null && bitmap.image != null) {
            g.drawImage(bitmap.image, 0, 0, width, height, null);
        }
		
	}

	public void update() {
		
	}
	
	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
}