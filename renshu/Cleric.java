package renshu;

public class Cleric extends Unit {
	private int mp;

	public Cleric(String name) {
		super(name);
		this.setHp(80);
		this.setAttackPoint(20);
		this.setSavePoint(20);
		this.mp = 60;
	}
	public void selfAide(Unit u) {
		if(this.mp >= 10) {
			System.out.println(this.getName()+"はセルフエイドを唱えた");
			System.out.println(u.getName()+"のHPが50回復した");
			u.setHp(u.getHp()+50);
			this.setMp(this.mp-10);
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
