/**
 * �Z������(Product)
 */
public abstract class Weapon {
    protected int atk; // �����O
    protected int range; // �����d��

    /**
     * �i�ܪZ��
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
    // �H�U�ٲ�getter
}
