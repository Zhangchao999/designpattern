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
