package services;
import model.*;
import util.*;
public class Cardservice {
    public Card createcard(Lists list,String name){
        String id=idgenerator.generateid();
        Card card=new Card(id,name);
        list.getcards().add(card);
        return card;
    }
    public void deletecard(Lists list,String cardid){
        list.getcards().removeIf(card->card.getcardid().equals(cardid));
    }
    public void assignusertocard(Card card,User user){
        card.setassigneduser(user);
    }
    public void unassignusertocard(Card card){
        card.setassigneduser(null);
    }
}

