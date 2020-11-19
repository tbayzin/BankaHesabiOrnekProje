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

		try (
				BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] word = line.split(cvsSplitBy);

				System.out.println("  " + word[0] + " " + word[1] + word[2] + word[3] +"");

				String hesapno;
				hesapno = word[0];




				System.out.println("HESAP NO " + hesapno);

			}

		} catch (
				IOException e) {
			e.printStackTrace();

		}


		return new ArrayList<Hesap>();
	}

	public List<Hareket> hareketleriOku (String hesaphareket){
		//dosyadaki satırlar obje listesine çevirilecek.
		return new ArrayList<Hareket>();
	}


	public static void main(String[] args) {
		System.out.println("Test");







		}





	}

