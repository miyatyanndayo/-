public class WangDora extends Doraemons {
    Setclass set = new Setclass();

/**
 *  this class extends Doraemons 
 * setcustume and set fraze
 */

    public WangDora(){
        super("wangdora","Everyon csn't top my fist!");
        this.name = "WangDora";
    }

    @Override
    public void setcustume() {
        set.setcustume("kung fu uniform");
    }
}