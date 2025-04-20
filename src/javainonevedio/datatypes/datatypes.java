package javainonevedio.datatypes;

public class datatypes {
    public static void main(String[] args) {
        System.out.println("nayu");
        int a=10;
        short b=30;
        byte c=90;
        float value=90.90f;
        long n=90L;
        double dob=9000.989d;
        byte bytevalue=10;
        short shortvalue=bytevalue; //this is called widening this will happen implicitly
        float fvalue=(float)dob;//narrowing  conversion this we shoud explicitly tell
        int intvalue=(int)dob;
        System.out.println(fvalue);
        System.out.println(intvalue);

      System.out.println("minvalue of short " + Short.MIN_VALUE);
      System.out.println("maxvalue of short" + Short.MAX_VALUE);
      System.out.println("minvalue of int" + Integer.MIN_VALUE);
      System.out.println("maxvalue of int" + Integer.MAX_VALUE);
      System.out.println((char) 10009);

    }
}
