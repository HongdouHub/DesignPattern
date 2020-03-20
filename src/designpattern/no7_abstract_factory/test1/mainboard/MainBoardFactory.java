package designpattern.no7_abstract_factory.test1.mainboard;

public class MainBoardFactory {

    public static MainBoardApi createMainBoardApi(int type) {
        MainBoardApi mainBoard = null;

        if (type == 1) {
            mainBoard = new GAMainBoard(1156);
        } else if (type == 2) {
            mainBoard = new MSIMainBoard(939);
        }
        return mainBoard;
    }

}
