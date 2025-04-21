import java.util.*;
class ForexFlow{
  public static void main(String args[]){ 
    Scanner sc=new Scanner(System.in);   
    TreeMap<String,Double> tm1=new TreeMap<String,Double>();
    tm1.put("united states", 87.08);
    tm1.put("europe", 94.43);
    tm1.put("british", 112.51);
    tm1.put("australia", 54.87);
    tm1.put("canada", 60.53);
    tm1.put("singapore", 65.44);
    tm1.put("switzerland", 99.10);
    tm1.put("japan", 0.59);
    tm1.put("china", 12.03);
    tm1.put("hong kong", 11.20);
    tm1.put("south korea", 0.06);
    tm1.put("saudi arabia", 23.21);
    tm1.put("united arab emirates", 23.70);
    tm1.put("kuwait", 282.57);
    tm1.put("oman", 226.12);
    tm1.put("qatar", 23.91);
    tm1.put("pakistan", 0.31);
    tm1.put("bangladesh", 0.72);
    tm1.put("sri lanka", 0.29);
    tm1.put("malaysia", 19.72);
    tm1.put("indonesia", 0.0053);
    tm1.put("thailand", 2.58);
    tm1.put("vietnam", 0.0034);
    Set<Map.Entry<String,Double>> s=tm1.entrySet();
    
    TreeMap<String,String> tm2=new TreeMap<String,String>();
    tm2.put("united states", "Dollar");
    tm2.put("europe", "Euro");
    tm2.put("british", "Pound");
    tm2.put("australia", "Dollar");
    tm2.put("canada", "Dollar");
    tm2.put("singapore", "Dollar");
    tm2.put("switzerland", "Franc");
    tm2.put("japan", "Yen");
    tm2.put("china", "Yuan");
    tm2.put("hong kong", "Dollar");
    tm2.put("south korea", "Won");
    tm2.put("saudi arabia", "Riyal");
    tm2.put("united arab emirates", "Dirham");
    tm2.put("kuwait", "Dinar");
    tm2.put("oman", "Rial");
    tm2.put("qatar", "Riyal");
    tm2.put("pakistan", "Rupee");
    tm2.put("bangladesh", "Taka");
    tm2.put("sri lanka", "Rupee");
    tm2.put("malaysia", "Ringgit");
    tm2.put("indonesia", "Rupiah");
    tm2.put("thailand", "Baht");
    tm2.put("vietnam", "Dong");    
    Set<Map.Entry<String,String>> s1=tm2.entrySet(); 

    for(Map.Entry<String,Double> me: s)
      System.out.println(me.getKey());
    double otpt=0.0,fv=0.0,tv=0.0; 
    String fname,tname;
    int ft=1,tt=1;
    do{
    if(ft==1)
    System.out.println("Enter a country name from above list to convert from: ");
    else
      System.out.println("ERROR : Enter  correct name from above list to convert from: ");
    fname=sc.nextLine().toLowerCase();
    ft++;
    }while(!tm1.containsKey(fname));
    do{
    System.out.println("Enter a country name from above list to convert to: ");
    tname=sc.nextLine().toLowerCase();
    }while(!tm1.containsKey(tname));
    System.out.print("Enter how much amount to convert to: ");
    double cnt=sc.nextDouble();
    sc.close();
    String fc="",tc="";   
      if(tm1.containsKey(fname))
         fv=tm1.get(fname); 
      if(tm1.containsKey(tname))   
         tv=tm1.get(tname);
    otpt=(fv/tv)*cnt;
      if(tm2.containsKey(fname))
         fc=tm2.get(fname);
      if(tm2.containsKey(tname))   
         tc=tm2.get(tname);
    System.out.printf("%f %s equals %.2f %s",cnt,fc,otpt,tc);
  }    
}