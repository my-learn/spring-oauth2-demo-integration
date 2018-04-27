# spring-oauth2-demo-integration


### 访问
`curl http://localhost:8080/order/1`

```json
{
    "error": "unauthorized",
    "error_description": "Full authentication is required to access this resource"
}
```

### password模式

`http://localhost:8080/oauth/token?username=user_1&password=123456&grant_type=password&scope=select&client_id=client_2&client_secret=123456`

```json
{
    "access_token": "79c75b58-970f-4fc8-92f0-efe1ae2cd7a2",
    "token_type": "bearer",
    "refresh_token": "e1ba2fe0-c01e-4bb0-9851-e8b3f51ff128",
    "expires_in": 40618,
    "scope": "select"
}
```

`http://localhost:8080/order/1?access_token=79c75b58-970f-4fc8-92f0-efe1ae2cd7a2`

`order id : 1`
 