import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * A very basic implementation of a GameComponent class, for ideas on how this could be extended see XNA's GameComponent Framework
 * http://msdn.microsoft.com/en-us/library/microsoft.xna.framework.gamecomponent_members.aspx
 * 
 * @author Joel Hoskin
 *
 */
public abstract class GameComponent
{
	
	//Delta represents the number of seconds since last update
	public abstract void update(GameContainer gc, int delta);
	
	//Swing users be aware that Slick Graphics is different to the AWT Graphics object you may have used in Swing
	//I accidently imported awt.Color earlier when I needed slick.Color so be careful with your imports :D
	public abstract void render(GameContainer gc, Graphics g);
}
