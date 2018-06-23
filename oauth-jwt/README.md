# 基于客户端模式(还支持其他三种模式)+Spring Security OAuth2+JWT的授权服务器

# 操作方式

### 1. 启动jwt-authserver，端口8084

### 2. 启动jwt-resourceserver，端口8085

### 3. 获取JWT令牌

- 使用curl命令

   请求

```
curl -X POST "http://localhost:8084/oauth/token" --user clientapp:789 -d "grant_type=client_credentials&scope=devops"
```

​      返回

```json
{
    "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6WyJkZXZvcHMiXSwiZXhwIjoxNTI5NzY2MjU5LCJqdGkiOiIwOTY0ODVmNi1kODQ3LTQ5OWMtOGI3Ni1jOWEzMTZjMThmZGEiLCJjbGllbnRfaWQiOiJjbGllbnRhcHAifQ.rnKJRVOy0T342K0YqVIk9YGIRpVx872PwpCbKL_LRKM",
    "token_type": "bearer",
    "expires_in": 43199,
    "scope": "devops",
    "jti": "096485f6-d847-499c-8b76-c9a316c18fda"
}
```

-   posatmain请求

![](./images/authcode-01.png)





### 2. 调用资源API

- curl方式

  请求：

```
curl -X GET http://localhost:8085/api/userinfo -H "authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzY29wZSI6WyJkZXZvcHMiXSwiZXhwIjoxNTI5NzY2MjU5LCJqdGkiOiIwOTY0ODVmNi1kODQ3LTQ5OWMtOGI3Ni1jOWEzMTZjMThmZGEiLCJjbGllbnRfaWQiOiJjbGllbnRhcHAifQ.rnKJRVOy0T342K0YqVIk9YGIRpVx872PwpCbKL_LRKM"
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





