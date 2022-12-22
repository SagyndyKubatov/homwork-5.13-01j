public class Main {


    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setBossHealth(900);
        boss.setBossDamage(80);
        boss.setBossDefenceType("lightning");
        System.out.println( "BoosDamage:" + boss.getBossDamage());
        System.out.println("BossHealth:" + boss.getBossHealth());
        System.out.println("BossDefenceType:" + boss.getBossDefenceType());
        System.out.println();

        for (Hero hero: createHeroes()
             ) {
            System.out.println(hero.toString());
        }
    }

        public static Hero[] createHeroes () {
            Hero hero1 = new Hero(250, 50, "Physical");
            Hero hero2 = new Hero(200, 60, "Magical");
            Hero hero3 = new Hero(230, 40);
            return new Hero[]{hero1,hero2,hero3} ;

    }
}