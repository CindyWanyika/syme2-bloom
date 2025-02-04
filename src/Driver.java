import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner choice=new Scanner(System.in);
        System.out.println("Welcome to Emotrack,,your friend through your emotional highs and lows\n" +
                "To sign in type 1\n" +
                "To Create an Account type 2");
        int first=choice.nextInt();

        if(first==1){
            //log in logic,check the existence
            System.out.print("Enter your name ");
            String name=choice.nextLine();
            System.out.println("Enter your password ");
            //check if passwords match

        }
        if (first==2){
            //sign up logic
            //ask for name,password and password confirmation
            //checkif account exists
        }
    }
}
