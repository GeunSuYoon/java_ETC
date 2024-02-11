- Sliding Window라고도 불린다.
- 완전 탐색으로 해결하려면 시간 초과가 날 수도 있는데, 그 대안으로 쓰이기도 한다.
- 1차원 배열에서 각자 다른 원소를 가리키는 두 개의 포인터를 조작해 원하는 것을 얻는 형태.

- 구간 합 및 백준 # 18870(좌표 압축)에서 내가 사용한 중복 원소 제거 등에서 시간 복잡도를 O(n)으로 모든 배열의 원소를 훑어볼 수 있다.

### 구현 내용(중복 원소 제거)
- 배열이 정렬되어있다 가정하자.
- arr_ptr = 0;
- for arr_cnt = 1 to arr_len - 1
	- arr\[arr_ptr] != arr\[arr_cnt]
		- arr\[++arr_ptr] = arr\[arr_cnt]
- 이후 arr_ptr을 arr_len으로 참고할 수 있다!

### 구현 내용(수들의 합, 백준 2003)
- n = arr_len, m = target
- front_ptr = 0, sum = 0, m_case = 0
- for rear_ptr = 0 to n - 1
	- sum += arr\[rear_ptr]
	- m < sum ?
		- while m < sum
			- sum -= arr\[front_ptr++]
	- m == sum ? m_case++