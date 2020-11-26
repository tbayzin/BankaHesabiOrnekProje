package entity;

import java.util.List;

public abstract class Hesap {
	String bakiye;
	List<Hareket> gelenGidenHareketler;
	String hesapAdi;
	String hesapNo;
	public abstract void bakiyeHesapla();


	public Hesap() {

	}

	public Hesap(String bakiye, List<Hareket> gelenGidenHareketler, String hesapAdi, String hesapNo) {
		this.bakiye = bakiye;
		this.gelenGidenHareketler = gelenGidenHareketler;
		this.hesapAdi = hesapAdi;
		this.hesapNo = hesapNo;
	}

	public String getBakiye() {
		return bakiye;
	}

	public void setBakiye(String bakiye) {
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
}