### 운영체제란?

운영체제(Operating System, 이하 OS)란 컴퓨터 하드웨어 바로 윗단에 설치되는 소프트웨어이다. 컴퓨터를 구성하는 요소 중 운영체제의 위상은 아래와 같다.
![[Pasted image 20240211203358.png]]
OS 자체도 하나의 소프트웨어로써 전원이 켜짐과 동시에 메모리에 올라간다.
하지만, OS처럼 대규모 프로그램이 모두 메모리에 올라가면 한정된 메모리 공간의 낭비가 발생한다.
따라서 OS 중 항상 필요한 부분만 전원이 켜짐과 동시에 메모리에 올려놓고 그렇지 않은 부분은 필요할 때만 메모리로 올려서 사용함.
- 메모리에 상주하는 OS의 부분 -> 커널(Kernel, 좁은 의미의 OS)
- 커널은 OS 코드 중 가장 핵심적인 부분.

### 운영체제의 기능

OS는 컴퓨터 하드웨어(이하 HW)와 사용자 사이에 존재하며, 사용자가 직접 운영하기 힘든 HW에 대해 OS가 관리하기도 하고, 사용자에게 편리한 인터페이스 제공(Windows, MAC OS 등).

아래와 같은 기능을 한다.
- 컴퓨터 시스템 내의 자원을 효율적으로 관리
- 컴퓨터 시스템을 편리하게 사용할 수 있는 환경 제공
- 사용자 및 프로그램들 간 자원을 형평성 있게 분배하는 균형자 역할
- 사용자와 OS 자신을 보호하는 역할

### 운영체제의 분류

동시 작업 지원 여부에 따라 단일 작업용 OS와 다중 작업용 OS로 나눌 수 있다.

1. 단일 작업용 OS
	- 한 번에 하나의 프로그램만 수행할 수 있는 OS
	- MS Windows 전 DOS 환경에서는 하나의 프로그램을 수행하는 동안 다른 프로그램을 수행할 수 있는 명령어 입력 라인이 뜨지 않아 한 번에 하나의 작업만 가능했다.

최근에는 대부분 OS가 다중 작업을 지원.

MS Windows나 Unix 환경에서는 하나의 프로그램의 수행이 끝나기 전 다른 프로그램 수행 가능.

다만, 다중 작업용 OS에서는 여러 프로그램이 CPU와 메모리 등 리소스를 공유하지만 CPU는 하나밖에 없다.
즉, 다중 작업용 OS라 하더라도 CPU에서는 매순간 하나의 프로그램만 수행한다.

이는 CPU 처리 속도가 워낙 빨라 수 ms 이내의 짦은 시간 규모로 여러 프로그램이 CPU에서 번갈아 수행되므로 여러 프로그램을 동시에 수행하는 것처럼 보인다.

#### \[다중 작업용 OS 분류]

- **시분할 시스템**: CPU 작업 시간을 여러 프로그램들이 조금씩 나누어 쓰는 시스템

- **다중 프로그래밍 시스템**: 메모리 공간을 분할해 여러 프로그램들을 동시에 메모리에 올려놓고 처리하는 시스템

- **다중 처리기 시스템**: 하나의 컴퓨터 안에 CPU가 여러 개 설치된 시스템

#### \[다중 사용자의 동시 지원 여부]

- **단일 사용자용 OS**: 한 번에 한 명의 사용자만 접속하도록 허용하는 OS.

- **다중 사용자용 OS**: 한 번에 여러 사용자가 동시에 접속해 사용할 수 있게 하는 OS.
	- ex) email web server, MS Windows, etc.

#### \[작업을 처리하는 방식에 따른 분류]

- **일괄 처리**: 작업 요청의 일정량을 모아서 한꺼번에 처리하는 방식. 따라서 모든 작업이 완전히 종료된 후 결과를 얻을 수 있음.
	- 응답 시간이 길다.

- **시분할 방식**: 여러 작업을 수행할 때 컴퓨터의 처리 능력을 일정한 시간 단위로 분할해 사용
	- 일괄 처리 방식에 비해 짧은 응답시간.
	- 평균적으로 사람이 길다고 느끼는 시간 전 요청에 대한 응답을 받음 > 사용자 측에서는 컴퓨터를 독점적으로 사용하는 것처럼 생각
	- 이와 같이 사용자 요청에 대한 결과를 곧바로 얻을 수 있는 시스템을 **대화형 시스템**이라 부르며, 시분할 방식이 대표적인 예시.

- **실시간 처리**: 정해진 시간 안에 어떠한 일이 반드시 종료됨이 보장되어야 하는 시스템.
	- 시간 제약의 중요성에 따라 아래와 같이 두 가지로 나뉨.
		a. 경성 실시간 시스템: 주어진 시간을 지키지 못할 경우, 매우 위험한 결과를 초래할 가능성이 있는 로켓, 원자로 제어  시스템 등.
		b. 연성 실시간 시스템: 멀티미디어 스트리밍 시스템과 같이 데이터가 시간을 맞추어 전달되어야 올바른 기능을 수행할 수 있는 시스템. 위험한 결과를 초래하지는 않는다.