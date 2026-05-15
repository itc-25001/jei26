package src.d48;

public class Q23 {
    public static void main(String[] args){
        int i = 1;
        for(;;){// 無限に繰り返される処理
            i = i +3;
            if(i < 10){
                System.out.println(i);
                continue;
            } else{
                break;
            }
            // System.out.println(i); 到達不能なのでコメントアウトした
        }
    }
}
