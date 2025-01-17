class Box //extends Object
{
  //state: properties/attributes/non data members: instance vars: saved in heap memory
  private double width,depth,height;//for tight encapsulation
  //parametrised constructor
  Box(double w ,double d ,double height)//height is local var
  {
    width=w;
    depth=d;
    this.height=height;//use case of this keyword: to resolve conflicts between local var and instance var

  }
  //add overloading constructor
  Box(double side){
    //this(...): for invoking same class's constructor
    this(side,side,side);

  }
  //B.L (business logic)
  //add instance method to returm string form of box details
  String getDetails()
  {
    return "Box Dims"+width+" "+depth+" "+height;
  }
  //Add method to return computed box volume
  double computeVolume()
  {
    return width*depth*height;
  }
  //Add a method to check equality of two boxes
  boolean isEqual(Box anotherBox)
  {
    return this.width==anotherBox.width && this.depth==anotherBox.depth && this.height==anotherBox.height; 
  }
  //add a method to return a new box with dims offset from current box
  Box createNewBox(double wOff,double dOff,double hOff){
      Box newBox = new Box(width+wOff , depth+dOff,height+hOff);
      return newBox;
  }
}