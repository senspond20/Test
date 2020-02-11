package ncs.test;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {

		int[] array = new int[10];

		int random = 0;

		// �迭�� 1~ 100 ������ ������ �ߺ������� �������
		if (inputRandomNumber(array, 1, 10, true)) {
			print(array);
			System.out.println(Arrays.toString(array));
			System.out.println();
			System.out.println("�ִ밪 : " + max(array));
			System.out.println("�ּҰ� : " + min(array));
			System.out.println("�հ� : " + sum(array));
			System.out.println("��� : " + avg(array));
			System.out.println("Ȧ������ : " + oddCount(array));
			System.out.println("¦������ : " + evenCount(array));	
		} else 
			System.out.println("���� �Ҵ� ����");
		
	}
	  public boolean inputRandomNumber(int[] arr, int minNum, int maxNum) {

	      // �迭���̺��� ���������� �� ������ �ȵǱ⿡ false�����ϰ� �����ϰ� ������.
	      if (arr.length > maxNum - minNum + 1) {
	        return false;
	      }

	      // �迭�� minNum ���� ~ maxNum ������ ������ (�ߺ�����) �������
	      for (int i = 0; i < arr.length; i++) {

	        arr[i] = (int) (Math.random() * (maxNum - minNum + 1)) + minNum;

	        // �ߺ� �˻�
	        for (int j = 0; j < i; j++) {
	          if (arr[j] == arr[i]) {
	            i--; // �ߺ��� ����Ǹ� i ���� 1���ҽ��Ѽ� ���� ������ �ٽ� �����ϰ�
	            break; // �ߺ��˻縦 ���� �ݺ��� ����.
	          }
	        }
	      }
	      return true;
	    }
	// ����
	public static boolean inputRandomNumber(int[] arr, int minNum, int maxNum, boolean ck) {

		int random = 0;

		if (ck == false) {

			// �迭�� minNum ���� ~ maxNum ������ ������ �������
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random() * (maxNum - minNum + 1)) + minNum;
			}
			return true;

		} else {

			// �ߺ��� ������� ������ �迭���̺��� ���������� �� ������ �ȵǱ⿡ false�����ϰ� �����ϰ� ������.
			if (arr.length > maxNum - minNum + 1) {
				return false;
			}
			int f = 0; // �ߺ�üũ�� ���� ����

			// �迭�� minNum ���� ~ maxNum ������ ������ (�ߺ�����) �������
			for (int i = 0; i < arr.length; i++) {

				f = 0;
				random = (int) (Math.random() * (maxNum - minNum + 1)) + minNum;

				// �ߺ� �˻�
				for (int j = 0; j < i; j++) {
					if (arr[j] == random) {
						i--; // �ߺ��� ����Ǹ� i ���� 1���ҽ��Ѽ� ���� ������ �ٽ� �����ϰ�
						f = 1;
						break; // �ߺ��˻縦 ���� �ݺ��� ����.
					}
				}

				// �ߺ��� ������ �迭�� ����ֱ�
				if (f == 0) {
					arr[i] = random;
				}
			}
			return true;
		}
	}

	// �迭�� �հ踦 ����ؼ� ������
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// �迭�� ����� ����ؼ� ������
	public static double avg(int[] arr) {
		return sum(arr) / arr.length;
	}

	// �迭���� ���� ū ���� ã�Ƽ� ����
	public static int max(int[] arr) {

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		return max;
	}

	// �迭���� ���� ������ ã�Ƽ� ����
	public static int min(int[] arr) {

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}

		}
		return min;
	}

	// �迭���� ¦���� ������ ������
	public static int evenCount(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	// �迭���� Ȧ���� ������ ������
	public static int oddCount(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 1) {
				count++;
			}
		}
		return count;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
