

import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Pelihahmo {
    private String nimi;
    private int exp;
    private int sp;
    private ArrayList<Skill> skills;
    
    public Pelihahmo (String nimi) {
           this.nimi=nimi;
           this.exp=0;
           this.sp=0;
           this.skills= new ArrayList<>();
    }

    
    public void training(){
        Random rand = new Random();
        int randomNr=rand.nextInt(150)+100;
            this.exp=this.exp+randomNr;
   
            if (this.exp>=500){
                this.exp=this.exp-500; 
                this.sp=this.sp+1;
                
            }
         
    }
   
    
    public void loadHahmo(String nimi){
        
        try (Scanner tiedostonLukija = new Scanner (Paths.get(nimi+".txt"))){
            
            
                exp=Integer.valueOf(tiedostonLukija.nextLine());
               
                sp=Integer.valueOf(tiedostonLukija.nextLine());
                
                     
                while(tiedostonLukija.hasNextLine()){
                   
                    String rivi=tiedostonLukija.nextLine();
                    
                    String []parts=rivi.split(",");
                
                    String skillname=parts[0];
                
                    int level=Integer.valueOf(parts[1]);
                    
                    
                    skills.add(new Skill (skillname,level));
                      
                }
                

        }catch (Exception e){
              System.out.println("Virhe: " + e.getMessage());
                    
            }
        }
    public void writeToFile(String tiedostonNimi){
        try{
          FileWriter kirjoittaja = new FileWriter(tiedostonNimi);
          
                
              kirjoittaja.write(this.nimi + "#" + this.exp + "#" + this.sp + "\n");
              for(Skill s:skills){
                kirjoittaja.write(s.getNimi() + "#" + s.getLevel() +"\n");
              }    
              kirjoittaja.close();
          
        }catch (Exception e){
       
        }
    }
    public void addNewSkill (String nimi){
            Skill newSkill=new Skill(nimi, 0);
            this.skills.add(newSkill);

    }
    public void changeSkillName(String nimiToChange,String uusiNimi){
        
                Skill s= haeSkill(nimiToChange);
                s.setNimi(uusiNimi);
    }
    
    public void SpToSkill(String skillnimi){
        if(sp>=1){
            
            for(Skill s: skills){
            
                if(s.getNimi().equals(skillnimi) && s.getLevel()<20){
                    s.setLevel(s.getLevel()+1);
                    sp=sp-1;  
                }
            }  
        }
    }
    public ArrayList<Skill> getSkills() {
        return skills;
        
    }
    
    public String toString (){
               
        return this.nimi + ":" + "experience points: " +  this.exp + ", " + "skill points: " + this.sp;
    
    }
    public Skill haeSkill(String nimi){
        for (Skill s:skills){
            if(s.getNimi().equals(nimi)){
                return s;
            }
        }
        return null;
    }
    
    public void tilasto(){
        System.out.println(toString());
            for(Skill skill:skills){
               System.out.println(skill);
            }
        
   }

    
}
    

