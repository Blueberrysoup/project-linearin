
public class Main {

	public static void main(String[] args) {
		LinearIn li = new LinearIn();
		int[] outer = {-2,4,8,11,37};
		int[] inner = {4,11};
		System.out.println("Första resultatet (true): " + li.linearIn(outer, inner));
		
		int[] inner2 = {-5,11,37};
		System.out.println("Andra resultatet (false): " + li.linearIn(outer, inner2));

		int[] inner3 = {4,8,11,36};
		System.out.println("Tredje resultatet (false): " + li.linearIn(outer, inner3));
		
		int[] inner4 = {-2,4,8,11,36,37};
		System.out.println("Fjärde resultatet (false): " + li.linearIn(outer, inner4));

		int[] inner5 = {11};
		System.out.println("Femte resultatet (true): " + li.linearIn(outer, inner5));
}

}
