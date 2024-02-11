- 다익스트라 알고리즘.
- DP를 활용한 최단 경로 탐색 알고리즘.
- 한 번 최단 거리를 구하면 다시 구할 필요가 없으므로 DP를 활용할 수 있다!
- 아래의 두 정보가 필요하다.
	- 최단 거리
	- 정점 방문 여부

### 알아야 할 점
- 인접 행렬로 구현하면 시간 복잡도는 O(n^2)
- 인접 리스트로 구현하면 시간 복잡도는 O(nlogn)
	- 선형 탐색으로 시간 초과가 나면 인접 리스트로 접근(우선순위 큐)
- 거리 값이 양수일 때만 가능하다!

### 구현 방식
- n개의 노드가 들어왔다고 가정하고, map\[i]\[j]는 i번째 노드와 j번째 노드 사이의 거리라고 가정하자. 이어져있지 않다면 INF 값을 가진다. 시작 노드를 start라고 가정하자.
- distance\[n];
- for cnt = 0 to n - 1
	- distance\[cnt] = map\[start]\[cnt];
- distance\[start] = 0;
- visited\[n] = {0, };
- visitCnt = 0;
- nowNode = start
- while visitCnt < n
	- visited\[nowNode] = 1;
	- visitCnt++;
	- minDistanceNode, minDistance = INF;
	- for cnt = 0 to n - 1
		- visited\[cnt] != 0 && distance\[nowNode] + map\[nowNode]\[cnt] < minDistance
			- ? minDistance = distance\[nowNode] + map\[nowNode]\[cnt];
				 minDistanceNode = cnt;
	- nowNode = minDistanceNode;
