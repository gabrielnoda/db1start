package br.com.db1.db1start.calculadora.calculadoraapi.model;

public enum Operacao {
	SOMA {
		@Override
		public Double calcular(Double numeroUm, Double numeroDois) {
			return numeroUm + numeroDois;
		}
	},

	SUBTRAI {
		@Override
		public Double calcular(Double numeroUm, Double numeroDois) {
			return numeroUm - numeroDois;
		}
	},

	DIVIDE {
		@Override
		public Double calcular(Double numeroUm, Double numeroDois) {
			return numeroUm / numeroDois;
		}
	},

	MULTIPLICA {
		@Override
		public Double calcular(Double numeroUm, Double numeroDois) {
			return numeroUm * numeroDois;
		}
	};

	public abstract Double calcular(Double numeroUm, Double numeroDois);
}
