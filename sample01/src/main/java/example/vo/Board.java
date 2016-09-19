// 역할 : 게시물, 데이터를 보관 
// 어떤 데이터를 보관하는 역할자를 "값 객체(Value Object)" 라고 부른다. 
// 또는, "도메인 객체(Business Domain Object) 라고 부른다. 
// 또는, "데이터 전송용 객체(Data Transfer Object)" 라고 부른다. 
// 용어정리) VO = DO = DTO 

package example.vo;

import java.io.Serializable;
import java.sql.Date;
// Board 객체의 값을 출력할 때 바이트 배열로 바꿀 수 있음을 허락한다는 의미. 
// 보안 강화를 위해 객체 출력을 막는다. 
public class Board implements Serializable {

  private static final long serialVersionUID = 1L;
  
  protected int no;
  protected String title;
  protected String contents;
  protected String writer;
  protected Date createdDate;
  protected int viewCount;
  protected transient String password;
  
  
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getContents() {
    return contents;
  }
  public void setContents(String contents) {
    this.contents = contents;
  }
  public String getWriter() {
    return writer;
  }
  public void setWriter(String writer) {
    this.writer = writer;
  }
  public java.sql.Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(java.sql.Date createdDate) {
    this.createdDate = createdDate;
  }
  public int getViewCount() {
    return viewCount;
  }
  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  
}
