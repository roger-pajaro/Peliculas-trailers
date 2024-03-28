package com.sistema.trailers.excepciones;

public class AlmacenExcepcion extends RuntimeException {

	public AlmacenExcepcion(String mensaje) {
		super(mensaje);
	}

	public AlmacenExcepcion(String mensaje, Throwable excepcion) {
		super(mensaje, excepcion);
	}

}
