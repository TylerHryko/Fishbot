package FIshbert;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import java.math.*;
public class Fishbert
{

  public static void main(String[] args) throws InterruptedException
  {
   try{
     boolean looping = true;
     while(looping){
     Thread.sleep(200);
     Robot robot = new Robot();
     Color color = robot.getPixelColor(1937,622);
     Color moochcolor = robot.getPixelColor(2040,1941);
     System.out.println("Red = "+ color.getRed());
     System.out.println("Green = "+ color.getGreen());
     System.out.println("Blue = "+ color.getBlue());
     System.out.println("moochRed = "+ moochcolor.getRed());
     System.out.println("moochGreen = "+ moochcolor.getGreen());
     System.out.println("moochBlue = "+ moochcolor.getBlue());
     int moochgreen = moochcolor.getGreen();
     int moochblue = moochcolor.getBlue();
     int moochred = moochcolor.getRed();
     int green = color.getGreen();
     int blue = color.getBlue();   
     int red = color.getRed();
     int i = 0;
     boolean moochable = moochgreen>210&&moochred>210;
     boolean a = green>180;
     boolean b = blue>200;
     boolean c = red>200;
     boolean hooked = false;
     Random random = new Random();
     if (a&b){
      System.out.println("Fish hooked!?");
      Thread.sleep(100);
      robot.keyPress(KeyEvent.VK_3);
      Thread.sleep(random.nextInt(100));
      robot.keyRelease(KeyEvent.VK_3);
      hooked = true;
     }
     if(hooked){
       Thread.sleep(8000);
       hooked = false;
       /*while(i<60){
       i++;
       System.out.println("Checking Mooch Status...");
       System.out.println("moochRed = "+ moochcolor.getRed());
       System.out.println("moochGreen = "+ moochcolor.getGreen());
       System.out.println("moochBlue = "+ moochcolor.getBlue());
       Thread.sleep(20);
       if(moochable){
       System.out.println("Mooching!");
       robot.keyPress(KeyEvent.VK_CONTROL);
       Thread.sleep(200);
       robot.keyPress(KeyEvent.VK_8);
       Thread.sleep(random.nextInt(100));
       robot.keyRelease(KeyEvent.VK_8);
       Thread.sleep(200);
       robot.keyPress(KeyEvent.VK_CONTROL);
       hooked = true;
       }
   
       }
   */
       Thread.sleep(random.nextInt(1500)+3000);
       System.out.println("Recasting.");
       robot.keyPress(KeyEvent.VK_2);
       Thread.sleep(random.nextInt(100));
       robot.keyRelease(KeyEvent.VK_2);
      
     }
     
     }
   }catch (AWTException e) {
     e.printStackTrace();
 }

  }

}
  
