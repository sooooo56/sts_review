package com.example.basic;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
// Lombok으로 스프링에서 DI(의존성 주입)의 방법 중에 생성자 주입을 임의의 코드없이 자동으로 설정해주는 어노테이션이다.
// 새로운 필드를 추가할 때 다시 생성자를 만들어서 관리해야하는 번거로움을 없애준다. (
public class ArticleController {

    private final ArticleDao articleDao;
    // 캡슐화를 위해 private 붙이기

    @RequestMapping("/article/write")
    @ResponseBody
    public String save(String title, String body) { // 쿼리스트링으로 저장하는 방법
        articleDao.save(title,body);

        return "게시물이 성공적으로 저장되었습니다";
    }
}
