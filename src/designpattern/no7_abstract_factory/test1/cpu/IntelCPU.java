package designpattern.no7_abstract_factory.test1.cpu;

/**
 * Intel的CPU实现
 */
public class IntelCPU implements CPUApi {

    private int pins = 0;

    /**
     * 构造方法，传入CPU的针脚数目
     * @param pins CPU的针脚数目
     */
    public IntelCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel CPU, pins=" + pins);
    }
}
