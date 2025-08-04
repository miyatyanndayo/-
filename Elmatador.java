public class Elmatador extends Doraemons {
    /**
 *  this class extends Doraemons 
 * setcustume and set fraze
 */
    Setclass set = new Setclass();
    

    public Elmatador() {
        super("Elmatador","Sky call me,Ground call me,People call me ! People call me to beat the bull.");
        this.name = "Elmatador";
    }

    @Override
    public void setcustume() {
        set.setcustume("mant");
        set.setcustume("roze");
    }

}