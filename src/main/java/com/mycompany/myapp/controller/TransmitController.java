package com.mycompany.myapp.controller;

import com.mycompany.myapp.bean.Car;
import com.mycompany.myapp.bean.Platform;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transmit")
public class TransmitController {

    /**
     * 提交平台参数
     *
     * @return
     */
    @PostMapping("/platform-conf")
    public String getPlatform(@RequestBody Platform platform) {
        return platform.toString();
    }

    /**
     * 提交车辆参数
     *
     * @return
     */
    @PostMapping("/car-conf")
    public String getCar(@RequestBody Car car) {
        return car.toString();
    }
}
