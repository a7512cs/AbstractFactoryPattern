/**
 * ����u�t-���h�V�m��
 */
public class WarriorTrainingCamp implements TrainingCamp {

    private static EquipFactory factory = new WarriorEquipFactory();

    public Adventurer trainAdventurer() {
        System.out.println("�V�m�@�Ӱ��h");
        Warrior warrior = new Warrior();
        // ...�i��򥻰V�m
        // ...���h�V�m�ҵ{

        // �V�m�����t�o�˳�
        warrior.setWeapon(factory.productWeapon());
        warrior.setClothes(factory.productArmor());
        return warrior;
    }
}
