### 设计模式
#### 单例
1. 类加载问题：<br/>
先加载 静态块 static {  }<br/>
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
4、策略模式： `strategy`<br/>
一个抽象类公开定义了执行它的方法的方式/模板。它的子类可以按需要重写方法实现，但调用将以抽象类中定义的方式进行（是多态的一种形式）

Comparable类：<br/>
该接口中定义了 `compareTo` 方法，其他类实现该方法。(特定的类对某个方法实现本地化，即多态)。

Comparable类：<br/>
该接口定义了 `compare` 方法，其他类实现该方法。(比 `Comparable类` 更灵活)。一个类可以对自身不同的维度实现多种比较方式。
5. 工厂模式与抽象工厂模式 `factory` <br/>
定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
解决在不通维度上处理问题的方式(例如：中国人和美国人，都回上班，都会吃早餐。中国人：开车去上班，吃油条；美国人：做火车上班，吃面包)。
6. 接口与抽象类<br/>
a.语义上不同(接口比抽象类更抽象)。
b.实现类比接口速度快。
c.子类可以继承一个父类，但是可以实现多个接口。
d.抽象方法可以是 `public` `protected` `default`，而接口只能是`public`。