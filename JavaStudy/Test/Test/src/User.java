
public class User extends Super{
	String a = "B";
	public void sample() {
		String a = "C";
//		以下のキーワードを付け替えた時に、出力がどうなるか確認してくださいませ！！
//		[this, super, キーワード無し]
		System.out.println(this.a);
	};
}
