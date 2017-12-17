package com.ajitrisantoso;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.ajitrisantoso.ItemSymptoms.Symptoms;


public class RunningMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySQLAccess db=new MySQLAccess();
	        int i=0;
	        ResultSet rs=null;
	        try{
	            rs=db.getData("select * from tb_rs");
	            while(rs.next()){
	                System.out.println(rs.getString("nama_rs"));
	                i++;                            
	            }
	            rs.close();
	        }catch(Exception e){            
	        }
	        
		try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
        	 ItemSymptoms item1 = new ItemSymptoms();
             item1.setTypeofSymptoms(Symptoms.Systolic);
             String location = ("-1203,2131");
             
             
             kSession.insert(item1);
             
             
             ItemSymptoms item2 = new ItemSymptoms();
             item2.setTypeofSymptoms(Symptoms.PrematureChildbirth); 
             kSession.insert(item2);
                       
             kSession.fireAllRules();
            
            System.out.println(item1.getExpertRec().toString());
            System.out.println(item2.getExpertRec());
        } catch (Throwable t) {
            t.printStackTrace();
        }
	}

}
