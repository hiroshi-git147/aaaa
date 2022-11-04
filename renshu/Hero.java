package renshu;

public class Hero extends Unit {

	public Hero(String name) {
		super(name);
		this.setHp(100);
		this.setAttackPoint(100);
		this.setSavePoint(30);
	}

}
