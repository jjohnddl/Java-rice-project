package arrays;
import java.util.Scanner;

public class Main {
    public static int[][] arrays = new int[3][3];
static void getinfo(Scanner sc){
    System.out.println("===Input Student Grades===");
    for(int i =0;i< arrays.length;i++){
        System.out.println("Student #"+(i+1));
        for(int j=0;j<arrays[i].length;j++){
        System.out.print("Grade #"+(j+1)+": ");
        arrays[i][j] = sc.nextInt();
        }
        System.out.println();
    }
}
static void displaygrades(){
    System.out.println();
    System.out.println("===Table Grades===");
    System.out.print("        ");
    for(int j = 0; j<arrays[0].length;j++){
        System.out.printf("Stdt #%-2d",(j+1));
    }
    System.out.println();
    for(int i =0;i<arrays.length;i++){
        System.out.printf("Grade #%-3d",(i+1));
        for(int j = 0;j<arrays[i].length;j++){
            System.out.printf("%-5s  ",arrays[i][j]);
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  getinfo(sc);
  displaygrades();
}

}
