package org.formacion.template;

public class InscripcionLucha extends Inscripcion {

	public InscripcionLucha(Polideportivo polideportivo) {
		super(new Torneo("torneo lucha"), polideportivo);
	}

	public boolean apunta (Solicitud solicitud) {
		
		if (solicitud.getEdat() < 15) {
			// menores de 15 no pueden apuntarse
			return false;
		}
		
		if (solicitud.getPeso() < 60) {
			// peso minimo, 60 kilos
			return false;
		}
		
		if (this.getTorneo().getAceptadas().size() >= 6) {
			// solo pueden participar 6 personas
			return false;
		}
		
		this.getTorneo().apunta(solicitud);
	
		
		if (this.getTorneo().getAceptadas().size() == 6) {
			// plazas llenas -> reservamos polideportivo
			// El tiempo estimado del torneo son 4 horas
			this.getPolideportivo().reserva(this.getTorneo(), 4);
		}

		return true;
	}

}
