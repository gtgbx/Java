package DesignMode.VistorMode;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式应用场景实例
 *
 * 免责声明:本文只是以哈票网举例，示例中并未涉及哈票网任何业务代码，全部原创，如有雷同，纯属巧合。
 *
 * 场景描述：
 * 哈票以购票为核心业务(此模式不限于该业务)，但围绕购票会产生不同的其他逻辑，如：
 * 1、购票后记录文本日志
 * 2、购票后记录数据库日志
 * 3、购票后发送短信
 * 4、购票送抵扣卷、兑换卷、积分
 * 5、其他各类活动等
 *
 * 传统解决方案:
 * 在购票逻辑等类内部增加相关代码，完成各种逻辑。
 *
 * 存在问题：
 * 1、一旦某个业务逻辑发生改变，如购票业务中增加其他业务逻辑，需要修改购票核心文件、甚至购票流程。
 * 2、日积月累后，文件冗长，导致后续维护困难。
 *
 * 存在问题原因主要是程序的"紧密耦合"，使用观察模式将目前的业务逻辑优化成"松耦合"，达到易维护、易修改的目的，
 * 同时也符合面向接口编程的思想。
 *
 * 观察者模式典型实现方式：
 * 1、定义2个接口：观察者（通知）接口、被观察者（主题）接口
 * 2、定义2个类，观察者对象实现观察者接口、主题类实现被观者接口
 * 3、主题类注册自己需要通知的观察者
 * 4、主题类某个业务逻辑发生时通知观察者对象，每个观察者执行自己的业务逻辑。
 *
 * 示例：如以下代码
 *
 */
/**
 * 
 * 观察者接口(通知接口)
 * 
 */
interface ITicketObserver // 观察者接口
{
	void onBuyTicketOver(String Jticket); // 得到通知后调用的方法
}

/**
 * 
 * 主题接口
 * 
 */
interface ITicketObservable // 被观察对象接口
{
	void addObserver(ITicketObserver Jobserver); // 提供注册观察者方法
}

/**
 * 
 * 主题类（购票）
 * 
 */
class HipiaoBuy implements ITicketObservable { // 实现主题接口（被观察者）
	private List<ITicketObserver> J_observers = new ArrayList<ITicketObserver>(); // 通知数组（观察者）

	public void buyTicket(String Jticket) // 购票核心类，处理购票流程
	{
		// TODO 购票逻辑

		// 循环通知，调用其onBuyTicketOver实现不同业务逻辑
		for (ITicketObserver Jobs : this.J_observers)
			Jobs.onBuyTicketOver(Jticket); // Jthis 可用来获取主题类句柄，在通知中使用
	}

	// 添加通知
	public void addObserver(ITicketObserver Jobserver) // 添加N个通知
	{
		this.J_observers.add(Jobserver);
	}
}

// 短信日志通知
class HipiaoMSM implements ITicketObserver {
	public void onBuyTicketOver(String Jticket) {
		System.out.println(" 短信日志记录：购票成功:" + Jticket);
	}
}

// 文本日志通知
class HipiaoTxt implements ITicketObserver {
	public void onBuyTicketOver(String Jticket) {
		System.out.println(" 文本日志记录：购票成功:" + Jticket);
	}
}

// 抵扣卷赠送通知
class HipiaoDiKou implements ITicketObserver {
	public void onBuyTicketOver(String Jticket) {
		System.out.println(" 赠送抵扣卷：购票成功:" + Jticket + "赠送10元抵扣卷1张");
	}
}

public class VistorMode2 {
	public static void main(String[] args) {
		HipiaoBuy Jbuy = new HipiaoBuy();
		Jbuy.addObserver(new HipiaoMSM()); // 根据不同业务逻辑加入各种通知
		Jbuy.addObserver(new HipiaoTxt());
		Jbuy.addObserver(new HipiaoDiKou());
		// 购票
		Jbuy.buyTicket("一排一号");
	}
}
