package loop.ex;

public class Ex2 {
    public static void main(String[] args) {

        int num = 2;
        for(int count = 1; count <= 10; count++) {
            System.out.println("num = " + num + ", count = " + count);
            num += 2;
        }
    }
}
