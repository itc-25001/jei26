package d48;

public class Q25 {
    String code;
    public static void main(String[] args){
        Q25 obj = new Q25();
        obj.setCode("FB1257"); // objのsetCodeメソッドを使い、文字列をセットする。
    }
    void setCode(String s){
        code = s;
    }
}
/*
javaでは文字列を指定する場合 ""で囲う必要がある。
''は一文字だけchar型を扱うときに使うので、混合しないようにしましょう。
 */