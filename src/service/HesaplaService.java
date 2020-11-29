package service;

import java.util.ArrayList;
import java.util.List;

import diger.SabitVeriler;
import entity.*;

public class HesaplaService {

	public List<Hesap> hesaplariDoldurveBakiyeHesapla(List<Hesap> hesaplar, List<Hareket> hareketler){

		for (Hesap hesap: hesaplar){

			List<Hareket> gelenGidenHereketler = new ArrayList();

			//Giden gelen hesap hareketlerini bul
			for (Hareket hareket: hareketler){
				if(hareket.getGonderenHesap().getHesapNo().equals(hesap.getHesapNo())) {
					gelenGidenHereketler.add(hareket);
				}
				else if(hareket.getAliciHesap().getHesapNo().equals(hesap.getHesapNo())){
					gelenGidenHereketler.add(hareket);
				}
			}

			hesap.setGelenGidenHareketler(gelenGidenHereketler);
			hesap.bakiyeHesapla();
		}

		return hesaplar;
	}
}
