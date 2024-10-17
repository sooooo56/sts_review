package com.example.basic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
// 롬복에서 사용하는 어노테이션을 이용하면 불필요한 코드 작업을 줄여준다.
// 하지만 무분별하게 사용하면 코드 분석하는 입장에서 혼돈이 올 수 있기 때문에 무분별한 사용은 지양한다
// @NoArgsConstructor : 파라미터가 없는 디폴트 생성자를 생성
// @AllArgsConstructor : 모든 필드 값을 파라미터로 받는 생성자를 생성
public class Article {
    private long id;
    private String title;
    private String body;

}
