
public class Dorametthard extends Doraemons {
/**
 *  this class extends Doraemons 
 * setcustume and set fraze
 */
    Setclass set = new Setclass();
    
    public Dorametthard() {
        super("Dorametthard","Desert Oasis is in my hert");
        this.name = "Dorametthard";
    }
    
    @Override
    public void setcustume() {
        set.setcustume("hut");
        set.setcustume("flying carpet");
    }
}
