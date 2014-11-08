import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class Game {

	// Whether our game loop is running
	protected boolean running = false;
	
	/** time at last frame */
	private long lastFrame;
	
	private int fpsTick;
	/** frames per second */
	private int fps;
	
	/** last fps time */
	private long lastFPS;
	
	/** the delta time in milliseconds */
	private int delta;
	private boolean mouseWasDown = false;
	private int lastMouseX, lastMouseY;
	public static void main(String[] args) {
		

	}

}
