package com.ajitrisantoso;

public class RS01 {
	
	public enum UGD {
		HasanSadikin,RSUPindad,SartikaAsih,AlIslam,SantoBorromeus,Advent,HerminaPasteur,SantoYusup	  
	}
	
	private String NamaRS;
	private int VK;
	private int	ICU;
	private int ICCU;
	private String DrUmum; //{ADA,ONCALL,TIDAKADA}
	private String DrSPKandungan; //{ADA,ONCALL,TIDAKADA}
	private String DrSPAnak; //{ADA,ONCALL,TIDAKADA}
	private String DrSpBedah; //{ADA,ONCALL,TIDAKADA}
	private Boolean available; //{ADA,ONCALL,TIDAKADA}
	
	public int getVK() {
		return VK;
	}
	public void setVK(int vK) {
		VK = vK;
	}
	public int getICCU() {
		return ICCU;
	}
	public void setICCU(int iCCU) {
		ICCU = iCCU;
	}
	public int getICU() {
		return ICU;
	}
	public void setICU(int iCU) {
		ICU = iCU;
	}
	public String getDrUmum() {
		return DrUmum;
	}
	public void setDrUmum(String drUmum) {
		DrUmum = drUmum;
	}
	public String getDrSPAnak() {
		return DrSPAnak;
	}
	public void setDrSPAnak(String drSPAnak) {
		DrSPAnak = drSPAnak;
	}
	public String getDrSPKandungan() {
		return DrSPKandungan;
	}
	public void setDrSPKandungan(String drSPKandungan) {
		DrSPKandungan = drSPKandungan;
	}
	public String getDrSpBedah() {
		return DrSpBedah;
	}
	public void setDrSpBedah(String drSpBedah) {
		DrSpBedah = drSpBedah;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	public String getNamaRS() {
		return NamaRS;
	}
	public void setNamaRS(String namaRS) {
		NamaRS = namaRS;
	}
	
//	rule "Is available"
//	when
//	 $a : ItemSymptoms( Need )
//	then
//	 $a.setAvailable( false );
//	end

}
