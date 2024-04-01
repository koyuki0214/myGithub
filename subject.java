import java.util.Scanner;

public class subject {

    public static void main(String[] args) {
        System.out.print("직사각형의 세로와 가로를 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] numArr = num.split(" ");
        int garo = Integer.parseInt(numArr[0]);
        int sero = Integer.parseInt(numArr[1]);

        System.out.println("직사각형의 넓이 = "+garo*sero);

    }

    
}