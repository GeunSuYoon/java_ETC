- 트리 형식에서 최소의 공통 조상을 찾는 알고리즘.
	- 두 정점이 만나는 최소 부모 정점을 찾는 것!

### 구현 내용

#### lowestCommonAncestor(int\[] arr, int child_a, int child_b)
- arrLen = arr.len, nodeAIdx = index of nodeA in arr, nodeBIdx = index of nodeB in arr;
- nodeAIdx == -1 or nodeBIdx == -1 ? return -1; // 못 찾음
- makeDepth(depthList, arrLen) // arrLen에 맞춰 depthList 만들기.
- while (true) // 찾을 때 까지 돈다
	- depthList\[nodeAIdx] != depthList\[nodeBIdx] // 두 노드의 깊이가 다름
		- smallerNodeIdx = (smallerNodeIdx + 1) / 2 - 1; // 깊이가 깊은 노드를 부모 노드 idx로 옮김.
	- else
		- nodeAIdx == nodeBIdx ? return arr\[Idx]; //두 노드의 인덱스가 같다면 노드값 반환
		- eachIdx = (eachIdx + 1) / 2 - 1; // 두 인덱스 전부 부모 인덱스로 옮김.

#### makeDepth(Vector<> depthList, int arrLen)
- depthList\[0] = 0; //루트의 깊이는 0
- for cnt = 1 to arrLen - 1
	- depthList\[cnt] = depthList\[(cnt - 1) / 2] + 1; //부모 노드의 깊이 + 1