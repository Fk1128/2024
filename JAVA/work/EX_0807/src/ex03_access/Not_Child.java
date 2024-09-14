package ex03_access;

import ex02_modifier.Parent;

public class Not_Child {
	void accessTest() {

		Parent p2 = new Parent();

		p2.accessProtected();

	}
}
