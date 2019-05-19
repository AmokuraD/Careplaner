package com.whu.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.whu.pojo.BCNRecord;
import com.whu.pojo.Record;
import com.whu.service.BookService;
import com.whu.service.CourseService;
import com.whu.service.DevelopService;
import com.whu.service.HighendService;
import com.whu.service.MfService;
import com.whu.service.NetcourseService;
import com.whu.service.OperationService;
import com.whu.service.TestService;
import com.whu.util.Result;
import com.whu.util.ResultUtil;

@CrossOrigin(origins="*", maxAge = 3600)
@Controller
@RequestMapping("/control")
public class Control 
{
	@Autowired
	private OperationService operationService;
	@Autowired
	private MfService mfService;
	@Autowired
	private DevelopService developService;
	@Autowired
	private HighendService highendService;
	@Autowired
	private TestService testService;
	@Autowired
	private BookService bookService;
	@Autowired
	private CourseService courseService;
	@Autowired
	private NetcourseService netcourseService;
	
	@RequestMapping("/result1")
	@ResponseBody
	public Result showData1(@RequestBody Record record)
	{
		if(record.getTable().equalsIgnoreCase("OPERATION"))
		{
			return ResultUtil.success(operationService.getOperation(record.getName()));
		}
		else if(record.getTable().equalsIgnoreCase("MF"))
		{
			return ResultUtil.success(mfService.getMf(record.getName()));
		}
		else if(record.getTable().equalsIgnoreCase("DEVELOP"))
		{
			return ResultUtil.success(developService.getDevelop(record.getName()));
		}
		else if(record.getTable().equalsIgnoreCase("HIGHEND"))
		{
			return ResultUtil.success(highendService.getHighend(record.getName()));
		}
		else if(record.getTable().equalsIgnoreCase("TEST"))
		{
			return ResultUtil.success(testService.getTest(record.getName()));
		}	
		else
			return ResultUtil.error(-1, "请求数据错误");
	}
	
	@RequestMapping("/result2")
	@ResponseBody
	public Result showData2(@RequestBody BCNRecord bcnRecord) 
	{
		bcnRecord.setBookList(bookService.getBooks(bcnRecord.getSkill()));
		bcnRecord.setCourseList(courseService.getCourses(bcnRecord.getSkill()));
		bcnRecord.setNetcourseList(netcourseService.getNetcourses(bcnRecord.getSkill()));
		return ResultUtil.success(bcnRecord);
	}
}
