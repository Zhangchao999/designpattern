### 设计模式
#### 单例
1. 类加载问题：<br/>
先加载 静态块 static {  }<br/>
再加载 构造代码块 {  }<br/>
再加载 构造函数<br/>
2. 单例模式：
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