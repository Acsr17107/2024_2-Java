package ch02.sec06;

public class TextBlockExample {
	public static void main(String[] args) {
		String str1 = "" +
	    "{\n" +
		"\t\"id\":\"winter\",\n" +
	    "\t\"name\":\"������\"\n" +
		"}";
		
		String str2 = """
		{
		"id":"winter", 
		"name":"������"
		!
		""";
		
		System.out.println(str1);
		System.out.println("-----------------------------");
		System.out.println(str2);
		System.out.println("-----------------------------");
		String str = """
		���� �ڹٸ� \
		�н��մϴ�.
		���� �ڹ� ����� �� �̴ϴ�.
		""";
		System.out.println(str);
	}
}