package entidades;

public class Vendedor extends Empleado {
	private Float porcenComision;
	private Float totalVentas;
	
	public Float getPorcenComision() {
		return porcenComision;
	}
	public void setPorcenComision(Float porcenComision) {
		this.porcenComision = porcenComision;
	}
	public Float getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(Float totalVentas) {
		this.totalVentas = totalVentas;
	}
	
}
