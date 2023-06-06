package com.zjh.sms.controller.Profession;

import com.zjh.sms.domain.Profession;
import com.zjh.sms.service.Profession.ProfessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description 所有专业控制层
 * Author: mxx
 * Date2023/3/31 17:28
 **/
@RestController
@RequestMapping("/api/sms/profession")
public class ProfessionController {

  @Autowired
  private ProfessionService professionService;

  /**
   * 功能描述:  查询所有专业
   * @return : []
   */
  @GetMapping("/getProfessionList")
  private List<Profession> getProfessionList () {
    return professionService.getProfessionList();
  }
}
