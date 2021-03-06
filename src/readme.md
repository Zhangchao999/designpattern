### 设计模式
#### 单例
1. 类加载问题：
   先加载 静态块 static {  }
   再加载 构造代码块 {  }<br/>
   再加载 构造函数<br/>

2. 单例模式： `singleton` <br/>
   最普通的即`Mgr01`方法是最推荐使用的(缺点是：不管用到与否，类装载时完成实例化 和 反序列化)，一般不影响。
3. jdk1.8 中的 Lambda表达式

```$java
// 1、不使用Lambda表达式
new Thread(new Runnable() {
    @Override
    public void run() {
        System.out.println(Mgr03.getInstance().hashCode());
    }
}).start();
// 2、使用Lambda表达式
new Thread(() -> System.out.println(Mgr03.getInstance().hashCode())).start();
```
#### 策略模式
4. 策略模式： `strategy`<br/>
一个抽象类公开定义了执行它的方法的方式/模板。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行（是多态的一种形式）

Comparable类：<br/>
该接口中定义了 `compareTo` 方法，其他类实现该方法。(特定的类对某个方法实现本地化，即多态)。

Comparable类：<br/>
该接口定义了 `compare` 方法，其他类实现该方法。(比 `Comparable类` 更灵活)。一个类可以对自身不同的维度实现多种比较方式。 <br/>
#### 工厂模式
5. 工厂模式与抽象工厂模式 `factory` <br/>
定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
解决在不通维度上处理问题的方式(例如：中国人和美国人，都回上班，都会吃早餐。中国人：开车去上班，吃油条；美国人：做火车上班，吃面包)。<br/>
6. 接口与抽象类<br/>
a.语义上不同(接口比抽象类更抽象)。
b.实现类比接口速度快。
c.子类可以继承一个父类，但是可以实现多个接口。
d.抽象方法可以是 `public` `protected` `default`，而接口只能是`public`。 <br/>
#### 外观模式
7. 门面模式/外观模式 `Facade Pattern` <br/>
定义 为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。 <br/>
就像 facadepattern 包下写的一样，想把家里断电，可以一个房间一个房间去关，也可以使用电闸 `ElectricBreak` 去控制。<br/>
#### 中介模式
8. 中介模式 `mediatorpattern` <br/>
定义：用一个中介对象来封装一系列的对象交互。中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。(例如：房东`Landlord`与房客`Tenant`不需要直接交流，可以通过中介`MediatorStructure`来进行对话)
#### 装饰器模式
9. 装饰器模式 `decoratorpattern`
定义：装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。 核心即为 在不改变原类型的基础上再新加功能（例如：之前有一个画圆形的工具，现在想让他画边框是红色的圆。这时可以使用装饰器模式）<br/>
`protected`<br/> 
a. 基类的 protected 成员是包内可见的，并且对子类可见；<br/> 
b. 若子类与基类不在同一包中，那么在子类中，子类实例可以访问其从基类继承而来的protected方法，而不能访问基类实例的protected方法。
#### 责任链模式
10. 责任链模式 `chainpattern`
定义：顾名思义，责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。这种模式给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。<br/>
将要处理的形成一个链条(闭环)，去执行。 在`cn.geoary.design.chainpattern.reqresp`包下，模拟了web中对于request及response的过滤形式，即从前往后过滤request从后往前过滤response。