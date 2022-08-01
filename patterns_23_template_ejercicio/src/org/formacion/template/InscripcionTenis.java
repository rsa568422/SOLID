package org.formacion.template;

public class InscripcionTenis extends Inscripcion {
	
	public InscripcionTenis(Polideportivo polideportivo) {
		super(new Torneo("torneo tenis"), polideportivo);
	}

	public boolean apunta (Solicitud solicitud) {
		
		if (solicitud.getEdat() < 10) {
			// menores de 10 no pueden apuntarse
			return false;
		}
		
		if (this.getTorneo().getAceptadas().size() >= 4) {
			// solo pueden participar 4 personas
			return false;
		}

		this.getTorneo().apunta(solicitud);
		
		if (this.getTorneo().getAceptadas().size() == 4) {
			// plazas llenas -> reservamos polideportivo
			// El tiempo estimado del torneo son 8 horas
			this.getPolideportivo().reserva(this.getTorneo(), 8);
		}
		
		return true;
	}
	
}
