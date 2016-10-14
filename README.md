# 设计模式：DesignPattern

## 一、设计模式和原则
### 1、什么是设计模式

**程序语言的发展阶段**

1. 机器语言
2. 汇编语言
3. 高级语言
    - 面向过程
    - 面向对象
    - 面向服务 

**面向对象**

* 面向对象分析：Object-Oriented Analysis（OOA）
* 面向对象设计：Object-Oriented Design（OOD）
* 面向对象编码：Object-Oriented Programming（OOP）

**设计模式的定义**

* 特定环境下解决特定问题的处理办法（套路 VS 定式）
* 前人经验的总结，是发现的过程而不是发明创造的结果
* 弥补语言的不足
* 代码重构的解决方案

### 2、什么是设计原则

**软件设计的核心思想和目标**

* 可靠性
* 灵活性
* 健壮性
* 维护性
* 阅读性
* 测试性
* 先进性
* 扩展性

**设计原则的分类**

* 概念性原则 Concept 
* 编码性原则 Coding

### 3、设计模式和设计原则的关系

* 设计原则体现设计模式的思想
* 设计模式实现设计原则的目标

设计原则和设计模式之间有可能会冲突，需要选择合适的平衡点

### 4、GOF 23种设计模式分类

**创建型设计模式 Creational Design Pattern**

解决对象实例化过程中遇到的问题（通常会出现泛化关系）

**结构型设计模式 Structural Design Pattern**

解决对象间关联关系和结构搭建的问题（通常会出现关联关系）

**行为型设计模式 Behavioral Design Pattern**

解决对象间消息传递（通信）的问题（通常会出现依赖关系）

### 5、统一建模语言：UML Unified Modeling Language（UML）

**关联关系**

* 泛化 Generalization
* 实现 Realization
* 依赖 Dependency
* 关联 Association
* 聚合 Aggregation
* 组合 Composition

**关联强度**

泛化 = 实现（高） > 组合 > 聚合 > 关联 > 依赖（低）

## 二、常用的设计原则
### 1、指导性（概念性）原则

**Change**
 
保持代码弹性、应对需求变化

**KISS Keep It Simple，Stupid**

化繁为简、返璞归真、保持精炼

**DRY Don't Repeat Yourself**

消除代码的冗余，与可读性矛盾

### 2、SOLID原则

**SRP：Simple Responsibility Principle（单一职责原则）**

类职责尽量单一，能够提供的服务越少，修改的可能性就会越少，维护成本就会越低，

**OCP：Open Close Principle（开放封闭原则）**

对外扩展开放，对内修改封闭，高内聚、低耦合

**LSP：Liskov Substitution Principle（里氏替换原则）**

所有父类引用的位置一定能够被替换成子类对象，伴生多态，提高灵活性

**ISP：Interface Segregation Principle（接口隔离原则）**

接口内的方法应尽量形成最小算法簇，通过多接口实现扩展和降耦

**DIP：Dependence Inversion Principle（依赖倒置原则）**

高端类不应依赖低端子类，抽象不应该依赖细节；细节应该依赖抽象

### 3、其它常用设计原则

**LOD：Law Of DemeterSimple（迪米特法则）**

最少知道原则，不同粒度下的类关联越少越好，对依赖的类关联越少越好

**CARP：Composite/Aggregate Reuse Principle（合成聚合复用原则）**

尽量通过组合（聚合）的关联方式，而不要使用继承（类爆炸、破坏封装、速度缓慢）

**CoC：Convention over Configuration（约定优于配置）**

减少需要作出决定的数量，仅需规定应用中不符约定的部分，将公认的配置方式和信息作为内部缺省方式的规则来使用

**CCP：Common Closure Principle（共同封闭原则）**

所有的修改都发生在一个包里，包中的所有类对于同一种性质的变化应该是共同封闭的

**YAGNI：You Ain’t Gonna Need It（你可能并不需要）**

避免过度设计，不必要的复杂性都会让系统变得难于调整，后期通过重构修正，开发也是沟通博弈的构成

**CQS：Command-Query Separation（命令查询分离原则）**

接口设计尽量剥离查询和命令职责，因为命令有可能修改对象状态，而查询则不会

**Hollywood Principle：don’t call us,  we’ll call you（好莱坞原则）**

组件尽量保持被动状态，初始化和调用通过容器负责，也是IoC的基础原则

**IoC：Inversion of Control（控制反转）**

* 依赖注入 ：Dependency Injection（DI）
* 依赖查找：DL Dependency Lookup（DL）

**SOC：Separation of Concerns（关注点分离）**

将问题能分解为独立且较小的问题，相对较易解决，标准化或抽象

**ADP：Acyclic Dependencies Principle（无环依赖原则）**

包之间的依赖结构必须是一个直接的无环图形，也就是说，在依赖结构中不允许出现环

## 三、创建型设计模式

### 1、简单工厂 SimpleFactory
**意图：**

解决具备相同父类外观的子类产品实例化问题

**代码原型：**

产品父类：Product

```java
class Product {}
```

产品子类：ProductA、ProductB

```java
class ProductA extends Product {}
class ProductB extends Product {}
```

简单工厂类（静态方法工厂类）：

```java
class SimpleFactory {
    static Product getProduct(String productName){
        switch (productName){
            case "A": return new ProductA();
            case "B": return new ProductB();
            default: return null;
        }
    }
}
```


### 2、工厂方法 FactoryMethod
意图：将子类产品实例化延迟到更小一级的子类工厂去实现

### 3、抽象工厂 AbstractFactory
意图：面向接口的工厂模式，解决一系列相关或相互依赖的子类产品实例化

### 4、单例 Singleton
意图：保证一个类只允许被实例化一次，通过全局访问点从内部实例化

### 5、建造者 Builder
意图：将稳定的构建与其表示相分离，使得同样的构建过程可以创建不同的表示

### 6、原型 Prototype
意图：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象

## 四、结构型设计模式
### 1、适配器 Adapter
意图：解决新旧系统不兼容或数据格式无法互通的问题

### 2、桥接 Bridge
意图：将抽象部分和实现部分分离，使各部分可以独立变化

### 3、组合 Composite
意图：通过树形结构，使单个对象和组合对象的使用具有一致性

### 4、装饰 Decorator
意图：不改变原有类的情况下，动态扩展类的功能

### 5、享元 Flyweight
意图：解决大量细粒度对象的实例化问题

### 6、外观 Facade
意图：为子系统提供统一接口，使子系统更加易于被调用

### 7、代理 Proxy
意图：为对象提供一种代理以控制或增强对该对象的访问

## 五、行为型设计模式
### 1、命令 Command
意图：将请求封装成对象，并提供队列实现提交和撤销

### 2、职责链 ChainOfResponsibility
意图：避免请求和处理耦合，通过垂直链状结构自动传递和处理

### 3、观察者 Observer
意图：被观察对象状态变化时，观察对象可以自动更新

### 4、中介者 Mediator
意图：解决多个对象间交互的问题，通过中介者类集中处理转发

### 5、备忘录 Memento
意图：在不破坏封闭的前提下，捕获对象的内部状态，并在对象之外保存状态

### 6、解释器 Interpreter
意图：对固定文法输入的格式解释成另一种格式输出

### 7、迭代器 Iterator
意图：提供一种方法顺序访问一个聚合对象中各个元素

### 8、状态 State
意图：允许对象在内部状态发生改变时改变它的行为

### 9、策略 Strategy
意图：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换

### 10、模板方法 TemplateMethod
意图：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中

### 11、访问者 Visitor
意图：主要将数据结构与数据操作分离，双分派技术

