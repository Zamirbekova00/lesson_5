public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(10);
        boss.setDamage(5);
        boss.setProtectionType("Shield");
        System.out.println("Health Boss "  + boss.getHealth() + " damage " + boss.getDamage() +
                " and protection type: " + boss.getProtectionType()  );

    }
}
