package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entity.Hareket;
import entity.Hesap;

public class DosyaImportService {



	public List<Hesap> hesaplariOku (String uu){

		String csvFile = "/Users/Electro/desktop/uu.csv";
		String line = "";
		String cvsSplitBy = ",";


		System.out.println("                 HESAP HAREKETLERINDEN ONCE");

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

				String gonderenHesap;
				gonderenHesap = word2[0];

				String aliciHesap;
				aliciHesap = word2[1];

				String tutar;
				tutar = word2[2];


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





	}

