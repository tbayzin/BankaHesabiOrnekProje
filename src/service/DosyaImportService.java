package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entity.*;

public class DosyaImportService extends Hesap {


	public DosyaImportService(String bakiye, List<Hareket> gelenGidenHareketler, String hesapAdi, String hesapNo) {
		super(bakiye, gelenGidenHareketler, hesapAdi, hesapNo);
	}

	public DosyaImportService() {

	}

	public List<Hesap> hesaplariOku (String uu){

		String csvFile = "/Users/Electro/desktop/uu.csv";
		String line = "";
		String cvsSplitBy = ",";


		System.out.println("                 HESAP HAREKETLERINDEN ONCE BILGILER");

		try (
				BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] word = line.split(cvsSplitBy);

				System.out.println(" Hesap no: " + word[0] + " Hesap Adi: " + word[1] +  " Para Birimi:  "  + word[2] + "  Bakiye: " + word[3] +"");

				String hesapno;
				hesapno = word[0];

				String hesapAdi;
				hesapAdi = word[1];

				String hesapTipi;
				hesapTipi = word[2];

				String hesapBakiye;
				hesapBakiye = word[3];



				// Hesaptipine gore hesap obj olustur

				if (hesapTipi.equals("USD")) {
					Hesap myHesap = new DolarHesabi();
					myHesap.setHesapNo(hesapno);
					myHesap.setHesapAdi(hesapAdi);
					myHesap.setBakiye(hesapBakiye);
				} else if (hesapTipi.equals("EURO")) {
					Hesap myHesap = new EuroHesabi();
					myHesap.setHesapNo(hesapno);
					myHesap.setHesapAdi(hesapAdi);
					myHesap.setBakiye(hesapBakiye);
				}
				else{
					Hesap myHesap = new TLHesabi();
					myHesap.setHesapNo(hesapno);
					myHesap.setHesapAdi(hesapAdi);
					myHesap.setBakiye(hesapBakiye);

				}





			}

		} catch (
				IOException e) {
			e.printStackTrace();

		}

		return new ArrayList<Hesap>();
	}






	public List<Hareket> hareketleriOku (String hesaphareket){

		String csvFile2 = "/Users/Electro/desktop/hesaphareket.csv";
		String line = "";
		String cvsSplitBy = ",";


		try (
				BufferedReader br = new BufferedReader(new FileReader(csvFile2))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] word2 = line.split(cvsSplitBy);

				System.out.println(" Gonderen Hesap no: " + word2[0] + " Alici Hesap Adi: " + word2[1] +  " Para Birimi:  "  + word2[2] );




				// BURASI YAPILMADI
				/*

				String gonderenHesap;
				gonderenHesap = word2[1];


				String aliciHesap;
				aliciHesap = word2[1];

				String tutar;
				tutar = word2[2];

				Hareket  hareketObj = new Hareket();


				hareketObj.setGonderenHesap(  );
				*/

			}

		} catch (
				IOException e) {
			e.printStackTrace();

		}


		return new ArrayList<Hareket>();
	}


	public static void main(String[] args) {
		System.out.println("Test");







		}


	@Override
	public void bakiyeHesapla() {

	}



}

