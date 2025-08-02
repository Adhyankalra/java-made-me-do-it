public class newday {
    public static void main(String[] args){
        int a= 10;
        int b= 20;
        int c = sum(a, b);
        System.out.println("Sum is: " + c);
        int d = sum(a, b, 30);
        System.out.println("Sum of three numbers is: " + d);        
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
