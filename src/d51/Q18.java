package d51;

public class Q18 {
    public static void main(String[] args){
        int i;
        for (i = 0; i < 9; i += 2){
            System.out.println(++i);
        }
    }
}
/*
iの変化  ++iは先にiに1足してから表示　for文の3つ目の部分は「1回の処理が終わったあと」に実行される
1回目のループ終了時:
2回目のループ終了時:
3回目のループ終了時:
 */
