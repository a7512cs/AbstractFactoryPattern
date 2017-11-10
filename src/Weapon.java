/**
 * 武器介面(Product)
 */
public abstract class Weapon {
    protected int atk; // 攻擊力
    protected int range; // 攻擊範圍

    /**
     * 展示武器
     */
    public void display() {
        System.out.println(this.getClass().getSimpleName() + " atk = " + atk + " , range = " + range);
    }

    public void setAtk(int n) {
        atk = n;
    }

    public void setRange(int n) {
        range = n;
    }

    public int getAtk() {
        return atk;
    }

    public int getRange() {
        return range;
    }
    // 以下省略getter
}
