package com.atguigu.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot默认支持两种技术来支持ES交互
 * 1、Jest（默认不支持）
 *  需要导入jest的工具包 （io.searchbox.client.JestClient）
 * 2、SpringData Elasticsearch [ES版本有可能不合适]
 *      版本是配说明:https://github.com/spring-projects/spring-data-elasticsearch
 *      3.2.x	6.5.0
 *      3.1.x	6.2.2
 *      3.0.x	5.5.0
 *      2.1.x	2.4.0
 *      2.0.x	2.2.0
 *      1.3.x	1.5.2
 *      1)、Client 节点信息clusterNodes：clusterName
 *      2）、ElasticsearchTemplate 操作es
 *      3）、编写一个ElasticsearchRepository的子接口来操作es
 * 两种用法：https://github.com/spring-projects/spring-data-elasticsearch
 * 1）、编写一个ElasticsearchRepository   此时使用的是elasticsearch 2.4.0
 * 2）、
 */
@SpringBootApplication
public class Springboot03ElasticApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03ElasticApplication.class, args);
    }

}

