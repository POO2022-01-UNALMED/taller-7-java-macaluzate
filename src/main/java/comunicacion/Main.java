package comunicacion;

public class Main {
	public static void main(String[] args) {
		Libro l=new Libro("Pensamiento","La tortuga","Mateo",100,"Canavera","Penguin","lele","pormi");
		Tesis t=new Tesis("Pensamiento expansivo", "Recomendador", "Alejandro", 20, "Recomendar asignaturas", new String [] {"Primero", "Segundo"},
				"Se hace trabajo futuro", "[1] Maquinaria",  "Escrito investigativo");
		Fabula f= new Fabula("Pensamiento","La tortuga y la liebre","Esopo",2,"no se debe uno burlar de los demás,ni presumir o ser vanidoso","Cuento corto");
		System.out.println(t);
		
		
	}

}
