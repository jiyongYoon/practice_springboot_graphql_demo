- gui 주소
```
http://localhost:8080/gui
```

- graphql 예시
```
{
  getTeamByCountryName(name:"한국") {
    id
    name
    country{
      id
      name
    }
    sport{
      id
      name
    }
  }
}
```

- 참고자료

https://docs.spring.io/spring-graphql/reference/index.html
https://danawalab.github.io/spring/2022/06/06/Spring-for-GraphQL.html
https://ttubeoki.tistory.com/23
https://jh2021.tistory.com/12
