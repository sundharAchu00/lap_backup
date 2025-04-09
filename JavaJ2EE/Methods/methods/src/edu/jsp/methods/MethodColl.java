package edu.jsp.methods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MethodColl {
		ArrayList m1() {
			ArrayList al=new ArrayList();
			al.add("tom");
			al.add('j');
			al.add(26.43);
			al.add(true);
			return al;
		}
		HashSet m2() {
			HashSet s=new HashSet();
			s.add("tom");
			s.add('j');
			s.add(26.43);
			s.add(true);
//			s.clear();
			return s;
		}
		Map<Integer,String> m3() {
			HashMap<Integer,String>m=new HashMap();
			m.put(001, "abinesh");
			m.put(002, "sundhar Raj");
			m.put(003, "dinesh");
			m.put(004,"jagan");
			return m;
		}
}
