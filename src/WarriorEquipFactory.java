/**
 * �M���Ͳ����h�˳ƪ��u�t(ConcreteFactory)
 */
public class WarriorEquipFactory implements EquipFactory{
    
    public Weapon productWeapon() {
        LongSword product = new LongSword();
        product.setAtk(10);
        product.setRange(1);
        return product;
    }

    public Clothes productArmor() {
        Armor product = new Armor();
        product.setDef(10);
        return product;        
    }
}
