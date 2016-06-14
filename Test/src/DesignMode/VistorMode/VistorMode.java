package DesignMode.VistorMode;

import java.util.ArrayList;
import java.util.List;

/**
观察者模式是对象的行为模式，又叫发布-订阅(Publish/Subscribe)模式、模型-视图(Model/View)模式、源-监听器(Source/Listener)模式或从属者(Dependents)模式。

　　观察者模式定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象。这个主题对象在状态上发生变化时，会通知所有观察者对象，使它们能够自动更新自己。

观察者模式的结构
　　一个软件系统里面包含了各种对象，就像一片欣欣向荣的森林充满了各种生物一样。在一片森林中，各种生物彼此依赖和约束，形成一个个生物链。一种生物的状态变化会造成其他一些生物的相应行动，每一个生物都处于别的生物的互动之中。

　　同样，一个软件系统常常要求在某一个对象的状态发生变化的时候，某些其他的对象做出相应的改变。做到这一点的设计方案有很多，但是为了使系统能够易于复用，应该选择低耦合度的设计方案。减少对象之间的耦合有利于系统的复用，但是同时设计师需要使这些低耦合度的对象之间能够维持行动的协调一致，保证高度的协作。观察者模式是满足这一要求的各种设计方案中最重要的一种。

　　下面以一个简单的示意性实现为例，讨论观察者模式的结构。

　　观察者模式所涉及的角色有：

　　●　　抽象主题(Subject)角色：抽象主题角色把所有对观察者对象的引用保存在一个聚集（比如ArrayList对象）里，每个主题都可以有任何数量的观察者。抽象主题提供一个接口，可以增加和删除观察者对象，抽象主题角色又叫做抽象被观察者(Observable)角色。

　　●　　具体主题(ConcreteSubject)角色：将有关状态存入具体观察者对象；在具体主题的内部状态改变时，给所有登记过的观察者发出通知。具体主题角色又叫做具体被观察者(Concrete Observable)角色。

　　●　　抽象观察者(Observer)角色：为所有的具体观察者定义一个接口，在得到主题的通知时更新自己，这个接口叫做更新接口。

　　●　　具体观察者(ConcreteObserver)角色：存储与主题的状态自恰的状态。具体观察者角色实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态 像协调。如果需要，具体观察者角色可以保持一个指向具体主题对象的引用。
 * @author lvguan.xu
 *
 */


//抽象观察者角色
interface Watcher {
	public void update(String str);

}

// 抽象主题角色，watched：被观察
interface Watched {
	public void addWatcher(Watcher watcher);

	public void removeWatcher(Watcher watcher);

	public void notifyWatchers(String str);

}

/**
 * 观察者1
 * @author lvguan.xu
 *
 */
class ConcreteWatcher1 implements Watcher {

	@Override
	public void update(String str) {
		System.out.println("观察者2" + str);
	}

}

/**
 * 观察者2
 * @author lvguan.xu
 *
 */
class ConcreteWatcher2 implements Watcher {

	@Override
	public void update(String str) {
		System.out.println("观察者2" + str);
	}

}

/**
 * 观察者3
 * @author lvguan.xu
 *
 */
class ConcreteWatcher3 implements Watcher {

	@Override
	public void update(String str) {
		System.out.println("观察者3" + str);
	}

}

class ConcreteWatched implements Watched {
	// 存放观察者
	private List<Watcher> list = new ArrayList<Watcher>();

	@Override
	public void addWatcher(Watcher watcher) {
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		list.remove(watcher);
	}

	@Override
	public void notifyWatchers(String str) {
		// 自动调用实际上是主题进行调用的
		for (Watcher watcher : list) {
			watcher.update(str);
		}
	}

}

public class VistorMode {
	public static void main(String[] args) {
		Watched girl = new ConcreteWatched();

		Watcher watcher1 = new ConcreteWatcher1();
		Watcher watcher2 = new ConcreteWatcher2();
		Watcher watcher3 = new ConcreteWatcher3();

		girl.addWatcher(watcher1);
		girl.addWatcher(watcher2);
		girl.addWatcher(watcher3);

		girl.notifyWatchers("开心");
	}

}
