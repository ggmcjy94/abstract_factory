# abstract_factory
추상팩토리패턴

1. 개요
 - 추상 팩토리 패턴은 상세화된 서브클래스를 정의하지 않고도 서로 관련성이 있거나 독립적인 여러 객체의 군을 생성하기 위한 인터페이스를 제공하는 패턴이다.
 - 추상 팩토리 패턴은 객체의 생성, 표현, 구성과는 무관하게 시스템을 독립적으로 만들고자 할 때 유용한 패턴이다.
 - 여러 클래스들 중에 하나를 선택해서 시스템을 설정해야하고 한번 구성한 제품을 다른것으로 대체할 수 있을 때 사용한다.


2. 사용성
 - 하나의 객체를 다양한 방식으로 만들 때 각각 만드는 방식에 따라서 기능을 독립시켜서 구현하기 위해서 사용하는 패턴이다.
 - 예:)) 멀티플랫폼으로 모바일과 PC에서 모두 배포하고 싶은 서비스가 있을 때 각각의 공통 기능에 대하여 별도로 구현이 필요할 때 사용하는 패턴이다.
 

3. 장단점

 1-장점
 - 구체적인 클래스를 분리한다. 추상팩토리 패턴을 끄면 응용 프로그램이 생성할 객체의 클래스를 제어할 수 있다. 팩토리는 제품 객체를 생성하는 과정과 책임을 캡슐화 한 것이기 때문에,
 구체적인 구현 클래스가 사용자에게서 분리된다. 일반 프로그램은 추상 인터페이스를 통해서만 인스턴스를 조작한다.
 - 제품군을 쉽게 대체할 수 있다. 구체 팩토리의 클래스는 응용프로그램에서 한 번만 나타나기 때문에 응용프로그램이 사용할 구체 팩토리를 변경하기는 쉽다. 또한 구체 팩토리를 변경함으로써
  응용프로그램은 서로 다른 제품을 사용할 수 있게 변경된다. 추상 팩토리는 필요한 모든 것을 생성하기 때문에 전체 제품군은 한 번에 변경이 가능하다.
  
 2-단점
 - 새로운 종류의 제품을 제공하기 어렵다. 새롭게 생성되는 제품은 추상 팩토리가 생성할 수 있는 제품 집합에만 고정되어 있기 때문이다. 만약 새로운 종류의 제품이 등장하면 팩토리의 구현을 변
 경해야 한다. 이는 추상 팩토리와 모든 서브클래스의 변경을 가져온다.
 
4. 사용 라이브러리

 1-자바 라이브러리
   - javax.xml.xpath.XPathFactory#newInstance()
   - javax.xml.transform.TransformerFactory#newInstance() javax.xml.parsers.DocumentBuilderFactory#newInstance()

 2-스프링
   - FactoryBean과 그 구현체
