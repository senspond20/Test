package ncs.test;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {

		int[] array = new int[10];

		int random = 0;

		// 배열에 1~ 100 사이의 난수를 중복허용없이 집어넣음
		if (inputRandomNumber(array, 1, 10, true)) {
			print(array);
			System.out.println(Arrays.toString(array));
			System.out.println();
			System.out.println("최대값 : " + max(array));
			System.out.println("최소값 : " + min(array));
			System.out.println("합계 : " + sum(array));
			System.out.println("평균 : " + avg(array));
			System.out.println("홀수개수 : " + oddCount(array));
			System.out.println("짝수개수 : " + evenCount(array));	
		} else 
			System.out.println("난수 할당 실패");
		
	}
	  public boolean inputRandomNumber(int[] arr, int minNum, int maxNum) {

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
	// 연습
	public static boolean inputRandomNumber(int[] arr, int minNum, int maxNum, boolean ck) {

		int random = 0;

		if (ck == false) {

			// 배열에 minNum 에서 ~ maxNum 까지의 난수를 집어넣음
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random() * (maxNum - minNum + 1)) + minNum;
			}
			return true;

		} else {

			// 중복을 허용하지 않을때 배열길이보다 난수범위가 더 작으면 안되기에 false리턴하고 종료하고 나간다.
			if (arr.length > maxNum - minNum + 1) {
				return false;
			}
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
	}

	// 배열의 합계를 계산해서 리턴함
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// 배열의 평균을 계산해서 리턴함
	public static double avg(int[] arr) {
		return sum(arr) / arr.length;
	}

	// 배열에서 가장 큰 값을 찾아서 리턴
	public static int max(int[] arr) {

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		return max;
	}

	// 배열에서 가장 작은값 찾아서 리턴
	public static int min(int[] arr) {

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}

		}
		return min;
	}

	// 배열에서 짝수의 개수를 리턴함
	public static int evenCount(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	// 배열에서 홀수의 개수를 리턴함
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
