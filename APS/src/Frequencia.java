
public enum Frequencia {
	DOIS("2x", 1), TRES("3x", 0.9), CINCO("5x", 0.8);
	
	public double getMult() {
		return mult;
	}
	
	public String getDesc() {
		return desc;
	}

	String desc;
	double mult;
	
	Frequencia(String desc, double mult) {
		this.desc = desc;
		this.mult = mult;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return desc;
	}
}