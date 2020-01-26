import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {

		Map<Integer, Person> mapa = new HashMap<>();

		mapa.put(123123123, new Person(123123123));
		mapa.put(22222, new Person(22222));
		mapa.put(33333, new Person(33333));
		mapa.put(11111, new Person(11111));
		mapa.put(444444, new Person(444444));

		Person szukanaOsoba = mapa.get(123123123);
		System.out.println(szukanaOsoba);
	}

}

class Person {
	int pesel;

	Person(int pesel) {
		this.pesel=pesel;
	}

	@Override
	public String toString() {
		return "osoba z numerem pesel = " + pesel;
	}
}
