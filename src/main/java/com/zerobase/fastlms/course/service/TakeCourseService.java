package com.zerobase.fastlms.course.service;

import com.zerobase.fastlms.course.dto.TakeCourseDto;
import com.zerobase.fastlms.course.model.ServiceResult;
import com.zerobase.fastlms.course.model.TakeCourseParam;

import java.util.List;

public interface TakeCourseService {
    List<TakeCourseDto> list(TakeCourseParam parameter); // 수강 목록

    TakeCourseDto detail(long id); // 수강 상세 정보

    ServiceResult updateStatus(long id, String status);

    List<TakeCourseDto> myCourse(String userId); // 내 수강목록

    ServiceResult cancel(long id); // 수강신청 취소처리
}
