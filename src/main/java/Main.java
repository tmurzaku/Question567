import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      while (true){
        System.out.println("What question?");
        int question = sc.nextInt();
        
        if (question == 5){
          question5();
        }
          
        else if (question == 6){
          System.out.println("What shape?");
          String shape = sc.next();
          question6(shape);
        }
          
        else if (question == 7){
          question7();
        }
          
        else{
          System.out.println("invalid");
        }

        System.out.println("Would you like to continue?");
        String answer = sc.next();
        if (answer.equals("no")){
          break;
        }else{
          continue;
        }
      }



      
    }
  
    public static void question5(){
        System.out.println("TTTTTTTTTTTTTTTTTTTTTTTT  EEEEEEEEEEEEEEEEEE    MMM         MMM ");
        System.out.println("TTTTTTTTTTTTTTTTTTTTTTTT  EEEEEEEEEEEEEEEEEE    MMMM       MMMM ");
        System.out.println("        TTT               EEE                   MMMMM     MMMMM");
        System.out.println("        TTT               EEE                   MMMMMM   MMMMMM");
        System.out.println("        TTT               EEE                   MMMMMMMMMMMMMMM");
        System.out.println("        TTT               EEEEEEEEEEEEEEE       MMM    M    MMM ");
        System.out.println("        TTT               EEEEEEEEEEEEEEE       MMM         MMM ");
        System.out.println("        TTT               EEE                   MMM         MMM");
        System.out.println("        TTT               EEE                   MMM         MMM");
        System.out.println("        TTT               EEE                   MMM         MMM");
        System.out.println("        TTT               EEE                   MMM         MMM");
        System.out.println("        TTT               EEEEEEEEEEEEEEEEE     MMM         MMM");
        System.out.println("        TTT               EEEEEEEEEEEEEEEEE     MMM         MMM");
    }

    public static void question6(String s){
        if (s.equals("parallelogram")){
          System.out.println("PARALLELOG");
          System.out.println(" A        R");
          System.out.println("  R        A");
          System.out.println("   ALLELOGRAM");
        }
        else if (s.equals("trapezoid")){
          System.out.println("  APEZO  ");
          System.out.println(" R     I ");
          System.out.println("TRAPEZOID");
        }
        else if (s.equals("diamond")){
          System.out.println("   D");
          System.out.println("  I I");
          System.out.println("M     M");
          System.out.println(" O   O");
          System.out.println("  N N");
          System.out.println("   D");
        }else{
          System.out.println("Invalid");
        }
    }

  public static void question7(){
    System.out.println("Mr. Thomas Murzaku");
    System.out.println("125 Chatsworth drive");
  }
}