package com.yupi.yucongming.dev;

import com.yupi.yucongming.dev.client.YuCongMingClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 客户端配置
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Configuration
@ConfigurationProperties("yuapi.client")
@Data
@ComponentScan
public class YuCongMingClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public YuCongMingClient yuApiClient() {
        return new YuCongMingClient(accessKey, secretKey);
    }

}
