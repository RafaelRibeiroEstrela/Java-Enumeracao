package enumeration.model;

import enumeration.model.enums.Enumeration;

public class ClasseDoEnum {
	
	private String desc;
	
	public ClasseDoEnum() {
		
	}

	public ClasseDoEnum(Enumeration enumerationDesc) {
		super();
		this.desc = enumerationDesc.getDesc();
	}
	
	public Enumeration getEnumeration() {
		return Enumeration.toEnum(desc);
	}

	public void setEnumeration(Enumeration enumeration) {
		desc = enumeration.getDesc();
	}

	public String getDesc() {
		return desc;
	}
	

	
	

}
