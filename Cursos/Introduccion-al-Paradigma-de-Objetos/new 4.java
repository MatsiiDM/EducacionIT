//vendedores, cajeros, administrativos
public class Empleado(){
	calcularSueldo(){
		if (tipo == "Empleado" ){
		sueldoacobrar = sb + ant + hsextras - jub - obsocial;
		}
		
		if (tipo == "Vendedor" ){
		sueldoacobrar = sb + ant + hsextras - jub - obsocial;
		}
		
		if (tipo == "Cajero" ){
		sueldoacobrar = sb + ant + hsextras - jub - obsocial;
		}
		
		if (tipo == "Administrativo" ){
		sueldoacobrar = sb + ant + hsextras - jub - obsocial;
		}
		
	}

}


public class Empleado(){
	calcularSueldo(){
		sueldoacobrar = sb + ant + hsextras - jub - obsocial;	
	}

}
//MANERA 1
public class Vendedor extends Empleado(){
	@Override
	calcularSueldo(){
		sueldoacobrar = sb + ant + hsextras + com - jub - obsocial;	
	}

}
// MANERA 2
public class Cajero extends Empleado(){
	@Override//SOBREESCRIBIRLO
	calcularSueldo(){//EJECUTAR METODO DE SU CLASE PADRE
		super.calcularSueldo();
		sueldoacobrar += fallo;//MODIFICARLE 
	}

}


public class Administrativo extends Empleado(){
	calcularSueldo(){
		sueldoacobrar = sb + ant + hsextras + fallo - jub - obsocial;	
	}

}


//Atributo de Instancia: Cada objeto le puede asignar su propio valor.

//Atributo de Clase: Pertenece a una clase es decir que son atributos compartidos por todos los objetos.