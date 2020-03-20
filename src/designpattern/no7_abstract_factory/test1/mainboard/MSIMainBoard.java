package designpattern.no7_abstract_factory.test1.mainboard;

/**
 * 微星的主板
 */
public class MSIMainBoard implements MainBoardApi {

    /**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;

    /**
     * 构造方法，传入CPU插槽的孔数
     * @param cpuHoles CPU插槽的孔数
     */
    public MSIMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("MSI MainBoard, cpuHoles=" + cpuHoles);
    }
}
