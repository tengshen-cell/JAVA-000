package Week_01.practice01;

public class Hello {

    public static void main(String[] args) {
        int num = 1;
        int add = add(num);
        System.out.println(add);
    }

    public static int add(int num) {
        num = num + 2;
        num = num - 1;
        return num;
    }
}