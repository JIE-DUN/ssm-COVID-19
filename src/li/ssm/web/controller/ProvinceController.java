package li.ssm.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import li.ssm.domain.Province;
import li.ssm.service.ProvinceService;


/**  
 * 
 */
@Controller
public class ProvinceController {
	
	@Resource(name = "provinceService")
	private ProvinceService ps;
	
	/**
	 * 分页查询全部用户;pn=pageNo
	 * pn是第几页；len是每页多少条数据
	 */
	@RequestMapping(value = {"/province/province"})
	public String findPage(Model m,@RequestParam("cid")int cid,@RequestParam("pn")int pn){
		//查询结果的总数据条数
		int count = ps.selectCount(cid);
		
		//每页显示多少条数据
		int recordPerPage = 5;
		
		//计算页数
		int pages = 0;
		if(count % recordPerPage == 0){
			pages = count / recordPerPage;
		}
		else{
			pages = count / recordPerPage + 1;
		}
		
		//第pn页的第一条数据的偏移量
		//比如第一页第一条数据偏移量是0，比如第二页第一条数据偏移量是5
		int offest = (pn - 1) * recordPerPage;
		
		List<Province> list = ps.selectPage(offest,recordPerPage,cid);
		m.addAttribute("allProvinces",list);
		m.addAttribute("pages",pages);
		m.addAttribute("cid",cid);
		return "province/provinceList";
	}
	
	
	/**
	 * 删除用户
	 */
	@RequestMapping("/province/deleteprovince")
	public String deletecountry(@RequestParam("pid")Integer pid){
		ps.delete(pid);
		return "redirect:/country/findall";
	}
	
	/**
	 * 先进这个修改的页面
	 * cname=${c.name}
	 */
	@RequestMapping("/province/provinceEdit")
	public String countryEdit(Model m,@RequestParam("pname")String pname){
		m.addAttribute("pname",pname);
		return "province/provinceEdit";
	}
	
	
	/**
	 * 修改省份
	 */
	@RequestMapping(value="/province/provinceSave", method = RequestMethod.POST)
	public String savecountry(Province p){
		ps.update(p);
		return "redirect:/country/findall";
	}
	
	/**
	 * 新增省份
	 */
	@RequestMapping(value="/province/provinceAdd", method = RequestMethod.POST)
	public String addcountry(Province p){
		ps.insert(p);;
		return "redirect:/country/findall";
	}
	
	/**
	 * 查看全部省份
	 */
	@RequestMapping("/province/provincefindall")
	public String findALL(Model m){
		List<Province> list = ps.selectAll();
		m.addAttribute("allProvince",list);
		return "/province/provinceAll";
	}
	
}
