package com.xxl.job.executor.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import com.xxl.job.core.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@Slf4j
@Component
public class QH_POT_JOB_Handler {

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate() {
        return restTemplateBuilder.build();
    }

    /**
     * 2、青海项目推送任务（Bean模式）
     */
    @XxlJob("qh_pot_JobHandler")
    public ReturnT<String> qh_pot_job_Handler(String param) throws Exception {
        log.info("任务开始时间 : {}", DateUtil.format(new Date(),"yyyy-MM-dd HH-mm-ss"));
        XxlJobLogger.log("Bean模式执行数据库操作");
        String url = "http://localhost:8082/goods/getAll";
        String method = "POST";
        ResponseEntity<String> result = restTemplate.exchange(url, HttpMethod.resolve(method.toUpperCase()),null,String.class);
        System.out.println(result.getBody());
        log.info("任务结束时间 : {}", DateUtil.format(new Date(),"yyyy-MM-dd hh-mm-ss"));
        return ReturnT.SUCCESS;
    }

}
