import model.*;
import services.*;
import util.*;
public class Main {
    public static void main(String[] args){
        Boardservice bd=new Boardservice();
        Listservice ls=new Listservice();
        Cardservice cd=new Cardservice();
        User u1=new User("john","john@gmail.com","1");
        User u2=new User("megha","meghana@gmail.com","2");

        Board b=bd.createboard("Project alpha");
        System.out.println("Created project: "+b.getboardid());

        Lists lt=ls.createlist(b,"To-do");
        System.out.println("Created list: "+lt.getlistid());

        Card card=cd.createcard(lt, "Implement feature x");
        System.out.println("Created card: "+card.getcardid());

        cd.assignusertocard(card, u2);
        System.out.println("Assigned user: "+u2.getName()+" to card "+card.getname());

    }
}
