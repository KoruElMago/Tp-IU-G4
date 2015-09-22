package controladores

import Core.DueloEntreLeyendas
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable
import java.util.List
import Personaje.Personaje
import TarjetaDeDuelo.TarjetaDeDuelo
import usuario.Usuario

@Accessors
@TransactionalAndObservable

class ControladorDueloEntreLeyendas {
	
	String nombreUsuario
	String contraseñaUsuario
	String mensajeLogIn
	
	DueloEntreLeyendas del
	new(DueloEntreLeyendas del)
	{
	this.del = del
	nombreUsuario = ""
	contraseñaUsuario = ""
	mensajeLogIn = ""
		
	}
	
	
	
	
	
	//List<Personaje> personajes
	//List<TarjetaDeDuelo> buscadores
	//TarjetaDeDuelo tddBoot
	//agregado por chibi:
	//List<Usuario> usuarios; 
	
	def getPersonajes(){
		del.personajes
	}
	
	def getBuscadores(){
		del.buscadores
	}
	
	def getUsuarios(){
		del.usuarios
	}
	
	def esUsuario() {
		for(Usuario us : getUsuarios)
			{
				if(us.nombre == nombreUsuario)
					{
					return true
					}
			}
			return false
	}
	
	def esContraseña() {
		for(Usuario us : getUsuarios)
			{
				if(us.nombre == nombreUsuario)
					{
					return(us.contraseña == contraseñaUsuario)
					}
			}
			return false
	}
	
	//Se asume que el usuario existe y se logueó correctamente
	def getUsuario()
		{
		for(Usuario us : getUsuarios)
			{
				if(us.nombre == nombreUsuario)
					return us
			}
		}
	
	
	def loguear(){
		new ControladorUsuario(this.getUsuario)
	}
	
	def registrarUsuario() {
		if(esUsuario)
			{
				mensajeLogIn = "Usuario Existente"
				nombreUsuario = ""
			    contraseñaUsuario = ""
			}
					else
					if(contraseñaUsuario == "")
					{
						
						mensajeLogIn = "Escribe una contraseña"
					}
					else
					{
					val us = new Usuario(nombreUsuario, contraseñaUsuario)
					del.usuarios.add(us)
					mensajeLogIn = "Usuario creado exitosamente"
					}
		
	}
	
}