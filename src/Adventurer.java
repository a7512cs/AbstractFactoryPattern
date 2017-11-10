/**
 * 冒險者
 */
public abstract class Adventurer {
    protected Weapon weapon; // 武器
    protected Clothes clothes; // 衣服

    /**
     * 看冒險者的狀態
     */
    public abstract void display();

    public void setWeapon(Weapon wp) {
        weapon = wp;
    }

    public void setClothes(Clothes clth) {
        clothes = clth;
    }
    // getter & setter 省略
}
