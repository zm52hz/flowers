package com.jack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jack.service.ReplyService;
import com.util.controller.BaseController;

@RestController
@RequestMapping("reply")
public class ReplyController extends BaseController {

	@Autowired
	private ReplyService replyService;
}
