import java.util.Random;
import java.util.Scanner;

public class rps{
    public static void main(String[] args) {
        while(true){
        String [] RPS = {"r","p","s"};
        String computermove = RPS[new Random().nextInt(RPS.length)];
        Scanner scanner = new Scanner(System.in);
        String playermove;
        
          while (true) {
            
           
        
        System.out.println("enter a move(r,p,s)");
        playermove = scanner.nextLine();
        if (playermove.equals("r")||playermove.equals("p")||playermove.equals("s")){
            break;
        }
            System.out.println(playermove + "is not an valid one.enter a valid input");

        
    }
         System.out.println(computermove +    "is what computer played,");
         if (playermove.equals(computermove)){
            System.out.println("game is a tie");

         }
         else if(playermove.equals("r")){
            if(computermove.equals("s")){
                System.out.println("you win!");


            }else if (computermove.equals("p")){
                System.out.println("sorry computer win!");

            }

         }
          //else if(playermove.equals("g")){
            if(computermove.equals("s")){
                System.out.println("you win!");


           // }else if (computermove.equals("p")){
                System.out.println("you win!");

            }

         }
         else if(playermove.equals("s")){
            if(computermove.equals("p")){
                System.out.println("you win!");


            }else if (computermove.equals("r")){
                System.out.println("sorry computer win!");

            }

         }
         else if(playermove.equals("p")){
            if(computermove.equals("r")){
                System.out.println("you win!");


            }else if (computermove.equals("s")){
                System.out.println("sorry computer win!");

            }
             System.out.println("want to continue? (y/n)");
            String playagain = scanner.nextLine();
            if(!playagain.equals("y")){
                break;

            }

         }
        }
       

}
}