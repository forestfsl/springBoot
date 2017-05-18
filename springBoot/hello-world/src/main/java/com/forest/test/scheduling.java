package com.forest.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**定时任务
 * Created by songlin on 16/05/2017.
 */
//@Configuration
//@EnableScheduling
public class scheduling {
    @Scheduled(cron = "0/20 * * * * ?") // 每20秒执行一次
    public void scheduler() {
        System.out.println(">>>>>>>>>SchedulingConfig.scheduler()");
    }
}
