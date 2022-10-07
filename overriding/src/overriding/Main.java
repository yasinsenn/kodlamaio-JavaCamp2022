package overriding;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] krediManagers = new BaseKrediManager[] { new TarimKrediManager(),new OgretmenKrediManager(), new OgrenciKrediManager() };
		for (BaseKrediManager baseKrediManager : krediManagers) {
			System.out.println(baseKrediManager.hesapla(1000));

		}

	}

}
