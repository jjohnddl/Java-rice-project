import java.util.Scanner;
public class Main{
    static String[][] seats = new String[5][5];
public static void initializeSeats(){
    for(int i = 0; i<seats.length; i++){
        for(int j = 0; j<seats[i].length;j++){
seats[i][j] = "O";
        }
    }
}
   public static void displayseats(){
 System.out.println("Cinema seats: ");
 System.out.println("  1 2 3 4 5 ");
 for(int i = 0; i<seats.length;i++){
    System.out.print((i+1) + " ");
    for(int j =0;j<seats[i].length;j++){
    System.out.print(seats[i][j]+" ");
 }
  System.out.println();
}
}
   public static void reserveseats(int row,int col){
        if(row < 0 || row >= 5 || col < 0 || col >= 5){
            System.out.println("Invalid Seat");
            return;
        }
        if(seats[row][col].equals("O")){
            seats[row][col] = "X";
            System.out.println("Seat Reserve");
        }
        else{
            System.out.println("Seat Taken");
        }
    }

public static void main(String[] args) {
Scanner sc =  new Scanner(System.in);
initializeSeats();
    
while (true) { 
    displayseats();

    System.out.println("Enter row (1-5) or 0 to exit");
    int row = sc.nextInt();

    if (row == 0){
        System.out.println("Exiting...");
        return;
    }
     row = row - 1;

    System.out.println("Enter Colum: ");
    int col = sc.nextInt();
    col = col - 1;
    reserveseats(row,col);


}
}
}