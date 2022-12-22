public class Hero {
    private int heroesHealth;
    private int heroesDamage;
    private String heroesAbility;

    public Hero(int heroesHealth, int heroesDamage, String heroesAbility) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
        this.heroesAbility = heroesAbility;
    }

    public Hero(int heroesHealth, int heroesDamage) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
    }

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public String getHeroesAbility() {
        return heroesAbility;
    }

    @Override
    public String toString() {
        return "Hero" +
                "heroesHealth: " + heroesHealth +
                ", heroesDamage: " + heroesDamage +
                ", heroesAbility: '" + heroesAbility + '\'' ;
    }
}
