package com.example.basic;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
// MyBatis가 JDBC작업을 대신 해줌
public interface ArticleDao {

    @Insert("""
            INSERT INTO article2
            SET title = #{title}
            , body = #{body}
            """)
    // 제목과 내용은 그때그때 값이 달라지는 동적인 값이기 때문에 변수로 작성
    // 매개변수를 이용해 자바의 어떠한 값을 전달 할 수 있다.
    // 주의할 점 매개변수와 변수로 지정한 이름이 같아야한다.
    void save(String title, String body);

    @Select("""
            SELECT * FROM article2
            """)
    List<Article> findAll();
}
