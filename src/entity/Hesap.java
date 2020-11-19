package entity;

import java.util.List;

public abstract class Hesap {
	Double bakiye;
	List<Hareket> gelenGidenHareketler;
	String hesapAdi;
	Integer hesapNo;
	public abstract void bakiyeHesapla();
}
