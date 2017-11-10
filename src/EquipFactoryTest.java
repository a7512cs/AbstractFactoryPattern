/**
 * �⹳�u�t�Ҧ�-����
 */
public class EquipFactoryTest {

    static EquipFactory equipFactory;

    /**
     * ���դu�t�O�_�ॿ�T�Ͳ��˳�
     */
    public static void main(String[] args) {
        System.out.println("==========�⹳�u�t - ��������==========");

        // ���}�b��Ͳ��˳�
        // ArcherTrainingCamp()�̭���o�ǵ{��
        equipFactory = new ArcherEquipFactory();
        Clothes archerLeather = equipFactory.productArmor();
        Weapon archerBow = equipFactory.productWeapon();
        // �֥Ҫ����m���ӬO5�A�}��������10�A�d��10
        System.out.println("Make archerLeather def: " + archerLeather.getDef());
        System.out.println("Make archerBow atk: " + archerBow.getAtk());
        System.out.println("Make archerBow range: " + archerBow.getRange());

        // �����h�Ͳ��˳�
        // WarriorTrainingCamp()�̭���o�ǵ{��
        equipFactory = new WarriorEquipFactory();
        Clothes armor = equipFactory.productArmor();
        Weapon longSword = equipFactory.productWeapon();
        // ���Ҫ����m���ӬO10�A�}��������10�A�d��1
        System.out.println("Make armor def: " + armor.getDef());
        System.out.println("Make longSword atk: " + longSword.getAtk());
        System.out.println("Make longSword range: " + longSword.getRange());
        System.out.println();
        System.out.println();

        System.out.println("==========�⹳�u�t - ����==========");
        // �}�b��V�m��
        TrainingCamp camp = new ArcherTrainingCamp();
        // �V�m�}�b��
        Adventurer archer = camp.trainAdventurer();

        // ���h�V�m��
        camp = new WarriorTrainingCamp();
        // �V�m���h
        Adventurer warrior = camp.trainAdventurer();

        archer.display();
        warrior.display();
    }

}
