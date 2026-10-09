package fun.java.main.bitmap;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Bitmap {
	public BufferedImage image;
    private Graphics2D g;

    public Bitmap(int width, int height) {
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        g = image.createGraphics();
    }

    public Bitmap(String path) {
    	try {
            // 读取图片到BufferedImage
            image = ImageIO.read(new File(path));
            // 基于加载进来的图片创建画笔，可以在这张素材图上继续绘图
            g = image.createGraphics();
        } catch (IOException e) {
            e.printStackTrace();
            // 如果图片找不到，创建一张200*200空白红色占位图，防止空指针
            image = new BufferedImage(200,200,BufferedImage.TYPE_INT_ARGB);
            g = image.createGraphics();
            g.setColor(Color.RED);
            g.fillRect(0,0,200,200);
        }
    }
    
    // 自己封装绘图API，模仿RGSS
    public void fillRect(int x, int y, int w, int h, Color c) {
        g.setColor(c);
        g.fillRect(x,y,w,h);
    }

    // 从已有的BufferedImage创建Bitmap（加载PNG时超级好用！）
    public Bitmap(BufferedImage src) {
        image = src;
        g = image.createGraphics();
    }

    public void dispose() {
        g.dispose();
    }
    
    public int getWidth() {
    	return image.getWidth();
    }
    
    public int getHeight() {
    	return image.getHeight();
    }
	

}

