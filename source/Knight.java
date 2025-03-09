public class Knight extends Fighter {

    public Knight(int baseHp, int wp) {
        super(baseHp,wp);
    }

    @Override
    public double getCombatScore() {
        double combatScore;
        if (Utility.isSquare(Battle.GROUND)){
            combatScore = getBaseHp()*2;
        }
        else if (getWp()==1){
            combatScore = getBaseHp();
        }
        else combatScore = getBaseHp()/10.0;
        return Math.min(combatScore,999);
    }
}
