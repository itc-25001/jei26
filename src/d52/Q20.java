package d52;

public class Q20 {
    public static void main(String[] args){
        int a = 1;
        int b = ++a; // aは2になってからbに代入する
        int c = a++; // cに2を代入してからaは3になる
        System.out.println(b+" "+ c);
        System.out.println("aの値:"+a);
    }
}
