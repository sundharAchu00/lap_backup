package arraysPractice;

public class P4 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 1, 2, 2, 5, 6, 7, 3 };
		int res[] = new int[a.length];
		int visited = -1, count = 1;
		for (int i = 0; i < a.length; i++) {
			count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					res[j] = visited;
				}
			}
			if (res[i] != visited) {
				res[i] = count;
			}
		}
		for (int i = 0; i < res.length; i++) {
			if (res[i] != visited) {
				System.out.println(a[i] + "-" + res[i]);
			}
		}
	}
}
