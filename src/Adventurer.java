/**
 * �_�I��
 */
public abstract class Adventurer {
    protected Weapon weapon; // �Z��
    protected Clothes clothes; // ��A

    /**
     * �ݫ_�I�̪����A
     */
    public abstract void display();

    public void setWeapon(Weapon wp) {
        weapon = wp;
    }

    public void setClothes(Clothes clth) {
        clothes = clth;
    }
    // getter & setter �ٲ�
}
