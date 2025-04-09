package mapApis;

import java.util.HashMap;
import java.util.Map;

public class M1 {
	public static void main(String[] args) {
		Map cricketer=new HashMap();
		System.out.println(cricketer);
		cricketer.put("name", "dhoni");
		cricketer.put("jeseyNo", "7");
		cricketer.put("role", "Captain");
		cricketer.put("position", "5");
		System.out.println(cricketer);
		System.out.println(cricketer.get("name"));
		cricketer.remove("jeseyNo");
		System.out.println(cricketer);
		
	}
}
