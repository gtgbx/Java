package DesignMode.VistorMode;

import java.util.ArrayList;
import java.util.List;

/**
 * �۲���ģʽӦ�ó���ʵ��
 *
 * ��������:����ֻ���Թ�Ʊ��������ʾ���в�δ�漰��Ʊ���κ�ҵ����룬ȫ��ԭ����������ͬ�������ɺϡ�
 *
 * ����������
 * ��Ʊ�Թ�ƱΪ����ҵ��(��ģʽ�����ڸ�ҵ��)����Χ�ƹ�Ʊ�������ͬ�������߼����磺
 * 1����Ʊ���¼�ı���־
 * 2����Ʊ���¼���ݿ���־
 * 3����Ʊ���Ͷ���
 * 4����Ʊ�͵ֿ۾��һ�������
 * 5������������
 *
 * ��ͳ�������:
 * �ڹ�Ʊ�߼������ڲ�������ش��룬��ɸ����߼���
 *
 * �������⣺
 * 1��һ��ĳ��ҵ���߼������ı䣬�繺Ʊҵ������������ҵ���߼�����Ҫ�޸Ĺ�Ʊ�����ļ���������Ʊ���̡�
 * 2���ջ����ۺ��ļ��߳������º���ά�����ѡ�
 *
 * ��������ԭ����Ҫ�ǳ����"�������"��ʹ�ù۲�ģʽ��Ŀǰ��ҵ���߼��Ż���"�����"���ﵽ��ά�������޸ĵ�Ŀ�ģ�
 * ͬʱҲ��������ӿڱ�̵�˼�롣
 *
 * �۲���ģʽ����ʵ�ַ�ʽ��
 * 1������2���ӿڣ��۲��ߣ�֪ͨ���ӿڡ����۲��ߣ����⣩�ӿ�
 * 2������2���࣬�۲��߶���ʵ�ֹ۲��߽ӿڡ�������ʵ�ֱ����߽ӿ�
 * 3��������ע���Լ���Ҫ֪ͨ�Ĺ۲���
 * 4��������ĳ��ҵ���߼�����ʱ֪ͨ�۲��߶���ÿ���۲���ִ���Լ���ҵ���߼���
 *
 * ʾ���������´���
 *
 */
/**
 * 
 * �۲��߽ӿ�(֪ͨ�ӿ�)
 * 
 */
interface ITicketObserver // �۲��߽ӿ�
{
	void onBuyTicketOver(String Jticket); // �õ�֪ͨ����õķ���
}

/**
 * 
 * ����ӿ�
 * 
 */
interface ITicketObservable // ���۲����ӿ�
{
	void addObserver(ITicketObserver Jobserver); // �ṩע��۲��߷���
}

/**
 * 
 * �����ࣨ��Ʊ��
 * 
 */
class HipiaoBuy implements ITicketObservable { // ʵ������ӿڣ����۲��ߣ�
	private List<ITicketObserver> J_observers = new ArrayList<ITicketObserver>(); // ֪ͨ���飨�۲��ߣ�

	public void buyTicket(String Jticket) // ��Ʊ�����࣬����Ʊ����
	{
		// TODO ��Ʊ�߼�

		// ѭ��֪ͨ��������onBuyTicketOverʵ�ֲ�ͬҵ���߼�
		for (ITicketObserver Jobs : this.J_observers)
			Jobs.onBuyTicketOver(Jticket); // Jthis ��������ȡ������������֪ͨ��ʹ��
	}

	// ���֪ͨ
	public void addObserver(ITicketObserver Jobserver) // ���N��֪ͨ
	{
		this.J_observers.add(Jobserver);
	}
}

// ������־֪ͨ
class HipiaoMSM implements ITicketObserver {
	public void onBuyTicketOver(String Jticket) {
		System.out.println(" ������־��¼����Ʊ�ɹ�:" + Jticket);
	}
}

// �ı���־֪ͨ
class HipiaoTxt implements ITicketObserver {
	public void onBuyTicketOver(String Jticket) {
		System.out.println(" �ı���־��¼����Ʊ�ɹ�:" + Jticket);
	}
}

// �ֿ۾�����֪ͨ
class HipiaoDiKou implements ITicketObserver {
	public void onBuyTicketOver(String Jticket) {
		System.out.println(" ���͵ֿ۾���Ʊ�ɹ�:" + Jticket + "����10Ԫ�ֿ۾�1��");
	}
}

public class VistorMode2 {
	public static void main(String[] args) {
		HipiaoBuy Jbuy = new HipiaoBuy();
		Jbuy.addObserver(new HipiaoMSM()); // ���ݲ�ͬҵ���߼��������֪ͨ
		Jbuy.addObserver(new HipiaoTxt());
		Jbuy.addObserver(new HipiaoDiKou());
		// ��Ʊ
		Jbuy.buyTicket("һ��һ��");
	}
}
