package DesignMode.VistorMode;

import java.util.ArrayList;
import java.util.List;

/**
�۲���ģʽ�Ƕ������Ϊģʽ���ֽз���-����(Publish/Subscribe)ģʽ��ģ��-��ͼ(Model/View)ģʽ��Դ-������(Source/Listener)ģʽ�������(Dependents)ģʽ��

�����۲���ģʽ������һ��һ�Զ��������ϵ���ö���۲��߶���ͬʱ����ĳһ���������������������״̬�Ϸ����仯ʱ����֪ͨ���й۲��߶���ʹ�����ܹ��Զ������Լ���

�۲���ģʽ�Ľṹ
����һ�����ϵͳ��������˸��ֶ��󣬾���һƬ�������ٵ�ɭ�ֳ����˸�������һ������һƬɭ���У���������˴�������Լ�����γ�һ������������һ�������״̬�仯���������һЩ�������Ӧ�ж���ÿһ�����ﶼ���ڱ������Ļ���֮�С�

����ͬ����һ�����ϵͳ����Ҫ����ĳһ�������״̬�����仯��ʱ��ĳЩ�����Ķ���������Ӧ�ĸı䡣������һ�����Ʒ����кܶ࣬����Ϊ��ʹϵͳ�ܹ����ڸ��ã�Ӧ��ѡ�����϶ȵ���Ʒ��������ٶ���֮������������ϵͳ�ĸ��ã�����ͬʱ���ʦ��Ҫʹ��Щ����϶ȵĶ���֮���ܹ�ά���ж���Э��һ�£���֤�߶ȵ�Э�����۲���ģʽ��������һҪ��ĸ�����Ʒ���������Ҫ��һ�֡�

����������һ���򵥵�ʾ����ʵ��Ϊ�������۹۲���ģʽ�Ľṹ��

�����۲���ģʽ���漰�Ľ�ɫ�У�

�����񡡡���������(Subject)��ɫ�����������ɫ�����жԹ۲��߶�������ñ�����һ���ۼ�������ArrayList�����ÿ�����ⶼ�������κ������Ĺ۲��ߡ����������ṩһ���ӿڣ��������Ӻ�ɾ���۲��߶��󣬳��������ɫ�ֽ������󱻹۲���(Observable)��ɫ��

�����񡡡���������(ConcreteSubject)��ɫ�����й�״̬�������۲��߶����ھ���������ڲ�״̬�ı�ʱ�������еǼǹ��Ĺ۲��߷���֪ͨ�����������ɫ�ֽ������屻�۲���(Concrete Observable)��ɫ��

�����񡡡�����۲���(Observer)��ɫ��Ϊ���еľ���۲��߶���һ���ӿڣ��ڵõ������֪ͨʱ�����Լ�������ӿڽ������½ӿڡ�

�����񡡡�����۲���(ConcreteObserver)��ɫ���洢�������״̬��ǡ��״̬������۲��߽�ɫʵ�ֳ���۲��߽�ɫ��Ҫ��ĸ��½ӿڣ��Ա�ʹ�����״̬�������״̬ ��Э���������Ҫ������۲��߽�ɫ���Ա���һ��ָ����������������á�
 * @author lvguan.xu
 *
 */


//����۲��߽�ɫ
interface Watcher {
	public void update(String str);

}

// ���������ɫ��watched�����۲�
interface Watched {
	public void addWatcher(Watcher watcher);

	public void removeWatcher(Watcher watcher);

	public void notifyWatchers(String str);

}

/**
 * �۲���1
 * @author lvguan.xu
 *
 */
class ConcreteWatcher1 implements Watcher {

	@Override
	public void update(String str) {
		System.out.println("�۲���2" + str);
	}

}

/**
 * �۲���2
 * @author lvguan.xu
 *
 */
class ConcreteWatcher2 implements Watcher {

	@Override
	public void update(String str) {
		System.out.println("�۲���2" + str);
	}

}

/**
 * �۲���3
 * @author lvguan.xu
 *
 */
class ConcreteWatcher3 implements Watcher {

	@Override
	public void update(String str) {
		System.out.println("�۲���3" + str);
	}

}

class ConcreteWatched implements Watched {
	// ��Ź۲���
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
		// �Զ�����ʵ������������е��õ�
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

		girl.notifyWatchers("����");
	}

}
