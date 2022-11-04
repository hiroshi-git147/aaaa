package renshu;

public abstract class Monster {
	private String name;		//名前
	private int hp;				//HP
	private int attackPoint;	//攻撃力
	private int savePoint;		//防御力

	public Monster(String name) {
		this.name = name;
		this.hp = 100;
		this.attackPoint = 50;
		this.savePoint = 30;
	}
	public void Attack(Unit m) {
		if(this.hp > 0) {
			int damage = this.getAttackPoint() - m.getSavePoint();
			System.out.println(this.getName()+"の攻撃");
			System.out.println(m.getName()+"は"+damage+"ポイントのダメージを受けた");
			m.setHp(m.getHp()-damage);
			if(m.getHp() == 0) {
				System.out.println(m.getName()+"は倒れ動けなくなった！");
			}
		}else {
			System.out.println(this.getName()+"は動かない！");
		}
	}
	public String getName() {
		return this.name;
	}
	public void setHp(int hp) {
		if(hp < 0)hp=0;
		this.hp = hp;
	}
	public int getHp() {
		return this.hp;
	}
	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}
	public int getAttackPoint() {
		return this.attackPoint;
	}
	public void setSavePoint(int savePoint) {
		this.savePoint = savePoint;
	}
	public int getSavePoint() {
		return this.savePoint;
	}

}
