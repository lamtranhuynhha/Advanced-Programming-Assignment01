public class Paladin extends Knight {
	public Paladin(int baseHp, int wp) {
		super(baseHp, wp);
	}

	@Override
	public double getCombatScore() {
		int baseHP=getBaseHp();
		if (Utility.isFibonacci(baseHP) && Utility.getFibonacciIndex(baseHP)>2){
			return 1000+ Utility.getFibonacciIndex(baseHP);
		}
		return baseHP*3;
	}
}
