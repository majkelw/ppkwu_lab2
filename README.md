# ppkwu_lab2
## Documentation String API

### Description
API to parse the given string, it counts upper and lower case letters,
digits and special characters.

|type|endpoint|parameter|
|---|---|---|
|GET|/api/string|str|

### API call
Example call for str parameter:<br>
al4/A3zSa9ot_tyOx-ek*
```
http://localhost:8080/api/string?str=al4/A3zSa9ot_tyOx-ek*
```

### Output Result
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