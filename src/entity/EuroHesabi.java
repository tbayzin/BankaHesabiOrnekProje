package entity;

import java.util.List;

public class EuroHesabi extends Hesap {

	public EuroHesabi(String bakiye, List<Hareket> gelenGidenHareketler, String hesapAdi, String hesapNo) {
		super(bakiye, gelenGidenHareketler, hesapAdi, hesapNo);
	}

	public EuroHesabi() {

	}

	@Override
	public void bakiyeHesapla() {
		// TODO Auto-generated method stub
		
		//bakiye = hesaplananDeger;
	}
	
}
