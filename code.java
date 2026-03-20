public class code {
    public static int power(int base,int exponent){
        int result = (int) Math.pow(base, base);
        result = result % 100;
        System.out.println("Result: "+result);
return result;
    }
    public static void main(String[] args) {
        power(5, 7);
    }
    
}
