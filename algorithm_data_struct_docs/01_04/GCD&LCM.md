>최대공약수, 최소공배수

### GCD (Greatest Common Divisor)
- 두 자연수의 공통된 약수 중 가장 큰 수.
### LCM (Least Common Multiple)
- 두 자연수의 공통된 배수 중 가장 작은 수.

### 유클리드 호제법 (Euclidean Algorithm)
- 2개의 자연수가 주어졌을 때 서로 나눠 원하는 수를 얻는 방법.
- 2개의 자연수 a, b에 대해 a를 b로 나눈 나머지를 r이라고 하면(단, a > b), a와 b의 최대공약수는 b와 r의 최대공약수와 같다. 즉, 아래와 같은 방법을 반복하면 최대공약수를 얻을 수 있다.
	- while true
	- a % b = r; (a > b)
	- r == 0 ? return b;
	- a = b, b = r;
- 이를 이용해 최대공약수 r을 얻어냈다고 한다면 최소공배수는 두 수를 곱하고 r로 나눈 값이다. (LCM = a * b / r)