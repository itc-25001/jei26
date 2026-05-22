package d48;

public class Q26 {
    public static void main(String[] args){
        int i = 0, sum = 0;
        while(++i < 8){
            sum += i;
        }
        System.out.print(sum);
    }
}
/*
動きの確認
1回目: iが0から1に増える → 1 < 8　はOK → sumに1を足す
iが8未満のものはすべて足す。
よって　1から7まですべて足す。
++i 使う前に1増やす
i++ 使ったあとに1増やす
 */
