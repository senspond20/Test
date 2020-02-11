package ncs.test;
import java.util.Arrays;


public class Test {

    public static void main(String[] args) {
        
        int[] arr = new int[10];
        
        if(inputRandomNumber2(arr, 1, 10))
        {
            System.out.println(Arrays.toString(arr));
        }else{
            System.out.println("����");
        }
       
    
    }
   
    public static boolean inputRandomNumber(int[] arr, int minNum, int maxNum) {

        // �迭���̺��� ���������� �� ������ �ȵǱ⿡ false�����ϰ� �����ϰ� ������.
        if (arr.length > maxNum - minNum + 1) {
          return false;
        }
        int random = 0;
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

  
  public static boolean inputRandomNumber2(int[] arr, int minNum, int maxNum) {
  
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
  }

