package d52;

public class Q24Ensyu {
    public static void main(String[] args){
        int[] nums = {-5,8,3,0,9,-1};
        for(int n : nums){
            n *= 2;
        }
        for(int n : nums){
            System.out.print(n + ":");
        }
    }
}
/*
ループ外でもnを使うには
通常のforに変更し、変数宣言をforの外で行う
 */