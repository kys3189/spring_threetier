package com.app.threetier.controller;

import com.app.threetier.domain.CompanyVO;
import com.app.threetier.service.CompanyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/company/*")
public class CompanyController {
    final CompanyService companyService;

    @GetMapping("check-in")
    public void goToCheckInForm(CompanyVO companyVO) {;}

    @GetMapping("get-to-work")
    public void goToGetToWork() {;}

    @GetMapping("leave-work")
    public void goToLeaveWork() {;}

    @GetMapping("late")
    public void goToLate() {;}

    @GetMapping("work")
    public void goToWork() {;}

    @PostMapping("check-in")
    public RedirectView checkIn(CompanyVO companyVO, String flag) {
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        log.info("{}", format);

        int hours = now.getHour();
        int minutes = now.getMinute();

//        지각
        boolean lateCondition = hours >= 9 && minutes > 0;
//        퇴근
        boolean leaveWorkCondition = hours >= 17 && minutes >= 0;
//        출근
        if(flag.equals("getToWork")) {
            companyVO.setGetToWorkDateTime(format);
            companyService.register(companyVO);
            log.info("{}", companyVO);

//            출근시간 초과 ? 지각 : 정시출근
            return new RedirectView(lateCondition ? "/company/late" : "/company/get-to-work");
        }
//        퇴근
        companyVO.setLeaveWorkDateTime(format);
        companyService.register(companyVO);
        log.info("{}", companyVO);
//        퇴근 시간이면 ? 퇴근 : 땡땡이
        return new RedirectView(leaveWorkCondition ? "/company/leave-work" : "/company/work");
    }


}
