import java.lang.*;

public class pattern {
    static void print7(){
        int n = 5;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n - i - 1 ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ; j < 2 * i + 1 ; j++){
                System.out.print("*");
            }
            for(int j = 0 ; j < n - i - 1 ; j++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    static void print8(){
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 1 ; j <= i ; j++ ){
                System.out.print(" ");
            }
            for(int j = 5 ; j > i ; j--){
                System.out.print("*");
            }
            for(int j = 4 ; j > i ; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    static void print10(){
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.print("\n");
            
        }
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 4 ; j > i ; j--){
                System.out.print("*");
            }
            System.out.print("\n");
            
        }

    }
    static void print11(){
        for(int i = 0 ; i < 5;i++){
            int count = 0;
            if(i % 2 == 0) count = 1;
            else count = 0 ;
            for(int j = 0 ; j <= i ; j++){
                System.out.print(count);
                count = 1 - count;
            }
            System.out.print("\n");
        }
    }
    static void print12(){
        for(int i = 1 ; i < 5 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            for(int j = 5 ; j > i + 1 ; j--){
                System.out.print(" ");
            }
            for(int j = 5 ; j > i + 1 ; j--){
                System.out.print(" ");
            }
            for(int k = i ; k >= 1 ; k--){
                System.out.print(k);
            }
            System.out.print("\n");
        }
    }
    static void print13n14(){
        char ch;
        for(int i = 0 ; i < 5 ; i++){
            int j = 5;
            for(ch = 'A' ; ch <= 'E' && j >= i; ch++){
                System.out.print(ch);
                j--;
            }
            System.out.print("\n");
        } 
    }
    static void print16(){
        char ch = 'A';
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(ch);
            }
            ch += 1;
            System.out.print("\n");
        }
    }
    static void print17(){
        int n = 4 , i = 0;
        for(int k = 0 ; k <= n ;k++){
            for(i = 0 ; i <= n-k-1 ; i++){
                System.out.print(" ");  
            }
            char ch = 'A';
            int breakpoint = (2 * k + 1) / 2;
            for(int j = 1 ; j <= 2 * k + 1 ; j++){
                System.out.print(ch);
                if(j <= breakpoint) ch++;
                else ch--;
            }
            for(i = 0 ; i <= n-k-1 ; i++){
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    static void print18(){
        for(int i = 0 ; i < 5; i++){
            char ch;
            for(ch = (char) ('E' - i); ch <= 'E' ; ch++){
                System.out.print(ch);
            }
            System.out.print("\n");
        }
    }
    static void print22(){
        int n = 7;
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ;j++){
                arr[i][j] = Math.min(Math.min(i,j),Math.min(n - i - 1,n - j - 1));
                arr[i][j] = 4 - arr[i][j];
            }
        }
        for(int i = 0; i < n ; i++){
            for(int j  = 0 ; j < n ; j++){
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        // 1-7 easy combinational "*" patterns
        // print7();
        // print8();
        // print10();
        // print11();
        // print12();
        // print13n14();
        // print16();
        // print18();
        // print22();
    }
}
