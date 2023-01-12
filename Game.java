
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class Game {
    
    
    
    public Game(){
       
        
    }
    
    public void kaynnista() {
        
    Scanner lukija=new Scanner (System.in);
    
    System.out.println("Pelihahmon nimi?");
    String nimi=lukija.nextLine();
    
    Pelihahmo hahmo = new Pelihahmo (nimi);
    hahmo.loadHahmo(nimi);
    
    while (true){
        System.out.println("Mitä tehdään?"); 
        String komento=lukija.nextLine();
        
        if(komento.equals("lopeta")){
            break;
        }
        if (komento.equals("harjoittele")){
            
            hahmo.training();
            
        }
        if(komento.equals("tilasto")){
            hahmo.tilasto();
        }
        if (komento.equals("rise")){
            System.out.println("What skill?");
            String skillname=lukija.nextLine();
            Skill s=hahmo.haeSkill(skillname);
            if (s==null){
                    System.out.println("Skill doesnt exist");
            }else 
            hahmo.SpToSkill(skillname);
             
        }
        if(komento.equals("lisaa")){
            System.out.println("Mitä lisatään?");
            String skillnimi=lukija.nextLine();
            
            Skill s=hahmo.haeSkill(skillnimi);
            
                if(s==null){
                    hahmo.addNewSkill(skillnimi);
                }else
                    System.out.println("Already exists");
            
        }
        if(komento.equals("change")){
            System.out.println("Mitä vaihdetaan?");
            String nimiToChange=lukija.nextLine();
            
            Skill s=hahmo.haeSkill(nimiToChange);
                if(s==null){
                    System.out.println("Skill doesnt exist");
                    
                }else 
                    System.out.println("Uusi nimi?");
                    String uusiNimi=lukija.nextLine(); 
                    hahmo.changeSkillName(nimiToChange,uusiNimi);
                
        }
          
        if(komento.equals("save")){
            System.out.println("FileNimi?");
            String FileNimi=lukija.nextLine();
            
            hahmo.writeToFile(FileNimi);
       
        } 
    }
    
    }
}
