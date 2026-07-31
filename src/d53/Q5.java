package d53;

public class Q5 {
    private static int[] taxes = {8,10};
    private static int FOODS = 0;
    private static int OTHER = 1;
    public static void main(String[] args){
        int dataSize = Integer.parseInt(args[0]);
        String[] names = new String[dataSize];
        int[] prices = new int[dataSize];
        int[] nums = new int[dataSize];
        char[] types = new char[dataSize];

        int argsIdx = 1; // 繰り返しでargs[]のインデックスを指定するための変数
        // 1で初期化しているのは各商品のデータがargs[1]から入力されているため
        for(int i = 0; i < dataSize; i++){
            names[i] = args[argsIdx++]; //
            prices[i] = Integer.parseInt(args[argsIdx++]);
            nums[i] = Integer.parseInt(args[argsIdx++]);
            types[i] = args[argsIdx++].charAt(0);
        }
        System.out.println("商品名¥t 税抜き¥t 税込み¥t タイプ"); // dataSizeは2なので2回繰り返すことができる
        for (int i = 0; i<dataSize; i++){
            int zeinuki = prices[i] * nums[i];
            int zeikomi,taxType;
            taxType = types[i] == 'f' ? FOODS : OTHER; // 'f'なら0(FOODS)がtaxType
            zeikomi = zeinuki *(taxes[taxType] + 100) / 100;
            System.out.print(names[i] + "¥t" + zeinuki + "円¥t");
            System.out.println(zeikomi + "円¥t" + viewType(types[i]));
        }
    }
    private static String viewType(char c){
        return c == 'f' ? "食品党" : "その他";
    }
}
