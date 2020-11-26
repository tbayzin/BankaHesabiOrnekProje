package entity;

public class Hareket {
	Hesap gonderenHesap;
	Hesap aliciHesap;
	
	String tutar;

	public Hesap getGonderenHesap() {
		return gonderenHesap;
	}

	public void setGonderenHesap(Hesap gonderenHesap) {
		this.gonderenHesap = gonderenHesap;
	}

	public Hesap getAliciHesap() {
		return aliciHesap;
	}

	public void setAliciHesap(Hesap aliciHesap) {
		this.aliciHesap = aliciHesap;
	}

	public String getTutar() {
		return tutar;
	}

	public void setTutar(String tutar) {
		this.tutar = tutar;
	}
}
