package d49;

public class Q27 {
    public static void main(String[] args){
        int[] numbers ={10,20,30};
        int sum = 0;
        //通常for文
        // 拡張for文
        for (int n:numbers){
            sum += n;
        }
        System.out.println(sum);
    }
}
// Javaは静的型付け言語
