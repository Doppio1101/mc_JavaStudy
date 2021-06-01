# 자바 수업 내용 백업.

### 2021.03.29 ~ 

- 앞으로 수정되는 내용은 깃을 통해 버전관리.
- 시간내서 각 파일마다 어떤 수업을 했는지 commit 달기
  - 추상화, 캡슐화, 인터페이스 등... 그 파일이 무슨 수업이었는지를 commit으로 표시.

- 풀어보라고 하신 파일들도 commit으로 표시

  - 언제, 어디 문제 발췌, 어려웠던 점. 표시

- MVC Pattern
  - M : Model
  - V : View
  - C : Controller

- Input/Output - Controller - Service - DAO - CM - DB
- ------------------------- VO -------------------------

- CRUD
  - C : Create  생성
  - R : Read    읽기
  - U : Update  갱신
  - D : Delete  삭제


### Papago Text Translation

> Client Id & Client Secret, API 유출 방지?
> API도 유출되면 안 되는건지 확인 필요

- API의 사용 방법과 사용 예제를 바탕으로 API 입력, 처리, 출력을 살펴봄.

- JSON 형식으로 웹페이지에서 데이터를 컨트롤러로 전달.

- 컨트롤러로 들어온 `words`는 API 사용 예제를 따라 

- ``` java
  String text = URLEncoder.encode(words, "UTF-8");
  ```

- 위 작업을 통해 인코딩 된 후, 입력  놨던`Client Id`와 `Client Scret` 과 API url을 `HttpURLConnection` 을 통해 연결된다.

- 이때, 번역할 내용의 언어 코드`해당 언어의 국가 코드` 와 번역 후 언어 코드를 입력해준다.

  ``` java
  String postParams = "source=ko&target=en&text=" + text;
  ```

- ko는 한국어의 언어 코드, en는 영어의 언어 코드이다.

- JSON 형태의 반환 값을 String에 담아 웹페이지로 전달해준다.

- 컨트롤러에서 반환 받은 값은 JSON.Parse를 이용하여 jquery형식으로 바꿔준다.

- `결과를 담은 변수명`.message.result.translatedText 로 번역된 값을 접근한다.

------------------

- 실제 AI 작업이 이루어질 곳은 `Service`이기 때문에 컨트롤러에서 작업한 내용을 `Service`로 옮겨 자기 책임성의 원칙을 지킬 수 있도록 해 준다.
- 컨트롤러에서는 웹페이지에서 받은 String 형식의 `words`값을 번역을 담당할 `Service`에게 전달하고 이로부터 번역처리 되어 반환받은 값을 웹페이지로 전달할 수 있도록 해 준다. 
- 웹 페이지에서는 이전 수행을 그대로 수행할 수 있도록 한다.
