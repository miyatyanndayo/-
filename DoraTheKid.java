public class DoraTheKid extends Doraemons {
    /**
 *  this class extends Doraemons 
 * setcustume and set fraze
 */
    Setclass set = new Setclass();

    public DoraTheKid() {
        super("Dorathekid","I said you,I'll must protect you");
        this.name = "DoraTheKid";
    }
    @Override
    public void setcustume() {

        set.setcustume("gun");
        set.setcustume("hut");
    }
    
    
}