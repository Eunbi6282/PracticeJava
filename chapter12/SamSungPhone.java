package book.chapter12;
// �Ｚ ������ Ư¡ ������
public class SamSungPhone implements PhoneInterface{
	@Override
	public void sendCall() {
		System.out.println("�츮����");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ��������");
	}

	//�߰����� SamSungPhone���� ����� �߰�
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
}
