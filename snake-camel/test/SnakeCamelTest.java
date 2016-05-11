import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class SnakeCamelTest {

	@Test
	public void abc() {
		SnakeCamelUtil scu=new SnakeCamelUtil();
		String ex="Abc";
		String act=scu.snakeToCamelcase("abc");
		assertThat(act, is(ex));
	}
	@Test
	public void ab_c_d() {
		SnakeCamelUtil scu=new SnakeCamelUtil();
		String ex="AbCD";
		String act=scu.snakeToCamelcase("ab_c_d");
		assertThat(act, is(ex));
	}
	@Test
	public void ab_c＿d() {
		SnakeCamelUtil scu=new SnakeCamelUtil();
		String ex="AbCD";
		String act=scu.snakeToCamelcase("ab_c＿d");
		assertThat(act, is(ex));
	}
	@Test
	public void _ab_c() {
		SnakeCamelUtil scu=new SnakeCamelUtil();
		String ex="AbC";
		String act=scu.snakeToCamelcase("_ab_c");
		assertThat(act, is(ex));
	}
	@Test
	public void ab__c() {
		SnakeCamelUtil scu=new SnakeCamelUtil();
		String ex="AbC";
		String act=scu.snakeToCamelcase("ab__c");
		assertThat(act, is(ex));
	}
	@Test
	public void abcDeF() {
		SnakeCamelUtil scu=new SnakeCamelUtil();
		String ex="AbcDeF";
		String act=scu.snakeToCamelcase("abcDeF");
		assertThat(act, is(ex));
	}
	
	@Test
	public void Abc() {
		SnakeCamelUtil scu=new SnakeCamelUtil();
		String ex="abc";
		String act=scu.camelToSnakecase("Abc");
		assertThat(act, is(ex));
	}
	@Test
	public void AbcDeF() {
		SnakeCamelUtil scu=new SnakeCamelUtil();
		String ex="abc_de_f";
		String act=scu.camelToSnakecase("AbcDeF");
		assertThat(act, is(ex));
	}

}
