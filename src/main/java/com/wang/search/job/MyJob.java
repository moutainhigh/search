package com.wang.search.job;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 简单任务
 *
 * @author wangjunhao
 * @version 1.0
 * @date 2020/6/17 13:46
 * @since JDK 1.8
 */
@Slf4j
@Component
public class MyJob implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        log.info(shardingContext.getJobName());
        log.info(shardingContext.getTaskId());
        log.info("{}", shardingContext.getShardingItem());
    }
}
