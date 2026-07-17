package d52;

public class Q5 {
    public static void main(String[] args){
        String majors = "+----";
        int LIMIT = 400;
        if (args.length == 0) return; // 1:整数値が一つも指定されていないときはプログラム
        int max = 0, i = 0;
        int[] data = new int[args.length];
        for(String s : args){
            data[i] = Integer.parseInt(s); // コマンドライン引数を整数に変換
            if (data[i] <= 0 || data[i] >= LIMIT) return; // 1:0以下、400異常の場合は終了　(1以上400未満)
            if (max < data[i]) { // 指定された整数の中から最大値maxを求める
                max = data[i];
            }
            i++;
        }

        // 目盛り表示
        int majormax = (max -1) / 5 +1; // メモリを表示する際につかうmajormaxの計算、詳しくは後述
        System.out.print("  "); // メモリを表示する際の調整用インデント
        for(i = 0; i < majormax; i++){
            System.out.println(majors.charAt(i % 5)); // charAt()メソッドを使って目盛りを出力
        }
        System.out.println(""); // 改行

        // グラフ表示
        for(i = 0; i < data.length; i++){
            System.out.printf("%4d : ", data[i]); // printf()メソッドのフォーマット指定子%4dは4桁の整数右揃え
            int n = (data[i] - 1) / 5 + 1; // (32)詳しくは後述
            for (int j = 0; j < n; j++){
                System.out.println('*');
            }
            System.out.println("");
        }
    }
}
/*
(32)とmajormaxの解説
data[i]が5の倍数のときdata[i]をそのまま計算に使うとグラフの表示がずれる
例) 5 / 5 + 1 = 2 ←2つの*が表示されてしまう
これを適切な表示に調整するため
例) (5-1) / 5 + 1 = 1 ←1つの"*"が表示されることになり、これはOK
としている、5の倍数以外の値でも
例) (3-1) / 5 + 1 = 1 ←1つの"*"が表示されこれもOKとなる。
 */