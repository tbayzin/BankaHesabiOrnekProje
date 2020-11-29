package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import entity.*;

public class DosyaImportService extends Hesap {


	public DosyaImportService(Double bakiye, List<Hareket> gelenGidenHareketler, String hesapAdi, String hesapNo) {
		super(bakiye, gelenGidenHareketler, hesapAdi, hesapNo);
	}

	public DosyaImportService() {

	}

	public List<Hesap> hesaplariOku (String uu){

		String csvFile = "/home/turkai/Downloads/uu.csv";
		String line = "";
		String cvsSplitBy = ",";

		System.out.println("            HESAP HAREKETLERINDEN ONCE BILGILER");

		List<Hesap> hesapList= new ArrayList<>();

		try (
				BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] word = line.split(cvsSplitBy);

				System.out.println(" Hesap no: " + word[0] + " Hesap Adi: " + word[1] +  "  Para Birimi:  "  + word[2] + "  Bakiye: " + word[3] +"");

				String hesapno;
				hesapno = word[0];

				String hesapAdi;
				hesapAdi = word[1];

				String hesapTipi;
				hesapTipi = word[2];

				Double hesapBakiye;
				hesapBakiye = Double.valueOf(word[3]);

				// Hesaptipine gore hesap obj olustur

				if (hesapTipi.equals("USD")) {
					DolarHesabi myHesap = new DolarHesabi();
					myHesap.setHesapNo(hesapno);
					myHesap.setHesapAdi(hesapAdi);
					myHesap.setBakiye((hesapBakiye));

					hesapList.add(myHesap);
				} else if (hesapTipi.equals("EURO")) {
					EuroHesabi myHesap = new EuroHesabi();
					myHesap.setHesapNo(hesapno);
					myHesap.setHesapAdi(hesapAdi);
					myHesap.setBakiye(hesapBakiye);
					hesapList.add(myHesap);
				}
				else{
					TLHesabi myHesap = new TLHesabi();
					myHesap.setHesapNo(hesapno);
					myHesap.setHesapAdi(hesapAdi);
					myHesap.setBakiye(hesapBakiye);
					hesapList.add(myHesap);
				}
			}
		} catch (
				IOException e) {
			e.printStackTrace();
		}

		return hesapList;
	}





	public List<Hareket> hareketleriOku (String hesaphareket){

		String csvFile2 = "/home/turkai/Downloads/hesaphareket.csv";
		String line = "";
		String cvsSplitBy = ",";

		List<Hesap> hesapList = hesaplariOku("/home/turkai/Downloads/uu.csv");
		List<Hareket> hareketList = new ArrayList<>();

		try (
				BufferedReader br = new BufferedReader(new FileReader(csvFile2))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] word2 = line.split(cvsSplitBy);

		//		System.out.println(" Gonderen Hesap no: " + word2[0] + " Alici Hesap Adi: " + word2[1] +  "  Tutar:  "  + word2[2] );

				String gonderenHesap = word2[0];
				Hesap gonderen = null;
				for(Hesap hesap: hesapList) {
					if (hesap.getHesapNo().equals(gonderenHesap)) {
						gonderen = hesap;
					}
				}

				String aliciHesap = word2[1];
				Hesap alici = null;
				for(Hesap hesap: hesapList) {
					if (hesap.getHesapNo().equals(aliciHesap)) {
						alici = hesap;
					}
				}


				Hareket hareket = new Hareket();
				hareket.setAliciHesap(alici);
				hareket.setGonderenHesap(gonderen);
				hareket.setTutar(Double.valueOf(word2[2]));

				//hareket.getAliciHesap().setGelenGidenHareketler(hareket);
				alici.getGelenGidenHareketler().add(hareket);
				gonderen.getGelenGidenHareketler().add(hareket);

				//bakiye ekleme çıkarma HESAPLASERVISE
				System.out.println(hareket);

				hareketList.add(hareket);
			}
		} catch (
				IOException e) {
			e.printStackTrace();

		}


		hesapList.forEach(hesap -> {
			System.out.println(hesap);
		});


		return hareketList;
	}


	public static void main(String[] args) {
		System.out.println("Test");







		}


	@Override
	public void bakiyeHesapla() {

	}



}

