package ncs.test;
import java.util.Arrays;


public class Test {

    public static void main(String[] args) {
        
        int[] arr = new int[10];
        
        if(inputRandomNumber2(arr, 1, 10))
        {
            System.out.println(Arrays.toString(arr));
        }else{
            System.out.println("실패");
        }
       
    
    }
   
    public static boolean inputRandomNumber(int[] arr, int minNum, int maxNum) {

        // 배열길이보다 난수범위가 더 작으면 안되기에 false리턴하고 종료하고 나간다.
        if (arr.length > maxNum - minNum + 1) {
          return false;
        }
        int random = 0;
        int f = 0; // 중복체크를 위한 변수

        // 배열에 minNum 에서 ~ maxNum 까지의 난수를 (중복없이) 집어넣음
        for (int i = 0; i < arr.length; i++) {

          f = 0;
          random = (int) (Math.random() * (maxNum - minNum + 1)) + minNum;

          // 중복 검사
          for (int j = 0; j < i; j++) {
            if (arr[j] == random) {
              i--; // 중복이 검출되면 i 값을 1감소시켜서 상위 포문을 다시 돌게하고
              f = 1;
              break; // 중복검사를 위한 반복문 종료.
            }
          }

          // 중복이 없으면 배열에 집어넣기
          if (f == 0) {
            arr[i] = random;
          }
        }
        return true;
      }

  
  public static boolean inputRandomNumber2(int[] arr, int minNum, int maxNum) {
  
      // 배열길이보다 난수범위가 더 작으면 안되기에 false리턴하고 종료하고 나간다.
      if (arr.length > maxNum - minNum + 1) {
        return false;
      }
  
      // 배열에 minNum 에서 ~ maxNum 까지의 난수를 (중복없이) 집어넣음
      for (int i = 0; i < arr.length; i++) {
  
        arr[i] = (int) (Math.random() * (maxNum - minNum + 1)) + minNum;
  
        // 중복 검사
        for (int j = 0; j < i; j++) {
          if (arr[j] == arr[i]) {
            i--; // 중복이 검출되면 i 값을 1감소시켜서 상위 포문을 다시 돌게하고
            break; // 중복검사를 위한 반복문 종료.
          }
        }
      }
      return true;
    }
  }

