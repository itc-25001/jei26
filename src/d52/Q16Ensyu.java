package d52;

// 実行用クラス
public class Q16Ensyu {
    static void main(String[] args) {
        Animal animal = new Animal(); // 親クラスAnimalのインスタンス化
        Animal tama = new Cat(); // 継承した子クラスCatのインスタンス化
        Horse ao = new Horse(); // 参照型をHorseにしても継承できるか（がこの場合インスタンスの汎用性は低くなる）

        animal.bark(); // Animalクラスのbark()メソッドが実行された
        tama.bark(); // ちゃんと継承されていることがわかる
        ao.bark(); // 参照型をHorseにしても継承できる
        ao.hello(); // 親クラスのメソッドも呼び出せる
    }
}

class Animal{ // 継承されているクラス（親クラス）
    public void bark(){
        System.out.println("動物");
    }
    public void hello(){
        System.out.println("hello from Animal");
    }
}

class Cat extends Animal{ // 継承するにはextends Animalをつける
    public void bark(){ // 親クラスのbark()をオーバーライド（上書き）→ポリモフィズムを実現
        System.out.println("にゃーん");
    }
}

class Horse extends Animal{ // 継承するにはextends Animalをつける
    public void bark(){
        System.out.println("ひひーん");
    }
}
