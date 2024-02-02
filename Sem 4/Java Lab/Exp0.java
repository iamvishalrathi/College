import java.util.*;
    public class Exp0{
    public static void Palindrome(String s3){
        int l=0,r=s3.length()-1;
        while(l<r){
            if(s3.charAt(l)!=s3.charAt(r)) {
                System.out.println("Not a palindrome");
                return;}
                l++;
                r--;
    }
    System.out.println("Palindrome");
    }
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Arthmetic Operations----------");
        System.out.print("Enter the integer 1:");
        int a= sc.nextInt();
        System.out.print("Enter the integer 2:");
        int b= sc.nextInt();
        System.out.println("Addition is:"+ (a+b));
        System.out.println("Subtraction is:"+ (a-b));
        System.out.println("Multiplication is:"+ a*b);
        System.out.println("Division is:"+ a/b);
        System.out.println("----------String Manipulation----------");
        //Input Strings
        System.out.print("Enter the string 1:");
        String str1=sc.next();
        System.out.print("Enter the string 2:");
        String str2=sc.next();
        //Concatination
        System.out.println("The original strings are: "+str1+" & "+str2);
        String s3=str1+str2;
        System.out.println("The new string is : "+s3);
        //Length of String
        System.out.println("Length of String : "+s3.length());
        //Check Palindrome
        Palindrome(s3);
}
}