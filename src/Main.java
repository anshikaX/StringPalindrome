import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is palindrome or not.");
        String str = sc.nextLine();
        boolean result = isPalindrome(str);
        System.out.println(str+ " is a palindrome = " + result);


    }
    public static boolean isPalindrome(String str)
    {
        if(str==null)
        {
            return false;
        }
        if(str.length()<=1)
        {
            return true;
        }

        String first = str.substring(0,1);
        String last  = str.substring(str.length()-1,str.length());

        if(!first.equals(last))
        {
            return false;

        }
        else
        {
            return isPalindrome(str.substring(1,str.length()-1));
        }

    }
}
