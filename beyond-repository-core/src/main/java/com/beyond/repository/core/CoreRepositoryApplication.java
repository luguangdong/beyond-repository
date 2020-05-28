package com.beyond.repository.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * Description:
 * </p>
 *
 * @author luguangdong
 * @version 1.0.0
 * @ClassName CoreRepositoryApplication
 * @date 2020/5/28 23:14
 * @company https://www.beyond.com/
 */
@SpringBootApplication
@MapperScan(basePackages = "com.beyond.repository.core.mapper")
public class CoreRepositoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(CoreRepositoryApplication.class, args);
    }
}
