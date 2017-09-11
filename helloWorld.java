//*******************************************************************
// linda S Mucassi,
//
//  1 You will(Need no){ 
//  2 Example at=ALL;
//  3 if (You.are(GOOD))
//  4 at.writing(Your.CODE);
//  5 }
//
// Most sincerely, a cruixer.
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    OtherClass myObject = new OtherClass("Hello World!");
    System.out.print(myObject);
  }
}

// you can add other public classes to this editor in any order
public class OtherClass
{
  private String message;
  private boolean answer = false;
  public OtherClass(String input)
  {
    message = "This is a " + input + " application for gitHub";
  }
  public String toString()
  {
    return message;
  }
}
