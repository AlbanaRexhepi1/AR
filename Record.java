package reservation;


public class Record {
	 private static boolean[] eLire = {true,true,true,true,true,true,true,true,true,true};
	 
	 private static String[][] dhoma = {{"Dhoma1","","",""},{"Dhoma2","","",""},{"Dhoma3","","",""},{"Dhoma4","","",""},{"Dhoma5","","",""},{"Dhoma6","","",""},
			 {"Dhoma7","","",""},{"Dhoma8","","",""},{"Dhoma9","","",""},{"Dhoma10","","",""},};
			 
	  public Record()
	  { 
	  }

	  public void setTrue(int id)
	  { 
		  
		  eLire[id-1] = true;
		  
	  }
	  public void setFalse(int id)
	  { 
		  
		  eLire[id-1] = false;
		  
	  }

	  public boolean[] get()
	  {
		  return eLire; 
      }
	  public String[][] getR()
	  {
		  return dhoma; 
      }
	  
	  public void set(int i,int j,String s) {
		  dhoma[i-1][j] = s;
	  }


}
