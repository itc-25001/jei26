package d52;

public class Q22 {
    public static void main(String[] args){
        for(int i = 1; i <= 10; i++){
            switch (i%3){
                case 0:
                    System.out.println(i+ "3の倍数");
                    break;
                    default: // defaultは省略することもでき、その場合,何も実行されない
                    System.out.println(i); // caseが当てはまらない場合、動く
                    break;
            }
        }
    }
}
// defalutはどのcaseも実行されなかったときにされる処理