package org.formacion.builder;

public class Persona {

	private String nombre;
	private int edad;
	private String municipio;
	private String colegio;
	private String lugarTrabajo;

	private Persona() {}


	public static class Builder {
		private Persona persona;

		public Builder(String nombre) {
			persona = new Persona();
			persona.nombre = nombre;
		}

		public Builder setMunicipio (String municipio) {
			persona.municipio = municipio;
			return this;
		}

		public BuilderMayor setMayor(int edad) {
			if (edad < 18) throw new IllegalArgumentException("es menor de edad " + edad);
			this.persona.edad = edad;
			return new BuilderMayor(this);
		}

		public BuilderMenor setMenor(int edad) {
			if (edad >= 18) throw new IllegalArgumentException("es mayor de edad " + edad);
			this.persona.edad = edad;
			return new BuilderMenor(this);
		}

	}

	public static class BuilderMayor extends Builder {

		public BuilderMayor(Builder builder) {
			super(builder.persona.nombre);
			super.persona.municipio = builder.persona.municipio;
			super.persona.edad = builder.persona.edad;
			super.persona.colegio = null;
			super.persona.lugarTrabajo = builder.persona.lugarTrabajo;
		}

		public BuilderMayor setLugarTrabajo(String lugarTrabajo) {
			super.persona.lugarTrabajo = lugarTrabajo;
			return this;
		}

		public Persona build() {
			return super.persona;
		}

	}

	public static class BuilderMenor extends Builder {

		public BuilderMenor(Builder builder) {
			super(builder.persona.nombre);
			super.persona.municipio = builder.persona.municipio;
			super.persona.edad = builder.persona.edad;
			super.persona.colegio = builder.persona.colegio;
			super.persona.lugarTrabajo = null;
		}

		public BuilderMenor setColegio(String colegio) {
			super.persona.colegio = colegio;
			return this;
		}

		public Persona build() {
			return super.persona;
		}

	}

}
