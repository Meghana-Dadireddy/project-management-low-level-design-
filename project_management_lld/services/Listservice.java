package services;
import model.Lists;
import model.Board;
import util.*;
public class Listservice {
    public Lists createlist(Board board,String name){
        String boardid=idgenerator.generateid();
        Lists list=new Lists(boardid,name);
        board.getlists().add(list);
        return list;
    }
    public void deletelist(Board board,String listid){
        board.getlists().removeIf(list->list.getlistid().equals(listid));
    }
}
