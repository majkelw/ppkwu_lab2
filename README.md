# ppkwu_lab2
## Documentation String API

### Description

|type|endpoint|parameter|
|---|---|---|
|GET|/api/string|str|

### API call
```
http://localhost:8080/api/string?str=al4/A3zSa9ot_tyOx-ek*
```

### Result
Example JSON response
```json
{
  "str": "al4/A3zSa9ot_tyOx-ek*",
  "numberOfDigits": 3,
  "numberOfSpecialChars": 4,
  "numberOfLowercase": 11,
  "numberOfUppercase": 3
}
```