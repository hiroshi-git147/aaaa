package kazuate;

public class Kazuate{
    public static void main(String[] args){
    	int[] comArray = comGuess(4);
//    	int user = getUserNumber();
//    	System.out.println(user);
    	for(int i = 0; i < comArray.length; i++) {
    		System.out.print(comArray[i]);
    	}

     }


    // コンピューターが無作為に作成した４桁の数字メソッド
    public static int[] comGuess(int size) {
    	int count = 4;
    	// 10個の要素を持つ配列を作成
    	int[] comNum = new int[size];

    	// 4回繰り返す
        for(int i = 0; i < count; i++) {

	        Loop: while(true) {
	        	// trueの場合0～9の数字を生成
	        	comNum[i] = new java.util.Random().nextInt(9);

	        	for(int j = 0; j < i; j++) {
	        		// その前までの数値が同じ数値の場合数値代入からやり直し
	        		if(comNum[j] == comNum[i]) continue Loop;
	        	}
	        	break;
	        }

        }

        return comNum;

    }

//    public static int getUserNumber() {
//    	Scanner sc = new Scanner(System.in);
//    	System.out.println("4桁の数字を入力してください");
//    	int user;
//    	while(true) {
//    		try {
//	    		user = sc.nextInt();
//	    		break;
//	    	} catch(Exception e) {
//				System.out.println("数字を入力してください");
//				sc.next();
//	    	}
//    	}
//
//    	return user;
//    }
}