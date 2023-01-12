
public class Skill {
    private String nimi;
    private int level;
    
    public Skill (String nimi, int level){
        this.nimi=nimi;
        this.level=level;
    }
    public String getNimi(){
        return nimi;
    }
    public int getLevel(){
        return level;
    }
    public int setLevel(int level){
        this.level=level;
        return this.level;
    }
    public String setNimi(String nimi){
        this.nimi=nimi;
        return nimi;
    }
    
    public String toString(){
       
        return this.nimi + ": " + getLevel();
    }
    
    
    
    
}
