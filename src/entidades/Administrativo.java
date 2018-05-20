package entidades;

public class Administrativo extends Empleado {
	private Float hsExtra;
	private Float hsMes;
	
	public Float getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(Float hsExtra) {
		this.hsExtra = hsExtra;
	}
	public Float getHsMes() {
		return hsMes;
	}
	public void setHsMes(Float hsMes) {
		this.hsMes = hsMes;
	}
	public Float getHsTotales() {
		return this.hsMes + this.hsExtra;
	}

}
