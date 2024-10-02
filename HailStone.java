import java.util.*;
public class HailStone{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int enter = scanner.nextInt();
        hailStoneAlg(enter);
    }

    public static void hailStoneAlg(int num){
        System.out.print(num+" ");
        if(num == 1){
            System.out.println("done");
        }
        else if(num%2==0){
            hailStoneAlg(num/2);
        }
        else{
            hailStoneAlg((num*3)+1);
        }
    }
}