---
title: 门面模式
date: 2023-04-30 15:16:16
tags: design pattern
---

# 模式描述

门面模式(Facade)模式，为子系统提供一组统一的接口，定义一组高层接口让子系统更易用，这个接口使得子系统更容易使用。

# 优点

1. 屏蔽了子系统组件；
1. 拆分用户和子系统；

# 缺点

# 应用场景

1. 解决易用性问题。例如 Linux 系统提供的系统调用函数等；
1. 解决性能问题。
1. 解决分布式事务问题。
1. 拆分客户端和实现之间的依赖；

<!-- more -->

|     DATE      |    CHANGELOG     |
| :-----------: | :--------------: |
| 2023年4月30日 |      初始化      |
| 2023年5月1日  | 添加 Go 语言实现 |

# UML 类图

```mermaid
classDiagram

class Facade {
	<<interface>>
	operator()
}

class ConcreteFacade {
	operator()
}

Facade <|.. ConcreteFacade

ConcreteFacade o.. SubSystem1
ConcreteFacade o.. SubSystem2

Facade <-- Client
```

# 参与者

## Facade 接口

- 向 Client 提供处理任务的接口；
- 组合 SubSystemX 功能；

## ConcreteFacade 类

- facade 接口的实现；

## SubSystemX

- 子系统

## Client 类

- 客户端

# 数据流

1. Client 调用 Facade 时，Facade 将请求转发到 SubSystem 中；
1. Client 不需要访问 SubSystem；

# 相关模式

- 抽象工厂：

# 补充

- 门面模式是通过门面接口提供了对封装底层组合功能的封装。

# 示例代码

[golang](https://github.com/hanzhang2566/design-patterns-examples/blob/main/go-patterns/structural/facade/facade_test.go)

[java](https://github.com/hanzhang2566/design-patterns-examples/blob/main/java-patterns/src/test/java/structural/facade/ClientTest.java)
