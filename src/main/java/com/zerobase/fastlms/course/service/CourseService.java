package com.zerobase.fastlms.course.service;

import com.zerobase.fastlms.course.dto.CourseDto;
import com.zerobase.fastlms.course.model.CourseInput;
import com.zerobase.fastlms.course.model.CourseParam;
import com.zerobase.fastlms.course.model.ServiceResult;
import com.zerobase.fastlms.course.model.TakeCourseInput;

import java.util.List;

public interface CourseService {


    boolean add(CourseInput parameter); // 강좌 등록


    List<CourseDto> list(CourseParam parameter); // 강좌 목록

    CourseDto getById(long id);

    boolean set(CourseInput parameter); // 강좌정보 수정

    boolean del(String idList); // 강좌 내용 삭제

    List<CourseDto> frontList(CourseParam parameter); // 프론트 강좌 목록

    CourseDto frontDetail(long id);

    ServiceResult req(TakeCourseInput parameter); // 수강신청

    List<CourseDto> listAll();
}
