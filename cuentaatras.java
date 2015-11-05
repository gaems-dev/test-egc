class CuentaAtras {

	private int contador;

	public CuentaAtras {
		contador = 10;
		while (contador >= 0) {
			System.out.println(contador);
			contador--;
			Thread.sleep(1000);
		}
	}

}
