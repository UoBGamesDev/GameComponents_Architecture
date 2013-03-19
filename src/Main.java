import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Main extends BasicGame
{

	private GameComponentCollection gameComponents = new GameComponentCollection();

	public Main()
	{
		super("GC Demo");
	}

	@Override
	public void init(GameContainer gc) throws SlickException
	{

		//Create 10 block object with a random x location
		for (int i = 0; i < 10; i++)
		{
			int x = (int) (Math.random() * gc.getWidth());
			gameComponents.add(new Block(x, 0));
		}

	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException
	{
		//Update all the components in the collection
		gameComponents.update(gc, delta);
	}

	public void render(GameContainer gc, Graphics g) throws SlickException
	{
		//Render all the components in the collection
		gameComponents.render(gc, g);
	}

	public static void main(String[] args) throws SlickException
	{
		AppGameContainer app = new AppGameContainer(new Main());

		app.setDisplayMode(800, 600, false);
		app.start();
	}
}