package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		System.out.println("最初"+snake_case);
		if(snake_case.startsWith("_")){//_で始まる
			snake_case=snake_case.replaceFirst("_","");
			System.out.println("変更後"+snake_case);
		}
		for(int i=0;i<snake_case.length()-1;i++){//_が複数
			char c1=snake_case.charAt(i);
			String s1=String.valueOf(c1);
			System.out.println("s1:"+s1);
			char c2=snake_case.charAt(i+1);
			String s2=String.valueOf(c2);
			System.out.println("s2:"+s2);
			if(s1.equals("_") && s2.equals("_")){
				//System.out.println("if文");
				snake_case=snake_case.replaceFirst("_", "");
				System.out.println("変更後"+snake_case);
			}
		}
		if(snake_case.contains("＿")){//_が全角
			snake_case=snake_case.replace("＿", "_");
		}
		
		StringBuilder sb = new StringBuilder();
		String[] words = snake_case.split("_");
		System.out.println("sb:"+sb);
			for (int i = 0; i < words.length; i++) {
				System.out.println("for文");
				sb.append(capitalize(words[i]));
			}
		return new String(sb);
	}
	 
	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {//大文字だったら
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));
			}else{
				sb.append(c);
			}
		}
		System.out.println(sb);
		return new String(sb);
	}
	
	static String capitalize(String s) {
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}
	
}
