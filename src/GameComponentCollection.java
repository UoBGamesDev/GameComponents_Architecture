import java.util.LinkedList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;


/**
 * This allows you to make a collection of GameComponents and update/render them all together
 * @author Joel Hoskin
 *
 */
public class GameComponentCollection extends LinkedList<GameComponent>
{
	public void update(GameContainer gc, int delta)
	{
		for(GameComponent component : this)
		{
			component.update(gc, delta);
		}
	}
	
	public void render(GameContainer gc, Graphics g)
	{
		for(GameComponent component : this)
		{
			component.render(gc, g);
		}
	}
}
