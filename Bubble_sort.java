import java.util.Arrays;

public class Bubble_sort {
    public static void main(String [] args){
        int a[]= {13,46,24,52,20,9};

        for(int i=0;i<a.length-1;i++){
               for(int j=0;j<a.length-1-i;j++){
                if (a[j]>a[j+1]) {
                    int temp=0;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
               }
        }
        System.out.println(Arrays.toString(a));
        
    }
}
