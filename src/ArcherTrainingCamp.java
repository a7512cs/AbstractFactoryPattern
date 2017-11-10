/**
 * ����u�t-�}�b��V�m��
 */
public class ArcherTrainingCamp implements TrainingCamp {

    private static EquipFactory factory = new ArcherEquipFactory();

    public Adventurer trainAdventurer() {
        System.out.println("�V�m�@�Ӥ}�b��");
        Archer archer = new Archer();
        // ...�i��򥻰V�m
        // ...�}�b��V�m�ҵ{
        // �V�m�����t�o�˳�
        archer.setWeapon(factory.productWeapon());
        archer.setClothes(factory.productArmor());
        return archer;
    }
}
