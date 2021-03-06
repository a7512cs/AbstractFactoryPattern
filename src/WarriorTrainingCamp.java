/**
 * 實體工廠-鬥士訓練營
 */
public class WarriorTrainingCamp implements TrainingCamp {

    private static EquipFactory factory = new WarriorEquipFactory();

    public Adventurer trainAdventurer() {
        System.out.println("訓練一個鬥士");
        Warrior warrior = new Warrior();
        // ...進行基本訓練
        // ...鬥士訓練課程

        // 訓練完成配發裝備
        warrior.setWeapon(factory.productWeapon());
        warrior.setClothes(factory.productArmor());
        return warrior;
    }
}
