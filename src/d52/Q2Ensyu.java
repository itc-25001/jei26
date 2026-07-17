package d52;

// 演習用の実行クラスを追加(このクラスを新規に作成)
public class Q2Ensyu {
    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        String s = cooker.getSteak();
        System.out.println(s);
    }
}

// 各クッキングデータを保管・出力するためのクラス
class Cooking{
    private String name;
    private int time;
    Cooking(String name, int time){
        this.name = name;
        this.time = time;
    }
    public String getName(){ return name; }
    public int getTime(){ return time; }
}

// Cookingインスタンスに料理データを投入し、保持・管理するクラス
class Cooker{
    private Cooking c1 = new Cooking("ステーキ", 20);
    private Cooking c2 = new Cooking("ミニサラダ", 10);

    // 文字列「ステーキ」を返すためのメソッド
    public String getSteak(){ return c1.getName(); } // この行を新たに追加
}
