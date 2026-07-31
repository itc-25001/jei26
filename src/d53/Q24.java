package d53;

public class Q24 {
    public static void main(String[] args){
        for (int n = 0; n < 10; n++){
            System.out.print(n + " ");
            switch (n){
                case 2:
                    n *= 3;
                    break;
                case 7:
                    n -= 3;
                    break;
                case 6:
                    n += 3;
                    break;
            }
        }
    }
}
/*
n=0 出力:0 switch該当なし
n=1 ,,1 ,,
n=2 ,,2
 */