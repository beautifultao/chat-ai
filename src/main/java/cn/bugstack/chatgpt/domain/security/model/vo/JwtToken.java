package cn.bugstack.chatgpt.domain.security.model.vo;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @DateTime: 2024/9/6
 * @Description: Token 信息
 * @Author: 阿涛
 **/
public class JwtToken implements AuthenticationToken {

    private String jwt;

    public JwtToken(String jwt) {
        this.jwt = jwt;
    }

    /**
     * 等同于账户
     */
    @Override
    public Object getPrincipal() {
        return jwt;
    }

    /**
     * 等同于密码
     */
    @Override
    public Object getCredentials() {
        return jwt;
    }

}
