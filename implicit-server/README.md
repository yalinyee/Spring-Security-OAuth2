# 基于简化模式+Spring Security OAuth2的授权服务器

# 操作方式

### 1. 获取Token

- 浏览器请求

```http
http://localhost:8082/oauth/authorize?client_id=clientapp&redirect_uri=http://localhost:9001/callback&response_type=token&scope=read_info
```

- 输入用户名密码

```yaml
username:yyl

password:abc
```

- 同意授权

- 同意授权后，响应结果

```html
http://localhost:9001/callback#access_token=81d51239-955e-40d3-88e4-c1c4ffbd60c4&token_type=bearer&expires_in=119
```



### 2. 调用资源API

- curl方式

  请求：

```
curl -X GET http://localhost:8082/api/userInfo -H "authorization: Bearer 81d51239-955e-40d3-88e4-c1c4ffbd60c4"
```

​     响应：

```json
{
    "name": "yyl",
    "email": "yyl@xxyyl.com"
}
```

- postman方式

  ![](./images/authcode-01.png)





