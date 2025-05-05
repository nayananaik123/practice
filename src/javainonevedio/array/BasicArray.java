package javainonevedio.array;

public class BasicArray {
    public static void main(String[] args){
        int[] a={12,3,7,13,6,9,2,1};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for(int e:a){
            System.out.println(e);
        }
    }
}
