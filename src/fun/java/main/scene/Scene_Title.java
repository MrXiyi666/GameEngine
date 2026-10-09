package fun.java.main.scene;

import fun.java.main.bitmap.Bitmap;
import fun.java.main.sprite.Sprite;

public class Scene_Title extends Scene{
	
	public Scene_Title() {
		Bitmap bitmap = new Bitmap("img/2024_12_31_11_56_58_26.jpg");
        Sprite sprite = new Sprite();
        sprite.bitmap = bitmap;
        sprite.resize(280, 440);
        //sprite.width = 280;//bitmap.getWidth();
        //sprite.height = 440;//bitmap.getHeight();
        this.addView(sprite);
        this.resize(bitmap.getWidth(), bitmap.getHeight());
	}
	
	 public void update(){
		 super.update();
	 }
	 
}