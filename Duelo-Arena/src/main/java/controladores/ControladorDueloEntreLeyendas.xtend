package controladores

import Core.DueloEntreLeyendas
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable
import java.util.List
import Personaje.Personaje
import TarjetaDeDuelo.TarjetaDeDuelo
import usuario.Usuario
import Exepcion.UsuarioExisteException
import Exepcion.ContraseñaIncorrectaException
import Exepcion.UsuarioNoExisteException

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
		
					return new ControladorUsuario(this.getUsuario, del)
			}
				
				
			
	
	def registrarUsuario() {
		try{
			del.agregarUsuario(nombreUsuario, contraseñaUsuario)
			mensajeLogIn = "Usuario creado exitosamente"
			}
			catch(UsuarioExisteException e){
			mensajeLogIn = e.toString()
		}
		
		}
	
	def puedoLoguear(){
		if(nombreUsuario == "" )
				{
				mensajeLogIn = "Usuario vacio"
				return false
				}
				else
					{
					for(Usuario us : del.usuarios)
							{
							if(us.nombre == nombreUsuario)
									{
									if(us.contraseña == contraseñaUsuario)
										{
										return true	
										}	
										else
										{	
										mensajeLogIn = "Contraseña incorrecta"
										return false	
										}
									
									
									}
							}
							mensajeLogIn = "Usuario no existe"
							return false
					}
	}
			
}