package baslatici;

import entity.Hesap;
import service.DosyaImportService;
import service.RaporService;

import java.util.ArrayList;
import java.util.List;

public class Calistir {
	public static void main(String[] args){

		String csvFile = "/home/tarik/Documents/uu.csv";
		DosyaImportService dosyaImportService = new DosyaImportService();
		dosyaImportService.hesaplariOku(csvFile);



		String csvFile2= "/home/tarik/Documents/hesaphareket.csv";
		dosyaImportService.hareketleriOku(csvFile2);


		List<Hesap> al = new ArrayList<Hesap>();
		RaporService raporService = new RaporService();
		raporService.pdfYazdir(al);


	}

}
