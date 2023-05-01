---
title: 代理模式
date: 2023-04-28 20:55:01
tags: design pattern
---
# 模式描述

不改变原始类（或叫被代理类）代码的情况下，通过引入代理类来控制这个对象的访问。

# 优点

1. 比静态的继承更加灵活；
1. 避免高层接口的功能太复杂。

# 缺点

1. 有很多小对象；

# 应用场景

1. 业务系统的非功能性需求开发。监控、统计、鉴权、限流、事务、幂等、日志。

1. RPC

1. 缓存

<!-- more -->

|     DATE      |    CHANGELOG     |
| :-----------: | :--------------: |
| 2023年4月28日 |      初始化      |
| 2023年5月1日  | 添加 Go 语言实现 |

# UML 类图

```mermaid
classDiagram
class Subject {
	<<interface>>
	operator()
}

class RealSubject {
	operator()
}

class Proxy {
	operator()
}

Subject <|.. Proxy
Subject <|.. RealSubject
Proxy o.. RealSubject

Subject <-- Client
```

# 参与者

## Subject 接口

- 定义 Proxy 和 RealSubject 的方法，使得任何使用 RealSubject 的地方可以被 proxy 代替；

## Proxy 类

- 代理类。

## RealSubject 类

- 被代理类

## Client 类

- 客户端

# 数据流

1. client 创建一个 Component；
1. 通过 Decorator 层层包装 client；
1. 调用 Component 提供的方法进行工作；

# 相关模式

- 适配器模式：装饰者模式仅改变对象职责，而适配器模式将给对象一个全新的接口；
- 组合模式：装饰器模式被认为是退化为只有一个组件的组合；
- 策略模式：装饰器模式改变的是对象外表，而策略模式改变对象内核。

# 补充

- 静态代理的缺点：1. 编写的目标代理类太多；2. 当代理类接口改变，所有的代理类都需要进行更新。

  使用反射可以完成原始类的动态代理。

- 原始类能够定义接口，一般都是采用实现接口的方式。例如，Spring AOP。

- 原始类没有定义接口，也没办法给原始类重新定义接口，一般都是采用继承的方式实现代理。例如，cglib。

# 示例代码

[golang](https://github.com/hanzhang2566/design-patterns-examples/blob/main/go-patterns/structural/proxy/proxy_test.go)

[java](https://github.com/hanzhang2566/design-patterns-examples/blob/main/java-patterns/src/test/java/structural/proxy/ClientTest.java)
