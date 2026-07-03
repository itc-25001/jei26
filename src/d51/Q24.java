package d51;

public class Q24 {
    public static void main(String[] args){
        for(int x = 1; x < 20; x++){
            if (x%2 == 0 || x % 5 == 0){
                System.out.print(x+", ");
            }
        }
    }
}
/*
実際の試験ではこのように書いていくと解きやすいかも
3,5,6,9,10,12,15,18

x%3 == 0 || x % 5 == 0
は3の倍数　または　5の倍数

演習
変数や倍数を変更したりして遊んでみましょう。
 */
