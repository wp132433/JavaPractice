package org.dimigo.oop;

public class IdolGroup {
	public static void main(String[] args) {
		String[] idol_group_names = {	"빅뱅",
										"2NE1",
										"걸스데이"	};
		String[][] members = {	{"GD", "sun", "bigstar", "top", "victory"},
								{"cl", "chip dara bac", "bac spring", "min mouse"},
								{"u ra", "he ri", "cow zin", "min a"}				};
		
		int i = 0;
		
		for(String group_name : idol_group_names) {
			System.out.println("<< " + group_name + " 맴버 >>");
			for(String name : members[i]) {
				System.out.println(name);
			}
			i++;
		}
	}
}
