# DesignPattern

## GoF著作

- 结构型

  外观模式、适配器模式、代理模式、组合模式、享元模式、装饰模式、桥接模式

- 创建型

  单例模式、工厂方法模式、抽象工厂模式、生成器/建造者模式、原型模式

- 行为型

  中介者模式、观察者模式、命令模式、迭代器模式、模板方法模式、策略模式、状态模式、备忘录模式、解释器模式、职责链模式、访问者模式



## 一、简单工厂

- 定义：提供一个创建对象实例的功能，而无须关心其具体实现。被创建实例的类型可以是接口、抽象类，也可以是具体的类。
- 本质：选择实现。



## 二、外观模式

- 定义：为子系统中的一组接口提供一个一致的界面，Facade 模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。
- 本质：封装交互，简化调用。



## 三、适配器模式

- 定义：将一个类的接口转换成客户希望的另一个接口。适配器模式使得原来由于接口不兼容而不能一起工作的那些类可以一起工作。
- 本质：转换匹配，复用功能。



## 四、单例模式

- 定义：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
- 本质：控制实例数目。



## 五、工厂方法模式

- 定义：定义一个用于创建对象的接口，让子类决定实例化哪一个类，Factory Method使一个类的实例化延迟到其子类。
- 本质：延迟到子类来选择实现。



## 六、抽象工厂模式

- 定义：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
- 本质：选择产品簇的实现。



## 七、生成器/建造者模式

- 定义：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
- 本质：分离整体构建算法和部件构造。



## 八、原型模式

- 定义：用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象。
- 本质：克隆生成对象。



##九、中介者模式

- 定义：用一个中介对象来封装一系列的对象交互。中介者使得各对象不需要显示地相互引用，从而使其耦合松散，并且可以独立地改变它们之间的交互。
- 本质：封装交互。



## 十、代理模式

- 定义：为其他对象提供一种代理以控制对这个对象的访问。
- 本质：控制对象访问。



## 十一、观察者模式

- 定义：定义对象间的一种一对多的依赖关系。当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
- 本质：触发联动。



## 十二、命令模式

- 定义：将一个请求封装为一个对象，从而使你可用不同的请求对客户进行参数化，对请求排队或记录请求日志，以及支持可撤销的操作。
- 本质：封装请求。



## 十三、迭代器模式

- 定义：提供一种方法顺序访问一个聚合对象中的各个元素，而又不需暴露该对象的内部表示。
- 本质：控制访问聚合对象中的元素。



## 十四、组合模式

- 定义：将对象组合成树型结构以表示 “部分-整体” 的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
- 本质：统一叶子对象和组合对象。



## 十五、模板方法模式

- 定义：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
- 本质：固定算法骨架。



## 十六、策略模式

- 定义：定义一系列的算法，把它们一个个封装起来，并且使它们可互相替换。本模式使得算法可独立于它的客户而变化。
- 本质：分离算法，选择实现。



## 十七、状态模式

- 定义：允许一个对象在其内部状态改变时改变它的行为。对象看起来似乎修改了它的类。
- 本质：根据状态来分离和选择行为。



## 十八、备忘录模式

- 定义：在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后就可将该对象恢复到原先保存的状态。
- 本质：保存和恢复内部状态。



## 十九、享元模式

- 定义：运用共享技术有效地支持大量细粒度的对象。
- 本质：分离与共享。



## 二十、解释器模式

- 定义：给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
- 本质：分离实现，解释执行。



## 二十一、装饰模式

- 定义：动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式比生成子类更为灵活。
- 本质：动态组合。



## 二十二、职责链模式

- 定义：使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
- 本质：分离职责，动态组合。



## 二十三、桥接模式

- 定义：将抽象部分与它的实现部分分离，使它们都可以独立地变化。
- 本质：分离抽象和实现。



## 二十四、访问者模式

- 定义：表示一个作用于某对象结构中的各元素的操作。它使你可以在不改变各元素的类的前提下定义作用于这些元素的新操作。
- 本质：预留通路，回调实现。