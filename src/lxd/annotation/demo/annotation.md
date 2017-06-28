#注解的分类：
1.按照运行机制分：

* 源码注解
* 编译时注解
* 运行时注解

2.按照来源分：

- JDK自带注解
- 第三方注解
- 自定义注解

3.元注解：给注解进行注解,即注解的注解


#自定义注解
1.语法要求

+ 使用**@interface**关键字定义注解
+ 成员以**无参无异常**方式声明
+ 可以用**default**为成员指定一个默认值
+ 成员类型是受限的,合法的类型包括**原始类型及String、Class、Annotation、Enumeration**
+ 如果注解只有一个成员，则成员名必须取名为**value()**,在使用时可以忽略成员名和赋值号(=)

#元注解

##@Target:注解的作用域

例:@Target({ElementType.METHOD, ElementType.TYPE})

ElementType 包括:	

- CONSTRUCTOR 构造方法声明
- FIELD 字段声明
- LOCAL_VARIABLE 局部变量声明
- METHOND 方法声明	
- PACKAGE 包声明
- PARAMETER 参数声明
- TYPE 类/接口 声明

##@Rentention: 生命周期

RetentionPolicy：
- SOURCE 只在源码显示，编译时会丢弃
- CLASS 编译时会记录到class中，运行时忽略
- RUNTIME 运行时存在，可以通过反射读取

##@Inherited: 允许子类继承,接口实现的不可以。只能是类上的注解继承,方法上的注解内容不能继承

##@Documented: 生成javadoc时会包含注解




