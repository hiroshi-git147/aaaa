package renshu;

public class Main {

	public static void main(String[] args) {
		Unit[] unit = new Unit[3];
		unit[0] = new Hero("ミナト");
		unit[1] = new Cleric("アヤカ");
		unit[2] = new Wizard("スガワラ");

		Monster[] monster = new Monster[3];
		monster[0] = new Slime();
		monster[1] = new Goblin();
		monster[2] = new Matango();

		boolean battle = true;
		while(battle) {
			// ランダムで勇者パーティかモンスターか行動を決める
			int r = new java.util.Random().nextInt(2);
			// 勇者パーティの行動
			if(r == 0) {
				r = new java.util.Random().nextInt(3);
				// 勇者の行動
				if(unit[r] instanceof Hero) {
					int e = new java.util.Random().nextInt(3);
					unit[r].Attack(monster[e]);
				// 聖職者の行動
				}else if(unit[r] instanceof Cleric) {
					Cleric c = (Cleric)unit[r];
					int t = new java.util.Random().nextInt(2);
					int e = new java.util.Random().nextInt(3);
					// 攻撃
					if(t == 0) {
						c.Attack(monster[e]);
					// 回復
					}else {
						c.selfAide(unit[e]);
					}
				}else if(unit[r] instanceof Wizard) {
					Wizard w = (Wizard)unit[r];
					int t = new java.util.Random().nextInt(2);
					int e = new java.util.Random().nextInt(3);
					// 攻撃
					if(t == 0) {
						w.Attack(monster[e]);
					// ファイアボール
					}else {
						w.fireBall(monster[e]);
					}
				}
			// モンスターの行動
			}else {
				// いずれかのモンスターの攻撃
				r = new java.util.Random().nextInt(3);
				int e = new java.util.Random().nextInt(3);
				monster[r].Attack(unit[e]);
			}
			// 勇者パーティの全滅確認
			int party=0;
			for(Unit u:unit) {
				if(u.getHp()==0) party++;
			}
			if(party == 3) {
				System.out.println("パーティは全滅した");
				break;
			}
			// モンスターの全滅確認
			party=0;
			for(Monster m:monster) {
				if(m.getHp()==0) party++;
			}
			if(party == 3) {
				System.out.println("敵を倒した");
				break;
			}
		}

	}

}
