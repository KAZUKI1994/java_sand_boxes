# Java tutorial

## Chapter2 Hello World
```
public class Main {
	public static void main(String[] args) throws Exception {
        System.out.println("Hello World");
	}
}
```
- println()
1. println()の中に、適当な文字を代入する。 …入力
2. 文字をコンピュータが理解できる形に変換する。 …処理
3. 画面に文字が表示される。 …出力


### Chaper4 数の表示とサイコロ

```
public class Main {
	public static void main(String[] args) throws Exception {
		double rand = Math.random()*100 + 1;
		int number = (int)rand;
		System.out.println("スライムが" + number + "匹あらわれた");
	}
}
```
- Java randomメソッド->0〜1未満の小数点以下の数値をランダムに出力する。
- (int)によってdouble型からint型に変換。

### データ型
Javaでは、演算時にデータ型があっていない場合に自動的に変換する場合がある。
