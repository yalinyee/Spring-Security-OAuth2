# 基于密码模式+Spring Security OAuth2的授权服务器

# 操作方式

### 1. 获取Token

- curl方式

  请求：

```http
curl -X POST --user clientapp:789 http://localhost:8083/oauth/token -H "accept: application/json" -H "content-type: application/x-www-formurlencoded" -d "grant_type=password&username=yyl&password=abc&scope=read_info"
```

​     响应：

```json
{
    "access_token": "2c37f604-4326-4470-8016-bd4e454e4122",
    "token_type": "bearer",
    "expires_in": 119,
    "scope": "read_info"
}
```

- postman方式

  请求：

  ​	Authorization：

![](./images/authcode-01.png)

​		Header和参数部分：

![](./images/authcode-02.png)

​	响应：

```json
{
    "access_token": "2c37f604-4326-4470-8016-bd4e454e4122",
    "token_type": "bearer",
    "expires_in": 119,
    "scope": "read_info"
}
```



### 2. 调用资源API

- curl方式

  请求：

```
curl -X GET http://localhost:8083/api/userInfo -H "authorization: Bearer  2c37f604-4326-4470-8016-bd4e454e4122"
```

​     响应：

```json
{
    "name": "yyl",
    "email": "yyl@xxyyl.com"
}
```

- postman方式

  

![](./images/authcode-03.png)



