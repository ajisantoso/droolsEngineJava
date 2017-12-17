package com.ajitrisantoso;

public class ItemSymptoms {
	
	//total ada 31 symptom
	public enum Symptoms {
	      Systolic,Temperature,Heartbeat,Breathing,ChestPain,InternalBleeding,
	      SuddenComa,Inhaled,TraumaBleeding,CarAccident,Fracture,InternalOrgan,
	      Paralysis,Burn,SnakePoison,GunShot,Rape,PrematureChildbirth	      
	   }
	
	private Symptoms typeofSymptoms;
	private String expertRec;
	
	
	public Symptoms getTypeofSymptoms() {
		return typeofSymptoms;
	}
	public void setTypeofSymptoms(Symptoms typeofSymptoms) {
		this.typeofSymptoms = typeofSymptoms;
	}
	public String getExpertRec() {
		return expertRec;
	}
	public void setExpertRec(String expertRec) {
		this.expertRec = expertRec;
	}
	
	
}
