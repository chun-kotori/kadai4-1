package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Main {

	public static void main(String[] args) {
		SnakeCamelUtil scu=new SnakeCamelUtil();
		
		//act（実行結果）とex（予測）が一致するかどうか
		String ex1="AbC";
		String act1=scu.snakeToCamelcase("_ab_c");
		System.out.println(act1);
		
		String ex2="abc_de_f";
		String act2=scu.camelToSnakecase("AbcDeF");
		System.out.println(act2);
	}

}
