import java.util.*;
public class String_man{
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
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Input Strings
        System.out.println("Enter the string 1");
        String str1=sc.nextLine();
        System.out.println("Enter the string 2");
        String str2=sc.nextLine();
        //Comparison of String
        if(str1.equals(str2)){
            System.out.println("Both Strings are equal");
        }
        else{
            System.out.println("Both Strings are not equal");
        }
        //Concatination
        System.out.println("The original strings are: "+str1+" & "+str2);
        String s3=str1+str2;
        System.out.println("The new string is : "+s3);
        //Length of String
        System.out.println("Length of String : "+s3.length());
        //Substring
        System.out.println("The substring is:"+s3.substring(5));
        //Converting String to UPPERCASE
        System.out.println("String in UPPERCASE: "+s3.toUpperCase());
        //Check Palindrome
        Palindrome(s3);
}
}