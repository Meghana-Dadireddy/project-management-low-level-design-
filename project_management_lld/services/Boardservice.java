package services;
import java.util.List;
import java.util.*;
import model.*;
import util.*;
public class Boardservice {
    private List<Board> boards;
    public Boardservice(){
        this.boards=new ArrayList<>();
    }
    public Board createboard(String name){
        String boardid=idgenerator.generateid();
        Board board=new Board(boardid,name);
        boards.add(board);
        return board;
    }
    public Board getboard(String boardid){
        for(Board board:boards){
            if(board.getboardid().equals(boardid)) return board;
        }
        return null;
    }
    public void deleteboard(String boardid){
        boards.removeIf(board->board.getboardid().equals(boardid));
    }
    public List<Board> getallboards(){return boards;}
}
