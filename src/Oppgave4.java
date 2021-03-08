
public class Oppgave4 {

	public static void main(String[] args) {
		Integer[] tab = { 5, 12, 63, 32, 12, 84, 26, 1, 66, 32 };

		tab = quickSort(tab);
		for (Integer tall : tab) {
			System.out.print(tall + ",");
		}

	}

	public static Integer[] quickSort(Integer[] tab) {

	}

	public static Integer[] mergeSort(Integer[] tab) {

	}

	// full tabell
	public static <T extends Comparable<T>> void utvalgssortering(T[] data) {
		int minste;
		T temp;

		for (int neste = 0; neste < data.length - 1; neste++) {
			minste = neste;
			for (int sok = neste + 1; sok < data.length; sok++) {

				if (data[sok].compareTo(data[minste]) < 0) {
					minste = sok;
				}

			} /** Bytt verdiene */
			temp = data[minste];
			data[minste] = data[neste];
			data[neste] = temp;
		} // ytre
	}// metode

	public static <T extends Comparable<T>> void bobleSort(T[] data) {

		T temp;

		for (int p = data.length - 1; p >= 0; p--) {
			for (int sok = 0; sok <= p - 1; sok++) {
				if (data[sok].compareTo(data[sok + 1]) > 0) {
					// Bytt verdiene
					temp = data[sok];
					data[sok] = data[sok + 1];
					data[sok + 1] = temp;
				}
			} // indre løkke
		} // ytre løkke
	}// metode

	public static <T extends Comparable<T>> void sorteringVedInsetting(T[] data) {

		for (int indeks = 1; indeks < data.length; indeks++) {

			T nokkel = data[indeks];
			int p = indeks;
			// Forskyv større verdier mot hoyre
			while (p > 0 && nokkel.compareTo(data[p - 1]) < 0) {
				data[p] = data[p - 1];
				p--;
			}
			data[p] = nokkel;
		} // ytre

	}// metode

	public static <T extends Comparable<T>> void kvikkSortNy(T[] data) {
		kvikkSortNy(data, 0, data.length - 1);
		sorteringVedInnsetting(data);
	}

	public static <T extends Comparable<T>> void kvikkSortNy(T[] data, int min, int maks) {
		final int MIN = 10;
		int posPartisjon;
		if (maks - min + 1 > MIN) {// antall elementer > MIN ?
			posPartisjon = finnPartisjon(data, min, maks);
			kvikkSortNy(data, min, posPartisjon - 1);
			kvikkSortNy(data, posPartisjon + 1, maks);
		}
	}// metode

}
