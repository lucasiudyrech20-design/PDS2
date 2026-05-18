
public enum Duracao {
	MES("Mês", 1), SEMESTRE("Semestre", 1.2), ANO("Ano", 1.5);
	
	public double getMult() {
		return mult;
	}
	
	public String getDesc() {
		return desc;
	}

	String desc;
	double mult;
	
	Duracao(String desc, double mult) {
		this.desc = desc;
		this.mult = mult;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return desc;
	}
}