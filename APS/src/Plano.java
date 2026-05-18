
public enum Plano {
	BASICO("Básico", 80), INTERMEDIARIO("Intermediário", 120), PREMIUM("Premium", 180);
	
	public double getMult() {
		return mult;
	}
	
	public String getDesc() {
		return desc;
	}

	String desc;
	double mult;
	
	Plano(String desc, double mult) {
		this.desc = desc;
		this.mult = mult;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return desc;
	}
}