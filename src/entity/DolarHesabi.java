package entity;

import java.util.List;

public class DolarHesabi extends Hesap {



	public DolarHesabi(String bakiye, List<Hareket> gelenGidenHareketler, String hesapAdi, String hesapNo) {
		super(bakiye, gelenGidenHareketler, hesapAdi, hesapNo);
	}

	public DolarHesabi() {

	}

	@Override
	public void bakiyeHesapla() {
		// TODO Auto-generated method stub



		//bakiye = hesaplananDeger;


	}

}
