package d49;

public class Q18kadai {
    public static void main(String[] args){
        int total = 75;
        int capacity = 30;
        int cargo = 2;

        System.out.println(total / capacity * (double)cargo);
    }
}
/*
まず、total/capacityで小数点以下切り捨てるので、答えは2。次にcargoをdouble型にして掛け算すると4.0になる。
 */
