package generics;

public class ThreeDPrinter<T extends Material> {
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
			return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
	
	

}
// 3d������ �ö�ƽ,�Ŀ�� Ŭ������ 3d������ Ŭ���� �ϳ��� �����ϱ� ���� ������Ʈ �ڷ��� ����Ѵٰ� ġ��,
// �� �׷��� �� �� �ż��� ����, �� �ż���� ������Ʈ �ڷ������� ��µǾ���ϰ�, �� �ż���� ������Ʈ �ڷ������� �Ű������� ������.
// �� �׷��� �׶��׶����� å P389ó�� ����ȯ�� ������� (�𸣰����� å �����)
// �� �̷��� ��Ȳ������ �츮�� ���ʸ�(���� T)�� ����Ѵ�!
// �� �̷��� ���ʸ� �س���, ���߿� ���ϴ� �ڷ����� 'Ŭ������<Powder>' �̷������� �����Ѵ�. (�������������׽�Ʈ�� ����)

// �ٵ� ���� �ö�ƽ �Ŀ���� �����ϰ� ���� �������� �ʴµ�.. �� �ö�ƽ �Ŀ���� ����Ŭ���� Material�� �������, extends�� <T>�ȿ� ��������. = <T> Ÿ�Կ� ���� ����
// �� Water�� Material�� ����Ŭ������ ���� ��������, ThreeDPrinter Ŭ������ �ڷ������� ���� �� ���� 