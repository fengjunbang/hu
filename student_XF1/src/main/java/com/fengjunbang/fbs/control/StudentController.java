package com.fengjunbang.fbs.control;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fengjunbang.fbs.pojo.SchoolD;
import com.fengjunbang.fbs.pojo.SchoolRooms;
import com.fengjunbang.fbs.pojo.SchoolStudent;
import com.fengjunbang.fbs.service.DService;
import com.fengjunbang.fbs.service.RoomService;
import com.fengjunbang.fbs.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;
	
	@Autowired
	@Qualifier("dService")
	private DService dService;
	
	@Autowired
	@Qualifier("roomService")
	private RoomService roomService;
	
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="")String name,HttpServletRequest request) {
		List<Map> list = studentService.selectStudent(name);
		
		request.setAttribute("list", list);
		
		return "list";
	}
	
	@RequestMapping("sel")
	public String sel(Integer id,HttpServletRequest request) {   //该查看了
		SchoolStudent student = studentService.selectByPrimaryKey(id);
		request.setAttribute("s", student);
		
		return "select";
	}
	
	@RequestMapping("dService")
	@ResponseBody
	public List dService(HttpServletRequest request) {   //该查看了
	
		return dService.selectBydids();
	}
	
	@RequestMapping("selectD")
	@ResponseBody
	public SchoolD selectD(HttpServletRequest request,Integer did) {   //该查看了
	
		return dService.selectByPrimaryKey(did);
	}
	

	@RequestMapping("update")
	@ResponseBody
	public Boolean update(HttpServletRequest requests,SchoolStudent student,Integer did2) {   //该查看了
		
		int i = studentService.updateByPrimaryKeySelective(student);  //一定修改的
		
		SchoolD schoolD = new SchoolD();
		schoolD.setDid(did2);
				
		int j = dService.updateByPrimaryKey(schoolD);   //先去减人数
		
		
		SchoolD schoold = new SchoolD();
		schoold.setDid(student.getDid());
		
		int k = dService.updateByPrimaryKeySelective(schoold);   //加人数
		
		
		int l = roomService.updateByDid(did2);   //修改记录表的离开时间
		
		
		SchoolRooms schoolRooms = new SchoolRooms();
		schoolRooms.setDid(student.getDid());  //现在的宿舍号
		schoolRooms.setSid(student.getId());
		schoolRooms.setLeavedate("至今");
		
		int m = roomService.insertSelective(schoolRooms);
		
		
		if(i!=0 && j!=0 && k!=0 && l!=0 && m!=0) {
			
			
			return true;
		}
		return false;
	}
	
	@RequestMapping("selects")
	public String selects(HttpServletRequest request,Integer id) {   //该查看了
		
		SchoolStudent student = studentService.selectByPrimaryKey(id);
		
		List<Map> list = roomService.selectAllById(id);
		
		request.setAttribute("stu", student);
		request.setAttribute("list", list);
	
		return "sel";
	}
	
	
}
