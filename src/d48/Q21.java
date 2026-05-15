package src.d48;

public class Q21 {
    public static void main(String[] args){
        int x,y=25; // xは宣言だけ、値は入っていない int x;

        x=y /= 4 + 3;
        System.out.println(x+" " + y);
    }
}
/*
Java 演算子の優先順位:四則演算と代入演算子
1:乗除　剰余　* / %
2:加減  + -
3:代入　複合代入　　= =/ +=
順位が小さい順に計算される。
 */
