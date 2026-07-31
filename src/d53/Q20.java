package d53;

public class Q20 {
    static void main(String[] args){
        int i = 8;
        float f = 3.27f;

        float n = i + f;
        System.out.print(n);
    }
}

/*
このコードがコンパイルエラーになることがわかりました
int + floatの演算結果はfloatになるのですが、float型の値をint型に代入するとエラーになる
小数点以下の情報が失われるため、Javaはこれをエラーとして使う
 */