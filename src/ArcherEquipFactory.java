/**
 * 專門生產弓箭手裝備的工廠(ConcreteFactory)
 */
public class ArcherEquipFactory implements EquipFactory{
    
    public Weapon productWeapon() {
        Bow product = new Bow();
        product.setAtk(8);
        product.setRange(10);
        return product;
    }

    public Clothes productArmor() {
        Leather product = new Leather();        
        product.setDef(5);
        return product;
    }
}
