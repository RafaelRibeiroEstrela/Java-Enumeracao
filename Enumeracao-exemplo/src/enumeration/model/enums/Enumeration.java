package enumeration.model.enums;

public enum Enumeration {
	
	ENUMERATION_1(1, "Enum 1");

	private int cod;
	private String desc;

	private Enumeration(int cod, String desc) {
		this.cod = cod;
		this.desc = desc;
	}

	public int getCod() {
		return cod;
	}

	public String getDesc() {
		return desc;
	}

	public static Enumeration toEnum(String desc) {

		if (desc == null) {
			return null;
		}

		for (Enumeration index : Enumeration.values()) {

			if (desc.equals(index.getDesc())) {
				return index;
			}
		}

		throw new IllegalArgumentException("Enum inválido: " + desc);
	}

	public static Enumeration toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}

		for (Enumeration index : Enumeration.values()) {

			if (cod == index.getCod()) {
				return index;
			}
		}

		throw new IllegalArgumentException("Enum inválido: " + cod);
	}

}
