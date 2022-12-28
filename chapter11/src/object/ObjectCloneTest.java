package object;

class Point{
	int x;
	int y;
	
	Point (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString () {
		return "x =" + x + " , y =" + y;
	}
}

class Circle implements Cloneable{ //�̰� ��� Ŭ�� �ż����̰� ��� Ŭ�� �ż����̰� ��� Ŭ�� �ż����̰� ��� Ŭ�� �ż���
	
	Point point; //���� ����Ʈ Ŭ���� �޾ƴٰ� ����.
	private int radius;
	
	Circle(int x, int y, int radius){
		point = new Point(x,y);
		this.radius = radius;
	}
	public String toString() {
		return "������ " + point + "�̰�, �������� ���̴� " + radius + "�Դϴ�.";
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException { //�̰� ��� Ŭ�� �ż��� �̰� ��� Ŭ�� �ż��� �̰� ��� Ŭ�� �ż���
 		
		return super.clone();
	}
	
	
	
	
}



public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10, 20, 5);
		Circle clonecircle = (Circle)circle.clone(); //(Circle�� Ŭ�иż��� �������� ����Ʈ�����̱⶧���� ��Ŭ������ �ٲ��ذ�.)
		
		System.out.println(circle.hashCode());
		System.out.println(clonecircle.hashCode());
		
		System.out.println(circle.toString());
		System.out.println(clonecircle.toString());

	}

}
