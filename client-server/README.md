# 基于客户端模式+Spring Security OAuth2的授权服务器

# 操作方式

### 1. 获取Token

- 使用curl命令

   请求

```
curl -X POST "http://localhost:8081/oauth/token" --user clientapp:789 -d "grant_type=client_credentials&scope=devops"
```

​      返回

```json
{
    "access_token": "2d10b9d6-61ac-478e-b259-81678854d4f1",
    "token_type": "bearer",
    "expires_in": 43185,
    "scope": "devops"
}
```

-   posatmain请求

![](./images/authcode-01.png)





### 2. 调用资源API

- curl方式

  请求：

```
curl -X GET http://localhost:8081/api/userinfo -H "authorization: Bearer 2d10b9d6-61ac-478e-b259-81678854d4f1"
```

​     响应：

```json
[
    {
        "name": "yyl",
        "email": "yyl@xx.com"
    },
    {
        "name": "songyi",
        "email": "songyi@xxo.com"
    },
    {
        "name": "ddf",
        "email": "ddf@xxyy.com"
    }
]
```

- postman方式

  ![](./images/authcode-02.png)





