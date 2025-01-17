package com.cdac.shapes;

public class Rectangle{
    private int x , y;
    private double width , height;
    public Rectangle(int x, int y, double width , double height )
    {
      this.x= x;
      this.y= y;
      this.width=width;
      this.height=height;
    }
    public String getRectDetails()
    {
     return "Rect" +x+","+y+"Width="+width+"height="+height;

    }
}