public class Warrior extends Fighter {

    public Warrior(int baseHp, int wp) {
        super(baseHp, wp);
    }

    @Override
    public double getCombatScore() {
        double combatScore;
        if (Utility.isPrime(Battle.GROUND)){
            combatScore = getBaseHp()*2;
        }
        else if (getWp()==1){
            combatScore = getBaseHp();
        }
        else combatScore = getBaseHp()/10.0;
        return Math.min(combatScore,999);
    }
}
