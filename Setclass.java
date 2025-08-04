import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * コスチュームをセットとゲットするメソッド
 */
public  class Setclass  {
    Random random = new Random();
    int num ;
    
    String signature_frase[]  = {"Bestfriends telefonecard!",null};
        
    List<String> cus = new ArrayList<String>();

    public void Setclass(){
        String signature_frase[]  = {"Bestfriends telefonecard!",null};
    }
    /**
     * set signaturefrase method
     */
    public void setsignaturefrase(String frase1){
        signature_frase[1] = frase1;
    }
    
    /**
     * コスチュームをセットするメソッド
     */
    public void setcustume (String cus1){
        cus.add(cus1);
    }
    
    /**
     * コスチュームをゲットするメソッド
     */
    public void getcustume(){
        for(String i : cus){
            System.out.print(i);
        }
    }    
}