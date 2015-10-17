package Dominio

abstract class  Denuncia {
	
	Integer peso;
	String descripcion;
	int palabrasMinimas;
	int caracteresMinimos;
	
	
	new(String descripcion){
		this.descripcion = descripcion;
		this.validar();
		palabrasMinimas = 3;
		caracteresMinimos = 20;
	}
	
	
	
	
	
	def validar() {
	var ant = " "
	var cont = 0	
	var l = descripcion.toCharArray
		for (i : 0 ..< l.size ) {
    		if (l.get(i) != " " && ant == " "){
    			cont++;
    		}	
		}
	if ((cont > caracteresMinimos) && (descripcion.length < palabrasMinimas)){
		
	}
	}
}