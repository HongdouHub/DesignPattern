package designpattern.no7_abstract_factory.test1.cpu;

/**
 * 创建CPU的简单工厂
 */
public class CPUFactory {

    public static CPUApi createCpuApi(int type) {
        CPUApi cpu = null;

        if (type == 1) {
            cpu = new IntelCPU(1156);
        } else if (type == 2){
            cpu = new AMDCPU(939);
        }
        return cpu;
    }

}
