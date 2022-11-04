package renshu;

public class Wizard extends Unit {
	int mp;
	public Wizard(String name) {
		super(name);
		this.setHp(50);
		this.setAttackPoint(10);
		this.setSavePoint(10);
		this.mp = 100;
	}
	public void fireBall(Monster m) {
		if(this.mp >= 25) {
			int damage = 150 - m.getSavePoint();
			System.out.println(this.getName()+"はファイアボールを放った");
			System.out.println(m.getName()+"は"+damage+"ポイントのダメージを受けた");
			m.setHp(m.getHp()-damage);
			this.setMp(this.mp-25);
		}else {
			System.out.println(this.getName()+"のMPが足りません");
		}
	}
	public void setMp(int mp) {
		// 0未満（マイナス）にしない
		if(mp < 0) mp = 0;
		this.mp = mp;
	}

}
