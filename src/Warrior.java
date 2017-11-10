/**
 * 鬥士
 */
public class Warrior extends Adventurer {

    public void display() {
        System.out.println("我是鬥士，裝備:");
        weapon.display();
        System.out.println();
        clothes.display();
        System.out.println();
    }
}
