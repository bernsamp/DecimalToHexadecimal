import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        System.out.println("Enter a decimal number: ");

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        String hex = decimalToHexadecimal(userInput);

        System.out.println(userInput + " in hexadecimal is : " + hex);
    }

    static String decimalToHexadecimal(int number)
    {
        char[] values ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem;
        StringBuilder hexadecimal= new StringBuilder();

        while(number != 0){
            rem = number % 16;
            hexadecimal.insert(0, values[rem]);
            number /= 16;
        }
        return hexadecimal.toString();
    }
}