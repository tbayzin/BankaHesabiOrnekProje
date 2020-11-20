package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entity.Hareket;
import entity.Hesap;

import javax.print.attribute.HashPrintServiceAttributeSet;

public class DosyaImportService {






	public List<Hesap>  hesaplariOku (String csvFile){
		List<Hesap> hesaplar = new ArrayList<>();

		String line = "";
		String cvsSplitBy = ",";

		try (
				BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] word = line.split(cvsSplitBy);

				System.out.println(" HESAP BILGILERI SAYFASI ONCE  \" " + word[0] + " " + word[1] + word[2] + word[3] + " ");



				String hesapno = word[0];
				//hesaplar.add(set.hesapno);


				// hesaplariOku(set(1,hesapAdi));

			}


		} catch (
				IOException e) {
			e.printStackTrace();

		}


		return new ArrayList<Hesap>();
	}




	public List<Hareket> hareketleriOku (String hesaphareket){

		List<Hareket> hareketler = new ArrayList<>();

		String line = "";
		String cvsSplitBy = ",";

		try (
				BufferedReader br = new BufferedReader(new FileReader(hesaphareket))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] word = line.split(cvsSplitBy);

				System.out.println(" GONDEREN DOSYALAR SAYFASI ONCE  " + word[0] + " " + word[1] + " ");



	//			String hesapno = word[0];
				//	hesaplar.add(set.hesapno);


				// hesaplariOku(set(1,hesapAdi));

			}


		} catch (
				IOException e) {
			e.printStackTrace();

		}


		return new ArrayList<Hareket>();
	}





		}





