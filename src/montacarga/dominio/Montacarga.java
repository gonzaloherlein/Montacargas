package montacarga.dominio;

public class Montacarga {
	private String nombre;
	private Integer peso;
	private final Integer PESO_MAXIMO = 500;
	private Integer pesoActual;
	
	public Montacarga() {
		
	}
	
	public Montacarga(String nombre, Integer peso) {
		this.nombre = nombre;
		this.peso = peso;
		this.pesoActual = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	
	public boolean queSePuedaCargar(Integer peso){
		
		if(pesoActual < PESO_MAXIMO && (pesoActual + peso) < PESO_MAXIMO) {
			pesoActual += peso;
			return true;
		}else {
			peso = PESO_MAXIMO;
		}
		return false;
	}
	
}
