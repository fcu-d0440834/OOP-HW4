package fcu.iecs.oop.tiida;

public class NissanTiida {
	static int count = 1;

	public void tiida() {
		int i, j;

		for (i = 0; i < count; i++) {
			for (j = 0; j < count; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
		count++;
	}

}