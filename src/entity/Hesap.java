package entity;

import diger.SabitVeriler;

import java.util.List;

public abstract class Hesap {
	Double bakiye;
	List<Hareket> gelenGidenHareketler;
	String hesapAdi;
	String hesapNo;
	public abstract void bakiyeHesapla();

	public Hesap() {

	}

	public Hesap(Double bakiye, List<Hareket> gelenGidenHareketler, String hesapAdi, String hesapNo) {
		this.bakiye = bakiye;
		this.gelenGidenHareketler = gelenGidenHareketler;
		this.hesapAdi = hesapAdi;
		this.hesapNo = hesapNo;
	}


	public Double getBakiye() {
		return bakiye;
	}

	public void setBakiye(Double bakiye) {
		this.bakiye = bakiye;
	}

	public List<Hareket> getGelenGidenHareketler() {
		return gelenGidenHareketler;
	}

	public void setGelenGidenHareketler(List<Hareket> gelenGidenHareketler) {
		this.gelenGidenHareketler = gelenGidenHareketler;
	}

	public String getHesapAdi() {
		return hesapAdi;
	}

	public void setHesapAdi(String hesapAdi) {
		this.hesapAdi = hesapAdi;
	}

	public String getHesapNo() {
		return hesapNo;
	}

	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}

	@Override
	public String toString() {
		return "HESAP:  " +
				" gelenGidenHareketler=" + gelenGidenHareketler +
				" Hesap Adi: ='" + hesapAdi + '\'' +
				" Hesap No ='" + hesapNo + '\'' +
				"Guncel Bakiye='" + bakiye  +
				'-';
	}

	protected Double hareketTutarBirimCevir (Hesap gonderenHesap, Hesap alanHesap, Double hareketTutari) {

		Double kurHareketHesaplanmis = 0.0;
		String gonderenClassAdi = gonderenHesap.getClass().getSimpleName();
		String aliciClassAdi = alanHesap.getClass().getSimpleName();


		// Hesaplanacak kuru getirir
		Double KUR = KurGetir(gonderenClassAdi,aliciClassAdi);

		// Dönen kuru hareket tutariyla carpar
		kurHareketHesaplanmis = KUR * hareketTutari;
		return kurHareketHesaplanmis;
	}

	protected Double KurGetir(String gonderenClassAdi, String aliciClassAdi){
		Double kur = 0.0;

		SabitVeriler sabitVeriler = new SabitVeriler();

		if (gonderenClassAdi.equals(DolarHesabi.class.getSimpleName()) &&  aliciClassAdi.equals(TLHesabi.class.getSimpleName())) {

			kur = sabitVeriler.dolarTlKur;
		} else if (gonderenClassAdi.equals(TLHesabi.class.getSimpleName()) &&  aliciClassAdi.equals(DolarHesabi.class.getSimpleName())) {
			kur = sabitVeriler.tlDolarKur;


		}
		else if (gonderenClassAdi.equals(EuroHesabi.class.getSimpleName()) &&  aliciClassAdi.equals(DolarHesabi.class.getSimpleName())) {
			kur = sabitVeriler.euroDolarKur;

		}
		else if (gonderenClassAdi.equals(DolarHesabi.class.getSimpleName()) &&  aliciClassAdi.equals(EuroHesabi.class.getSimpleName())) {

			kur = sabitVeriler.dolarEuroKur;

		}

		else if (gonderenClassAdi.equals(TLHesabi.class.getSimpleName()) &&  aliciClassAdi.equals(EuroHesabi.class.getSimpleName()))  {
			kur = sabitVeriler.tlEuroKur;

		}
		else if (gonderenClassAdi.equals(EuroHesabi.class.getSimpleName()) &&  aliciClassAdi.equals(TLHesabi.class.getSimpleName()))  {

			kur = sabitVeriler.euroTlKur;

		} else {
			System.out.println(" GG");
		}
		return  kur;

	}
}