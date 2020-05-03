package li.ssm.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import li.ssm.domain.Country;
import li.ssm.service.CountryService;


/**  
 * 
 */
@Controller
public class CountryController {
	
	@Resource(name = "countryService")
	private CountryService cs;
	
	/**
	 * 所有查询国家的直接跳转到第一页
	 */
	@RequestMapping(value = {"/country/findall"})
	public String findall(){
		return "redirect:/country/findPage?pn=1";
	}
	
	/**
	 * 分页查询全部用户;pn=pageNo
	 * pn是第几页；len是每页多少条数据
	 */
	@RequestMapping(value = {"/country/findPage"})
	public String findPage(Model m,@RequestParam("pn")int pn){
		//查询结果的总数据条数
		int count = cs.selectCount();
		
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
		
		List<Country> list = cs.selectPage(offest,recordPerPage);
		m.addAttribute("allCounties",list);
		m.addAttribute("pages",pages);
		return "country/countryList";
	}
	
	
	/**
	 * 删除国家
	 */
	@RequestMapping("/country/deletecountry")
	public String deletecountry(@RequestParam("cid")Integer cid){
		cs.delete(cid);
		return "redirect:/country/findall";
	}
	
	/**
	 * 先进这个修改的页面
	 * cname=${c.name}
	 */
	@RequestMapping("/country/countryEdit")
	public String countryEdit(Model m,@RequestParam("cname")String cname){
		m.addAttribute("cname",cname);
		return "country/countryEdit";
	}
	
	
	/**
	 * 修改国家
	 */
	@RequestMapping(value="/country/countrySave", method = RequestMethod.POST)
	public String savecountry(Country c){
		cs.update(c);
		return "redirect:/country/findall";
	}
	
	/**
	 * 新增国家
	 */
	@RequestMapping(value="/country/countryAdd", method = RequestMethod.POST)
	public String addcountry(Country c){
		cs.insert(c);;
		return "redirect:/country/findall";
	}
	
	/**
	 * 访问html
	 */
	@RequestMapping("/country/hello")
	public String accessHtml(){
		return "forward:/html/hello.html";
	}
	
}
