package net.wanho.pojo;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="person")
@Component
@Data
public class PersonProperties {
    private String name;
    private Integer age;
}
