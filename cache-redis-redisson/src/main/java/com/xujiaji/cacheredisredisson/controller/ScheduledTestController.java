package com.xujiaji.cacheredisredisson.controller;

import com.xujiaji.cacheredisredisson.service.ScheduledTestService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiajixu
 * @date 2022/9/15 09:42
 */
@AllArgsConstructor
@RestController
@RequestMapping("/scheduletest")
public class ScheduledTestController {

    private final ScheduledTestService scheduledTestService;

    @GetMapping("/test")
    public void testScheduled() {
        scheduledTestService.testScheduled();
    }
}
