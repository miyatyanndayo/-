public class Signature_frase extends Setclass {

    DoraTheKid   doraTheKid   = new DoraTheKid();
    Dorametthard dorametthard = new Dorametthard();
    Doraemon     doraemon     = new Doraemon();
    Dorarinyo    dorarinyo    = new Dorarinyo();
    Doranicof    doranicof    = new Doranicof();
    Elmatador    elmatador    = new Elmatador();
    WangDora     wangDora     = new WangDora();
//これらはDoraemonsの子クラス

    Doraemons[] myArray1 = {
    doraemon,
    dorarinyo, 
    doranicof,
    doraTheKid, 
    dorametthard,
    elmatador, 
    wangDora,
    };
    //Doraemons型の子クラスを格納する配列


        void getsignaturefrase() {
            for (Doraemons dora : this.myArray1) {
    //Doraemons型の変数doraに子クラスを代入
            System.out.println(dora.getsignaturefrase());
    //Doraemons型の子クラスのgetsignaturefraseメソッドを呼び出す
        }
    }
}