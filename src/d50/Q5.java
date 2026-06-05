package d50;

public class Q5 {
    public static void main(String[] args){
        int[] num = new int[args.length];

        for (int i = 0; i < args.length; i++){
            num[i] = Integer.parseInt(args[i]);
        }
        int tmp; // 値を入れ替える前に一時的に使う
        for (int i =1; i < num.length; i++){ // 先頭は比較不要のためi=1から始まる
            for (int j = i -1; j>=0 && num[j] > num[j + 1]; j--){ // j=i-1から左に向かって比較
                tmp = num[j]; // num[i]
                num[j] = num[j+1]; // 右の値を左に移動
                num[j+1] = tmp; // 一次保存した値を右に移動
            }
        }
        for (int val : num){
            System.out.print(val + " ");
        }
    }
}
