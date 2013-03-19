import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Color;


/**
 * This class represents a simple block object
 * @author Joel Hoskin
 *
 */
public class Block extends GameComponent
{
	
	private Image blankImage;
	
	private int x;
	private int y;
	
	private static final int UPDATE_RATE = 10;
	private int untilUpdate = UPDATE_RATE;
	
	
	public Block(int x, int y) throws SlickException
	{
		//Loads a blank texture
		blankImage = new Image("content/blank.png");
		this.x = x;
		this.y = y;
	}

	@Override
	public void update(GameContainer gc, int delta)
	{
		//I'm controlling the update rate 
		untilUpdate -= delta;
		
		if(untilUpdate < 0)
		{
			y += 1;
			untilUpdate = UPDATE_RATE;
		}		
	}

	@Override
	public void render(GameContainer gc, Graphics g)
	{
		//Draw the texture with a red filter
		blankImage.draw(x, y, 20, 20, Color.red);
		
	}
}
