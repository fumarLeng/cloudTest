package com.leo.order.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix="cloud")
public class OrderProperties {

    private ItemProperties item = new ItemProperties();

}

