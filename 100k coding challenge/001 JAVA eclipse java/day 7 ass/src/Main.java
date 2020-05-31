import java.util.Scanner;

public class Main {
        public static void main(String ar[]) {
            Main obj = new Main();
                System.out.println("Enter the size of array");
                Scanner s=new Scanner(System.in);
                int size=s.nextInt();
                int number[][]  =new int[100][100];
                obj.getarray(number,size);
                 System.out.println("Array elements are:\n");
                obj.display(number,size);
                         
                                
        }
          void getarray(int num[][],int s) {
                 Scanner a=new Scanner(System.in);
                 System.out.println("Enter the array values :");
                 for(int i=0;i<s;i++) {
                         for(int j=0;j<s;j++) {
                         num[i][j] = a.nextInt();
                         }
                 }        
         }
         
          void display(int num[][] , int siz) {
         for(int i=0;i<siz;i++) {
                 for(int j=0;j<siz;j++) {
         System.out.print(num[i][j]+"\t");
                 }
                 System.out.print("\n\n");
         } 
}
}
