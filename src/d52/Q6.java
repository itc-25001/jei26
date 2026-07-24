package d52;

// 実行用クラス
public class Q6 {
    public static void main(String[] args){
        Drink[] dr = { // オブジェクトを配列で管理する場合このような書き方
                new Drink("Cocacola",150),
                new Drink("MrPepper",130),
                new Drink("SaltWater",320)
        }; // セミコロンを忘れずに
        VendingMachine vm = new VendingMachine(dr); // コンストラクタにdrオブジェクトを渡して、インスタンスを
        vm.display(); // 販売する飲料を一番目から順に表示する
        vm.execCom("i 100"); // 100円を投入
        vm.execCom("p 2"); // 2番目の飲料を購入
        vm.execCom("i 500"); // 500円を投入
        vm.execCom("p 3"); // 3番目の飲料を購入
        vm.execCom("c 0"); // お釣りを払い出す()
    }
}
// 清涼飲料水の名称と価格を管理し、名称と価格を表す文字列を取得するメソッドを提供
class Drink{
    private String name; // 飲料の名前
    private int price; // 価格
    Drink(String name, int price){ // インスタンス化の際に自動的に実行されるコンスタンス
        this.name = name; // メンバ変数にコンストラクタの因数を代入する際、this.をつける
        this.price = price; // 同上
    }
    public String getName() { return name; } // 名称を返す
    public int getPrice() { return price; } // 価格を返す
    public String toString(){ // 名称と価格を表す文字列を返す
        return "[" + name + "]" + price + "円"; // 例:[Cocacola]150円
    }
}

// 自動販売機をシミュレートするクラス
class VendingMachine{
    private Drink[] drinks; // 販売する飲料水を管理する配列
    private int cash = 0; // 投入額 初期値は0
    private int[] coins = {500,100,50,10}; // 自動販売機が受け付ける効果を管理
    VendingMachine(Drink[] drinks){ // コンストラクタはクラス名とメソッド名を合わせる
        this.drinks = drinks; // オブジェクト(参照型)でも基本型と同じように扱える
    }
    public void display(){ // 説明文にある形式で販売する飲料水を一番目から順に表示する
        int idx = 1; // 1番目からの初期値
        for (Drink drink : drinks){
            System.out.println("[" + idx + "]"+ drink);
            idx++; // idx = idx + 1という意味
        }
    }
    public void execCom(String command){ // 引数のコマンドを解釈し、適切な処理を行う
        String[] s = command.split(" "); // 半角スペースで分割
        switch (s[0]){ // コマンド(i,p,c)を解釈したいため
            case "i":// 投入コマンド
                if(isCoin(s[1])) cash += Integer.parseInt(s[1]); // isCoin()がtrueの処理
                break;
            case "p": // 購入コマンド
                int idx = Integer.parseInt(s[1]) -1; // 指定された番号を配列で扱えるよう-1にしている
                if(idx <= 0 || idx > drinks.length) return; // 数値情報が1未満(8以下)、またはn()
                int price = drinks[idx].getPrice(); // 選択された飲料水の価格を取得
                if(price <= cash){ // 価格(price)が投入額(cash)以下ならば
                    eject(idx); // ejectメソッドの実行(飲料水が排出されました)
                    cash -= price; //
                    payChange();
                } else{
                    System.out.println("お金が足りません。");
                }
                break;
            case "c":
                payChange();
                break;
            default:
                break;
        }
    }
    private boolean isCoin(String s){ // 引数の金額が、自動販売機が受け取るいずれかの金額に等しい場合だけで
        int c = Integer.parseInt(s);
        for(int coin : coins){
            if(c == coin) return true;
        }
        return false;
    }

private void eject(int idx){
    System.out.println(drinks[idx] + "排出されました");
}
private void payChange() {
    if (cash == 0) {
        System.out.println("お釣りなし");
        return;
    }
    String s = "お釣り";
    for (int coin : coins) {
        if (cash / coin > 0) { // 投入額cash / 扱える金額coinが0よりも大きい場合
            s += coin + "円:" + (cash / coin) + "枚 ";
            cash %= coin; // cashをcoinで割ったあまりをcashに上書き
            }
        }
        System.out.println(s);
    }
}
/*
投入額600円で320円のSaltwaterを購入した場合、お釣りは280円だが
排出されるお釣りは100円2枚　50円1枚　10円3枚　となる
100円2枚を排出した場合は80円となるが、この80円を求める際に
cash %= coin(cash = cash % coin)をしている

試験本番で(37)のような計算に時間がかかりそうな問題が出てきたら、
時間配分的に後回しにしても良いかもしれません。

また、計算問題を解く際、メモ用紙と筆記用具があると非常に便利です。
(試験本番ではjshellやテキストエディタも使えません。)
 */