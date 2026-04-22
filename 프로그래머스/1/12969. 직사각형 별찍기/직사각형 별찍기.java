import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String str = "*";
        str = str.repeat(a);
        str += '\n';
        str = str.repeat(b);
        
        System.out.println(str);
    }
}