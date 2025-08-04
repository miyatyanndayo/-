import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public abstract class Doraemons {
    protected  String name ;
    private Random random = new Random();
    protected int num;
    List<String> cus = new ArrayList<String>();
    
    public abstract void setcustume();
    String signature_frase[]  = {"Bestfriends telefonecard!",null};
        
    public Doraemons(String name, String phrase) {
        this.name = name;
        this.signature_frase[1] = phrase;
    }

    public void Setclass(){
        String signature_frase[]  = {"Bestfriends telefonecard!",null};
    }
        
            

//say random phrase
    String getsignaturefrase() {
    
        num = random.nextInt(2);
        return signature_frase[num];
    }

        
}
    


    //Listを取り出すときはArray name.get(1)
