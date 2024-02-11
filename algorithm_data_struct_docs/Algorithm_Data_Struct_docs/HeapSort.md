- 완전 이진 트리를 기본으로 하는 Heap 자료구조 기반 정렬.
- HeapSort는 불안정 정렬에 속한다.

#### 시간 복잡도
- O(nlogn)

#### 완전 이진 트리?
- 삽입할 때 왼쪽부터 차례대로 추가하는 이진 트리.

### 과정
- maxheap을 구성한다.
- root node의 요소(최대값)와 마지막 요소(heap_size - 1번째)를 교환하고 heap_size를 1 줄인다.
- HeapSize가 1보다 큰 경위 위의 과정을 반복한다.

### 구현 내용

#### maxHeapSorting(int\[] arr, int heap_size)
- heap_size == 1 ? return; // heap_size가 1이면 바꿀게 없으니 반환
- cnt = heap_size / 2 - 1 to 0 // 자식 노드를 가진 가장 아래 노드부터 루트까지 진행
	- maxHeapify(arr, cnt, heap_size);
- swap arr\[0] and arr\[heap_size - 1]; // 루트 노드(최대값)와 마지막 노드 교환
- maxHeapSorting(arr, heap_size - 1); // heap_size를 1 줄이고 다음 정렬 진행

#### maxHeapify(int\[] arr, int node, int heap_size)
- biggest = node, left = 2 \* node + 1, right = 2 \* node + 2;
- biggest = maxIndex(arr\[node], arr\[left], arr\[right]);
- biggest != node ? swap arr\[node] and arr\[biggest];