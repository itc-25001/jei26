package Java_intro;

public class p2_3 {
    void main(){
        IO.print("ようこそ占い館へ");
        String name = IO.readln("あなたの名前は？");
        int age = Integer.parseInt(IO.readln("あなたの年齢は？"));
        int fortune = new java.util.Random().nextInt(4);
        fortune++;
        IO.print("占いの結果が出ました。");
        IO.print(age+"歳の"+name+"さん、あなたの運気番号は"+fortune+"です。");
    }
}
