package tryyy;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        float a,b;
        a = scanner.nextFloat();
        b = scanner.nextFloat();

        System.out.println("Hello World");
        try{
            System.out.println(Chia(a,b));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Tiep tuc chuong trinh");


    }
    static float Chia(float a, float b) throws Exception{
        if(b==0)
            throw new Exception("Chia cho 0");
        return a/b;
    }
}
