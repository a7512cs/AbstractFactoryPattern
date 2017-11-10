/**
 * 上衣介面(Product)
 */
public abstract class Clothes {
    protected int def; // 防禦力

    /**
     * 展示這件衣服
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
    // 以下省略getter
}
