package comunicacion;

public class Alfabeto extends Pictograma {
	  private static  String [] letras= {"A"+", "+"B"+", "+"C"+", "+"D"+", "+"E"+", "+"F"+", "+"G"+", "+"H"+", "+"I"+", "+"J"+", "+"K"+", "+"L"+", "+"M"+", "+"N"+", "+"O"+", "+"P"+", "+"Q"+", "+"R"+", "+"S"+", "+"T"+", "+"U"+", "+"V"+", "+"W"+", "+"X"+", "+"Y"+", "+"Z"};
	 private String interpretacion;
	 
	 
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	
	public int getcantidadLetras() {
		
		return letras.length;
		
	}
	public String interpretacion(){
		return this.interpretacion ;
		
	}
	
	
	public static String[] getLetras() {
		return letras;
	}
	public static void setLetras(String[] letras) {
		Alfabeto.letras = letras;
	}
	
	
	public Alfabeto(String origen, String interpretacion) {
		super(origen);
		this.interpretacion = interpretacion;
	}
	@Override
	public String toString() {
		return "A"+", "+"B"+", "+"C"+", "+"D"+", "+"E"+", "+"F"+", "+"G"+", "+"H"+", "+"I"+", "+"J"+", "+"K"+", "+"L"+", "+"M"+", "+"N"+", "+"O"+", "+"P"+", "+"Q"+", "+"R"+", "+"S"+", "+"T"+", "+"U"+", "+"V"+", "+"W"+", "+"X"+", "+"Y"+", "+"Z";
		
	}
	
	
	
	


}
