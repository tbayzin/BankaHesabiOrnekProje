package entity;

import diger.SabitVeriler;

import java.util.ArrayList;
import java.util.List;

public class DolarHesabi extends Hesap {



	public DolarHesabi(Double bakiye, List<Hareket> gelenGidenHareketler, String hesapAdi, String hesapNo) {
		super(bakiye, gelenGidenHareketler, hesapAdi, hesapNo);
		this.gelenGidenHareketler = new ArrayList<>();
	}

	public DolarHesabi() {
		this.gelenGidenHareketler = new ArrayList<>();
	}

	@Override
	public void bakiyeHesapla() {

		Double hesaplananDeger = this.getBakiye();

		for (Hareket hareket : this.getGelenGidenHareketler()){
			//Gönderici Hesap ise
			if(hareket.getGonderenHesap().getHesapNo().equals(this.getHesapNo())){

				hesaplananDeger = hesaplananDeger - hareket.getTutar();
			}
			//Alıcı hesap ise
			else if(hareket.getAliciHesap().getHesapNo().equals(this.getHesapNo())){
				Double kurHareketHesaplanmis = 0.0;
				String gonderenClassAdi = hareket.getGonderenHesap().getClass().getSimpleName();
				String aliciClassAdi = hareket.getAliciHesap().getClass().getSimpleName();


				// Hesaplanacak kuru getirir
				Double KUR = KurGetir(gonderenClassAdi,aliciClassAdi);

				// Dönen kuru hareket tutariyla carpar
				kurHareketHesaplanmis = KUR * hareket.getTutar();

				hesaplananDeger = hesaplananDeger + kurHareketHesaplanmis;
			}
		}


		//bakiye = hesaplananDeger;
		this.setBakiye(hesaplananDeger);

	}

}
