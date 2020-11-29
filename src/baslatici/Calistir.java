package baslatici;

import entity.Hareket;
import entity.Hesap;
import service.DosyaImportService;
import service.HesaplaService;
import service.RaporService;

import java.util.ArrayList;
import java.util.List;

public class Calistir {
	public static void main(String[] args){

		HesaplaService hesaplaServis = new HesaplaService();

		//Hesapları Oku ve Getir
		String csvFile = "/home/tarik/Downloads/uu.csv";
		DosyaImportService dosyaImportService = new DosyaImportService();
		List<Hesap> hesaplar = dosyaImportService.hesaplariOku(csvFile);


		//Hareketleri Oku ve Getir
		String csvFile2= "/home/tarik/Downloads/hesaphareket.csv";
		List<Hareket> hareketler = dosyaImportService.hareketleriOku(csvFile2);


		List<Hesap> al = new ArrayList<Hesap>();
		RaporService raporService = new RaporService();
		raporService.pdfYazdir(al);

		//Okunan hesaplar ve Hareketler ile Bakiye hesapla
		List<Hesap> bakiyeGuncellenmisler =  hesaplaServis.hesaplariDoldurveBakiyeHesapla(hesaplar,hareketler);

		System.out.println(bakiyeGuncellenmisler);
	}

}
