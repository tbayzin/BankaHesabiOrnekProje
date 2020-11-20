package entity;

import java.util.List;

public abstract class Hesap {
	Double bakiye;
	List<Hareket> gelenGidenHareketler;
	String hesapAdi;
	Integer hesapNo;
	public abstract void bakiyeHesapla();




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

	public Integer getHesapNo() {
		return hesapNo;
	}

	public void setHesapNo(Integer hesapNo) {
		this.hesapNo = hesapNo;
	}
}