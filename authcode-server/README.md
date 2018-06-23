# 基于授权码模式+Spring Security OAuth2安全认证

# 操作方式

### 1. 获取授权码

- 浏览器请求

```http
http://localhost:8080/oauth/authorize?client_id=clientapp&redirect_uri=http://localhost:9001/callback&response_type=code&scope=read_userinfo
```

- 输入用户名密码

```yaml
username:yyl

password:abc
```

- 同意授权

选择【Approve】单选按钮，点击【Authorize】,浏览器地址栏会返回code及其值，这个值就是授权码;

若选择【Deny】则表示不同意授权，点击【Authorize】授权服务器不会返回授权码,而会返回错误。

- 同意授权后，响应结果

```html
http://localhost:9001/callback#code=ulQvdN
```



### 2. 获取访问令牌 

- 请求

   使用curl命令或者用posatmain请求；

   使用curl命令：

```
curl -X POST --user clientapp:abcdefg http://localhost:8080/oauth/token -H "content-type: application/x-www-form-urlencoded" -d "code=ulQvdN&grant_type=authorization_code&redirect_uri=http://localhost:9001/callback&scope=read_userinfo"
```

   posatmain请求：

![](./images/authcode-01.png)



![](./images/authcode-02.png)



### 3. 调用资源API

- curl方式

  请求：

```
curl -X GET http://localhost:8080/api/userinfo -H "authorization: Bearer e175a18e-792b-4a5d-af53-b2b578a329f2"
```

​     响应：

```json
{
    "name": "yyl",
    "email": "yyllover_ya@sina.com"
}
```

- postman方式

  ![](./images/authcode-03.png)

