package designpattern.no7_abstract_factory.test4.cpu;

/**
 * AMD的CPU实现
 */
public class AMDCPU implements CPUApi {

    private int pins = 0;

    /**
     * 构造方法，传入CPU的针脚数目
     * @param pins CPU的针脚数目
     */
    public AMDCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("AMD CPU, pins=" + pins);
    }
}
