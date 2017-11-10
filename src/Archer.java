/**
 * 弓箭手
 */
public class Archer extends Adventurer {

    public void display() {
        System.out.println("我是弓箭手，裝備:");
        weapon.display();
        System.out.println();
        clothes.display();
        System.out.println();

    }
}
