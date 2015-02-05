import java.util.Collection;

public class State
{
	private int dirtLeft;
	private Collection<String> obstacles, dirt;

	State()
	{
		dirtLeft = 0;
	}

	State(int DL, Collection<String> o, Collection<String> d, String)
	{
		obstacles = o;
		dirt = d;
		dirtLeft = DL;
	}
}
