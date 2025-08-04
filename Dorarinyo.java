public class Dorarinyo extends Doraemons {
    /**
 *  this class extends Doraemons 
 * setcustume and set fraze
 */

    Setclass set = new Setclass();
    public Dorarinyo() {
        
        super("Dorarinyo","Amigo");
        this.name = "Dorarinyo";
    }
    @Override
    public void setcustume() {
        set.setcustume("soccer uniform");
    }

}