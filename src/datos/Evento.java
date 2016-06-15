package datos;

import java.util.GregorianCalendar;
import java.util.Set;

import funciones.Funciones;

public class Evento {

	private long idEvento;
	private String evento;
	private GregorianCalendar fecha;
	private Set<Cliente> clientes;

	public Evento() {
	}

	public Evento(String evento, GregorianCalendar fecha) {
		super();
		this.evento = evento;
		this.fecha = fecha;
	}

	public long getIdEvento() {
		return idEvento;
	}

	protected void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	public boolean equals(Evento evento) {
	}

	public boolean agregar(Cliente cliente) {
	}

	public boolean eliminar(Cliente cliente) {
	}

	public String toString() {
		return idEvento + " " + evento + " " + Funciones.traerFechaCorta(fecha) + " " + Funciones.traerHora(fecha);
	}
}
