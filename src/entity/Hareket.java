package entity;

public class Hareket {
	Hesap gonderenHesap;
	Hesap aliciHesap;

	Double tutar;

	public Hareket(){};

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

	public Double getTutar() {
		return tutar;
	}

	public void setTutar(Double tutar) {
		this.tutar = tutar;
	}


	@Override
	public String toString() {
		return "Hareket{" +
				"gonderenHesap=" + gonderenHesap.getHesapNo() +
				", aliciHesap=" + aliciHesap.getHesapNo() +
				", tutar='" + tutar + '\'' +
				'}';
	}
}


