/**
 * �W�礶��(Product)
 */
public abstract class Clothes {
    protected int def; // ���m�O

    /**
     * �i�ܳo���A
     */
    public void display() {
        System.out.println(this.getClass().getSimpleName() + " def = " + def);
    }

    public void setDef(int n) {
        def = n;
    }

    public int getDef() {
        return def;
    }
    // �H�U�ٲ�getter
}
