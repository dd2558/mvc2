주요 클래스 파일 설명

1. Action.java -> 명령 처리 클래스의 슈퍼 클래스로 사용할 인터페이스 <br>
2. BoardListAction.java -> 게시글 전체 정보를 데이터베이스에서 얻어옴 <br>
3. BoardWriteFormAction.java -> 새로운 게시글 정보를 입력받기 위해 게시글 등록 페이지로 이동한다 <br>
4. BoardWriteAction.java -> 입력한 게시글 정보를 데이터베이스에 추가한다 <br>
5. BoardViewAction.java -> 게시글 번호에 해당되는 게시글을 데이터베이스에서 찾아 게시글의 상세 정보를 보여준다 <br>
6. BoardCheckPassFormAction.java -> 게시글을 수정 혹은 삭제할 수 있는 자격이 있는지를 알아보기 위해 <br> 비밀번호 확인을 할수있는 페이지로 이동한다 <br>
7. BoardCheckPassAction.java -> 게시글 비밀번호 일치여부를 확인한다 <br>
8. BoardUpdateAction.java -> 게시글 수정 페이지로 이동하도록 한다 <br>
9. BoardUpdateAction.java -> 입력한 정보로 데이터베이스에 게시물 정보를 수정한다 <br>
10. BoardDeleteAction.java -> 데이터베이스에 게시글 정보를 삭제한다 <br>
