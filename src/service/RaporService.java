package service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import entity.Hesap;

public class RaporService {
	public void pdfYazdir(List<Hesap> hesaplar) {


			try (PrintWriter writer = new PrintWriter(new File("/home/tarik/Documents/cikti.csv"))) {


			//	DosyaImportService dosyaImportService = new DosyaImportService();
				StringBuilder sb = new StringBuilder();
			//	sb.append(dosyaImportService.hesaplariOku(""));
				sb.append(',');
				sb.append("Name");
				sb.append('\n');

				sb.append("1");
				sb.append(',');
				sb.append("Prashant Ghimire");
				sb.append('\n');

				writer.write(sb.toString());

				System.out.println("done!");

			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}
	}
