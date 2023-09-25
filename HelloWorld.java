//This program is basic hellow-world program
//For all class names the first letter should be in Upper Case. If several words are used to form a name of the class, each inner word's first letter should be in Upper Case.
public class HelloWorld{
/*The main method the entry point for executing a Java program.
  The access modifier of the main method needs to be public so that the JRE can access and execute this method. If a method isn’t public, then access is restricted.
  The main method has to be static so that the JVM can load the class into memory and call the main method without creating an instance of the class first.
  Java main method accepts a single argument of type String array. Each string in the array is a command line argument. You can use command line arguments to affect the operation of the program, or to pass information to the program, at runtime*/
  public static void main(String[] arg){
    //Below method (line of code) is responsible for printing on screen
    System.out.print("Hello World");
  }  
}
