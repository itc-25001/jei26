package d53;

//public class Q25 {
//    static void main(String[] args){
//        char[] ch = {'A','B','C'};
//        String s1 = new String("ABC");
//        String s2 = new String(ch);
//        boolean b1 = s1 = s2;
//        boolean b2 = s1.equals(s2);
//        System.out.print(b1 + " " + b2);
//    }
//}
/*
s1とs2はそれぞれnew演算子を使ってインスタンス化しているので目盛り領域は別となる
別々の目盛り空間に同じ[ABC]が格納されてることになる

そのため
s1 == s2 -> false(参照先が異なるため)
s1.equals(s2) -> true(値は同じ[ABC]のため)

よって出力結果は false true となる

Javaでは==演算子は参照型なら参照先(アドレス)を比較します
Javaでは==演算子は基本型なら値そのものを比較します
Pythonでは==演算子は値そのものを比較します。Javaとは挙動が異なります。
混合しないよう注意しましょう。
 */