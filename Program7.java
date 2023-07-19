//Creating a thread using runnable interface.


import java.util.*;
class Mythread implements Runnable
{
  public void run()
  {
    System.out.println("This thread is running.");
  }
}

class Program7
{
  public static void main(String args[])
  {
    Mythread ob = new Mythread();
    Thread t = new Thread(ob);
    t.start();
  }
}
