public class coordinate
{
	int X;
	int Y;

	coordinate()
	{
		X = 0;
		Y = 0;
	}

	coordinate(int x, int y)
	{
		X = x;
		Y = y;
	}

	public int getX() {
		return X;
	}

	public int getY() {
		return Y;
	}

	public void setX(int x) {
		X = x;
	}

	public void setY(int y) {
		Y = y;
	}
}
