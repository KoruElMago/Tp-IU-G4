package aplicacion

import Core.DueloEntreLeyendas
import Jugador.Estadisticas
import Personaje.Personaje
import TarjetaDeDuelo.Linea
import TarjetaDeDuelo.TarjetaDeDuelo
import controladores.ControladorDueloEntreLeyendas
import java.util.ArrayList
import usuario.Usuario
import windowLogIn.WindowLogIn

class AplicacionDueloEntreLeyendas {
	
		def static main(String[] args){
		val del = new DueloEntreLeyendas()
		//val user = new Usuario("Usario92", "abc123" , "TeemoTiamat" )
		val user = new Usuario("unUsuario", "abc123" )
		
		
		val ashe = new Personaje("Ashe" , Linea.Bottom, new ArrayList, new ArrayList)
		val amumu = new Personaje("Amumu" , Linea.Jungle, new ArrayList, new ArrayList)
		val orianna = new Personaje("Orianna" , Linea.Mid, new ArrayList, new ArrayList)
		val annie = new Personaje("Annie" , Linea.Mid, new ArrayList, new ArrayList)
		val raven = new Personaje("Raven" , Linea.Top, new ArrayList, new ArrayList)
		
		del.personajes.add(ashe)
		del.personajes.add(amumu)
		del.personajes.add(orianna)
		del.personajes.add(annie)
		del.personajes.add(raven)
		
		val est1 = new Estadisticas(ashe)
		val est2 = new Estadisticas(amumu)
		val est3 = new Estadisticas(orianna)
		val est4 = new Estadisticas(annie)
		val est5 = new Estadisticas(raven)
		
		
		
		user.jugador.estadisticas.add(est1)
		user.jugador.estadisticas.add(est2)
		user.jugador.estadisticas.add(est3)
		user.jugador.estadisticas.add(est4)
		user.jugador.estadisticas.add(est5)
		
		
		
		del.usuarios.add(user)
		
		val user2 = new Usuario("usuario2", "123")
		
		user2.jugador.estadisticas.add(est1)
		user2.jugador.estadisticas.add(est2)
		user2.jugador.estadisticas.add(est3)
		user2.jugador.estadisticas.add(est4)
		user2.jugador.estadisticas.add(est5)
		
		val user3 = new Usuario("usuario3", "123")
		
		user3.jugador.estadisticas.add(est1)
		user3.jugador.estadisticas.add(est2)
		user3.jugador.estadisticas.add(est3)
		user3.jugador.estadisticas.add(est4)
		user3.jugador.estadisticas.add(est5)
		
		//TarjetaDuelo
		val t1 = new TarjetaDeDuelo(amumu, user.jugador, Linea.Bottom)
		val t2 = new TarjetaDeDuelo(ashe, user2.jugador, Linea.Mid)  
		
		del.buscadores.add(t1)
		del.buscadores.add(t2)
		
		
		
		new WindowLogIn(new ControladorDueloEntreLeyendas(del)).startApplication
		
	}
}