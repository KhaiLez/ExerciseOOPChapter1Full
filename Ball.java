public class Ball
{
    private float x, y, xDelta, yDelta;
    private int radius;

    public Ball(float x, float y, int radius, float xDelta, float yDelta)
    {
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.xDelta=xDelta;
        this.yDelta=yDelta;
    }

    public float getX()
    {
        return this.x;
    }

    public void setX(float x)
    {
        this.x=x;
    }

    public float getY()
    {
        return this.y;
    }

    public void setY(float y)
    {
        this.y = y;
    }

    public int getRadius()
    {
        return this.radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public float getXDelta()
    {
        return this.xDelta;
    }

    public void setXDelta(float xDelta)
    {
        this.xDelta = xDelta;
    }

    public float getYDelta()
    {
        return yDelta;
    }

    public void setYDelta(float yDelta)
    {
        this.yDelta = yDelta;
    }

    public void move()
    {
        this.x+=this.xDelta;
        this.y+=this.yDelta;
    }

    public void reflectHorizontal()
    {
        this.xDelta=-this.xDelta;
    }

    public void reflectVertical()
    {
        this.yDelta=-this.yDelta;
    }

    public String toString()
    {
        return "Ball[("+this.x+","+this.y+"),speed=("+this.xDelta+","+this.yDelta+")]";
    }
}
