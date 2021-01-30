# Repository Admin (RepoAdmin)


*   Spring Boot
*   Mybatis
*   MariaDB
*   logback
*   external configuration files
*   adminlte3
*   github
*   two factor auth

## GetMapping Example

```Java
@GetMapping("/login")
== @RequestMapping("/login", method=@RequestMethod.GET)

@PostMapping("/login")
== @RequestMapping("/login", method=@RequestMethod.POST)
```

## Parameters

```Java
@PostMapping("/member") 
public String member(@RequestParam String name, @RequestParam Int age)
```


It can be omitted.

```Java
@PostMapping("/member") 
public String member(String name, Int age)
```

## PathVariable

```Java
@RequestMapping("/member/{name}/{age}") 
public String member(@PathVariable("name") String name, @PathVariable("age") String age)
```

## Consumes

```Java
@PostMapping("/login", consumes="application/json")
```

## Test Controller

```Java
package com.god.bo.test.controller; 

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 

@Controller 
public class TestController { 

	@RequestMapping(value = "/home") 
	public String home(){ 
		return "index.html"; 
	} 
}
```

## index.html

```Html
<!DOCTYPE html> 
<html lang="en"> 
<head> 
	<meta charset="UTF-8"> 
	<title>Index</title> 
</head> 
<body> 
	<h1>Hello World!</h1> 
</body> 
</html>
```

## Port Change

`/src/main/resources/application.properties` ==> `server.port = 8000`

## @ResponseBody
String, Map, JSON 등을 전달

```java
package com.god.bo.test.controller; 

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 

@Controller 
public class TestController { 

	@RequestMapping(value = "/home") 
	public String home(){ 
		return "index.html"; 
	} 
	
	@ResponseBody 
	@RequestMapping("/valueTest") 
	public String valueTest(){ 
		String value = "테스트 String"; 
		return value; 
	} 
}
```

```html
<!DOCTYPE html> 
<html lang="en"> 
<head> 
	<meta charset="UTF-8"> 
	<title>Index</title> 
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> 
	<script> 
		$.ajax({ 
			type: "GET", 
			url: "/valueTest", 
			success: (data) => { 
				console.log(data); 
				$('#contents').html(data); 
			} 
		}); 
	</script> 
</head> 
<body> 
	<h1>Hello World!</h1> 
	<div id="contents"> </div> 
</body> 
</html>
```

## RestController
Spring 4.0이상은 @RestController를 사용하면 @ResponseBody를 추가 할 필요가 없고, @ResponseBody 어노테이션은 기본적으로 활성화되어 있다.


```java
package com.god.bo.test.controller; 

import com.god.bo.test.service.TestService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RestController; 

@RestController 
public class TestRestController { 

	@Autowired 
	TestService testService; 
	
	@RequestMapping(value="/testValue", method = RequestMethod.GET) 
	public String getTestValue(){ 
		String TestValue = "레스트컨트롤러 테스트"; 
		return TestValue; 
	} 
}
```

```html
<!DOCTYPE html> 
<html lang="en"> 
<head> 
	<meta charset="UTF-8"> 
	<title>Index</title> 
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> 
	<script> 
		$.ajax({ 
			type: "GET", 
			url: "/testValue", 
			success: (data) => { 
				console.log(data); 
				$('#contents').html(data); 
			} 
		}); 
	</script> 
</head> 
<body> 
	<h1>Hello World!</h1> 
	<div id="contents"> </div> 
</body> 
</html>
```

## View