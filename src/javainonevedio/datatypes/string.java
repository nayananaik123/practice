package javainonevedio.datatypes;

public class string {
    public static void main(String[] args){
        String s1="hello world"; //string literal  this will be stored in string pool
        String s2="hello";
        String s3 =new String("hello"); //using constructor (creating object)
        System.out.println(s1);
        System.out.println(s1==s2);//reference is same
        System.out.println(s1==s3);//different objects
        System.out.println(s1.equals(s3));//value will be compared

        //to uppercase
        String lower=s1.toUpperCase();
        System.out.println(s1);
        System.out.println(lower);

        System.out.println(s1.length());//length of the string
        System.out.println(s1.charAt(0));//charcter at that postition will be printed
        System.out.println(s1.contains("llo"));
        String newtext=s1.replace("o","b");
        System.out.println((newtext));
        System.out.println(s1.substring(0,5));



    }
}
