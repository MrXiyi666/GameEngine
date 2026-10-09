package fun.java.main.game;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.Timer;
import fun.java.main.scene.Scene;

public class Game {
	public static JFrame frame;
	public static int width = 816, height = 624;
	public static String name = "小游戏";
	public static List<Scene> view_list = new ArrayList<>();
	public static Timer gameTimer;
	public static Scene scene;


}