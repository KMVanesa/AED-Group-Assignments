/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Users.Airliner;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AEDSpring2019
 */
public class AirlinerDirectory {
    
    private List<Airliner> airlinerList;
    
    public AirlinerDirectory(){
        airlinerList = new ArrayList<>();
         Airliner airliner1 = new Airliner("Jet Blue", "Canada");
        Airliner airliner2 = new Airliner("Air India", "India");
        Airliner airliner3 = new Airliner("Delta", "Atlanta");
        airlinerList.add(airliner1);
        airlinerList.add(airliner2);
        airlinerList.add(airliner3);
    }

    public List<Airliner> getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(List<Airliner> airlinerList) {
        this.airlinerList = airlinerList;
    }
     public Airliner addAirliner(String airlinerName, String airlinerHeadquaters) {
       Airliner airliner = new Airliner(airlinerName, airlinerHeadquaters);
       airlinerList.add(airliner);
       return airliner;
    }
         
    public void deleteAirliner(Airliner airliner) {
        airlinerList.remove(airliner);
    }
            
    
    public Airliner searchAirliner(String airlinerName){
        for(Airliner airliner:airlinerList) {
            if(airliner.getAirlinerName().equalsIgnoreCase(airlinerName)) {
                return airliner;
            }
        }
        return null;
    }
    
    
    
}
