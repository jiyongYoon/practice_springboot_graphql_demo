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