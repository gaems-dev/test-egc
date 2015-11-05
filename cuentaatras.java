class CuentaAtras {

	private int contador;

	public CuentaAtras {
		contador = 10;
		while (contador > 0) {
			System.out.println(contador);
			contador -= 5;
			Thread.sleep(1000);
		}
		System.out.println("cero!");
	}

}
