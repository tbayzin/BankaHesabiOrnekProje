package entity;

import java.util.List;

public class TLHesabi extends Hesap {

	public TLHesabi(String bakiye, List<Hareket> gelenGidenHareketler, String hesapAdi, String hesapNo) {
		super(bakiye, gelenGidenHareketler, hesapAdi, hesapNo);
	}

	public TLHesabi() {

	}

	@Override
	public void bakiyeHesapla() {
		// TODO Auto-generated method stub


		//bakiye = hesaplananDeger;
	}

}