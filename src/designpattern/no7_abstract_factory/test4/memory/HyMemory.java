package designpattern.no7_abstract_factory.test4.memory;

public class HyMemory implements MemoryApi {
    @Override
    public void cacheData() {
        System.out.println("HyMemory 正在被使用");
    }
}
