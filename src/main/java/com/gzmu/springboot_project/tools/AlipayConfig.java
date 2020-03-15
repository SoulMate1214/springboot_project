package com.gzmu.springboot_project.tools;

public class AlipayConfig {
    // 作为身份标识的应用ID
    public static String app_id = "2016101900721699";
    // 商户私钥
    public static String merchant_private_key  = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCeEoIzxqHW7QivLhPfUAB3A+9vO9HPG2ktWtQ3kFpvwGUAL9qN7EvTHHD2iG7mIRgPst0YilhOb6s6JYeEF2n5E1q4hgMGmbsov1X7kpBDxY201ulsNAXGI/L2Xln4V+ps6sSXd5M3Sh8T/RowNIvLFyuj6DHw44nqLvZiIKTvUUXYQfquJnzCuVSLibsCPjD5hzP2zUnKOlrMvEyN9dG5ZwAKtHuwRgnIxaki2C+jsTDo4IP3w7XLob0VrOf1VMW/uT4VXWIIpzEvZmEaMfbMhuk6bpsiULGKdqyceHF+4JDggaiFSX7k5tTQ6My8/GhEjsUya6UYPMWZOPbi6M1BAgMBAAECggEAORB/doePp1Jc3zjoLabo9A40othajsTbfGcc045GR6+SBrY/1Rpn6SeMVEO+nU93Kzur+47+ABrqGoyv1mzJcgSdrJ2cfAaFfVlNhgtMD1tDI/StwcUqDHSv4mb/XdsHIxjBrdiaCcy1WXb2vE5L5R5RP9O0K71I7YTUp2oXgNkouo1rCss226dRqSARTUuIvg3c8NpkZBIu3xHBowEBLNQeK7lU9xxyaOJ4AUOBeDLC8h+TkuSd/FvtqoA9MaXlAQeLW3NCO0Npapc5xSC7Zd1pKNnVB439BnB/fthg0uCnfkDMbSj0MZzDXxVnSwJctTv7/skMKrVhhLo11xSQHQKBgQDlWJA51WokH+BQK1159P5/yRFj6y3zq904U2gnHqjYiJ4WWiphNcTbJWi4+vLCa8VI4tPUk8ZCRGAM8SCtLc/FQF7JKCQxNIRU0QdJoJPZedtedZc+9KGhlHeWl57LGvefppVPmPD2TqjXsLXWz2Qz1/RH16l5CG2pGWRU1bGYGwKBgQCwcW50a3fuvPznrNagqvJ6MZFys2kteN7L1QvmzEuN0kxAPmZ/MKllX/8a0BJ/G5dX4uCpAGAUojYOTBuzX8A5zZyFn2Kzhc+lACa2pnZ5RK5uTC7YJ4xovNvo2dGdLekyrg41N2GY4xmWz0aS8EVbIhj0wpy+rk+tS/4y6X490wKBgQC02ZyJbmfPaq94qGmCxRV28Lfc4dQPhSPhyaukxYGBlmGK4LjwhPThlmM5EvIhK9ibO/qsc4bwNHjFW9NXnHttYPAdkaDQiEgdleM4RP6xjGzW1MVaaI+YGbofrxoRsQc5BqRQ6xqAL9DmnLsXU90BILbJfB9wiJvor1Q1rXjopwKBgHxvw0J/+Jl617JchxHQ/imHg9itB2R2dkqy+i3PrwlaY0R7vbW+D/na9gNm82SJhPcKnv8RsLFcpVr3+iFLSjp59AWZHvcVTBhGPwdZ5vwnoA1R1UfEvJWxfDaASADePDTt5D9Ly50TrRxbGp7OrVtUdN1J01n3fWHu0lv9qHbZAoGAVFOFjw6I0qANBg2l1JKLrW9RdHSrGHRoJW0F2b9XZlroKCRWD2WpeyHTU/RXihBCnG6hoQmzf3yajoXdW15bng5rZvRJKkcRW6O58oKufbzZ0qKD31pfd/I07jPbeAT87QWLz7qH9ieCI7TK/RNGJiW207aIVey9bndt962E68A=";
    // 支付宝公钥（注意不是应用公钥）
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAg9pRcFpydOAbdTLnIMNydt8GxM17gGw1R/VhEb5Q3VHuJyhhHBcvBcns3neyvyxGFHDCDQu/m6z7QqDrPj2gXrEH099GwL0OndE2je3tgIIlckGAbNC+MYJZiONX5DEb5mOUVjWPxu+gwhIOmPEz4m5Qsjqg+bT3dE6HdCGQd6yGmu0XcmN+EQALzTZZKhPGMiCq5afF6oNnNzGIYbRWFVkcVmKAIDfs17Jj+z8kQLbG0u3IfF3WFlKrIIuX8BGsMKLy3FZKGiTGd0ycGKgUmuPiW+M700flCloGXvbQKvSkCo8MA6IVJHF3ilQ90F8MZJu3jS6EJxO0YTW8FcJecwIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://www.xysoul.cn";
    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://www.baidu.com";
    // 签名方式
    public static String sign_type = "RSA2";
    // 字符编码格式
    public static String charset = "utf-8";
    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
}
