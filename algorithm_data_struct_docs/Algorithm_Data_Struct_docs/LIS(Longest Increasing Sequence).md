- 최장 증가 수열
- ex) \[7, **2**, **3**, 8, **4**, **5**] > \[2, 3, 4, 5]가 가장 길게 증가하는 수열이다.

### 구현 방법(시간 복잡도)
- DP : O(n^2)
- Lower Bound : O(nlogn)
- 즉, n이 크다면 Lower Bound를 활용하는 것이 좋다!

### 구현 내용(DP), 가장 긴 길이 출력

#### longestIncreasingSequence(int[] arr)
- arrLen = arr.len, dp = new int\[arrLen];
- for comp = 0 to arrLen - 1 //비교할 요소(이전) 인덱스
	- for idx = comp + 1 to arrLen //현재 요소 인덱스
		- arr\[idx] > arr\[comp] ? dp\[idx] = max(dp\[idx], dp\[comp] + 1); //만일 이전 요소보다 지금 요소가 더 크다면 지금 길이와 이전 요소의 길의 + 1 중 더 큰 값으로 교환.

- 만일 해당 array를 반환하라고 했다면 dp를 arrLen의 2차원 배열로 선언해 마지막 값이 가장 큰 요소의 값이 변하는 부분의 인덱스 값을 모아 반환하면 될 것 같다!