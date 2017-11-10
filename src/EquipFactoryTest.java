/**
 * 抽像工廠模式-測試
 */
public class EquipFactoryTest {

    static EquipFactory equipFactory;

    /**
     * 測試工廠是否能正確生產裝備
     */
    public static void main(String[] args) {
        System.out.println("==========抽像工廠 - 部分測試==========");

        // 幫弓箭手生產裝備
        // ArcherTrainingCamp()裡面放這些程式
        equipFactory = new ArcherEquipFactory();
        Clothes archerLeather = equipFactory.productArmor();
        Weapon archerBow = equipFactory.productWeapon();
        // 皮甲的防禦應該是5，弓的攻擊為10，範圍為10
        System.out.println("Make archerLeather def: " + archerLeather.getDef());
        System.out.println("Make archerBow atk: " + archerBow.getAtk());
        System.out.println("Make archerBow range: " + archerBow.getRange());

        // 幫鬥士生產裝備
        // WarriorTrainingCamp()裡面放這些程式
        equipFactory = new WarriorEquipFactory();
        Clothes armor = equipFactory.productArmor();
        Weapon longSword = equipFactory.productWeapon();
        // 盔甲的防禦應該是10，弓的攻擊為10，範圍為1
        System.out.println("Make armor def: " + armor.getDef());
        System.out.println("Make longSword atk: " + longSword.getAtk());
        System.out.println("Make longSword range: " + longSword.getRange());
        System.out.println();
        System.out.println();

        System.out.println("==========抽像工廠 - 測試==========");
        // 弓箭手訓練營
        TrainingCamp camp = new ArcherTrainingCamp();
        // 訓練弓箭手
        Adventurer archer = camp.trainAdventurer();

        // 鬥士訓練營
        camp = new WarriorTrainingCamp();
        // 訓練鬥士
        Adventurer warrior = camp.trainAdventurer();

        archer.display();
        warrior.display();
    }

}
