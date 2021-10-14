package enumeration;

import enumeration.model.ClasseDoEnum;
import enumeration.model.enums.Enumeration;

public class Main {

	public static void main(String[] args) {
		
		ClasseDoEnum classe = new ClasseDoEnum(Enumeration.ENUMERATION_1);
		
		System.out.println(classe.getDesc());

	}

}
