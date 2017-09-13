
 import java.util.*;
public class box
{
  private Scanner in =  new Scanner(System.in);

  private double dim1; 
  private double dim2;
  private double dim3;
  private double weight;
  public box()
  {
    dim1= 0  ;
    dim2=  0;
    dim3= 0 ;
    weight= 0  ;
  }
 
  public void inputData()
  {
    System.out.println("Enter Dimension 1");
    dim1 = in.nextDouble();
    System.out.println("Enter Dimension 2");
    dim2 = in.nextDouble();
    System.out.println("Enter Dimension 3");
    dim3 = in.nextDouble();
  }
  public double

 // public double findLargest()
  //{
   // return
  //}
  public double findGirth()
  {
    girth = ;
  }
  public double findLargest()
  {
    if(dim1 >=dim2 && dim2 >= dim3)
      return dim1;
    else if(dim2 >= dim3 && dim2>= dim1)
      return dim2;
    else
      return dim3;
  }
  public double largest()
  {largest =findLargest }
  public void printMessage()
  {
    largest= findLargest
  }

 
  
 
}
