/**
 * �M���Ͳ��}�b��˳ƪ��u�t(ConcreteFactory)
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
