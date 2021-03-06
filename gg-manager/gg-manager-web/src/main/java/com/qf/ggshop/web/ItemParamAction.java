package com.qf.ggshop.web;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.pojo.po.ItemParam;
import com.qf.ggshop.pojo.vo.ItemParamCustom;
import com.qf.ggshop.service.ItemParamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemParamAction {
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ItemParamService itemParamService;
    
    //分页显示规格参数
    @ResponseBody
    @RequestMapping("/itemParams")
    public Result<ItemParamCustom> listItemParamsByPage(Page page) {
        Result<ItemParamCustom> result=null;
        try {
            result = itemParamService.listItemParamsByPage(page);
        } catch (Exception e) {
            logger.error(e.getMessage(),e);
            e.printStackTrace();
        }
        return result;
    }
    
    //保存分组规格参数
    @ResponseBody
    @RequestMapping("/item/param/")
    public int saveGroupParams(@PathVariable("cid") Long cid , ItemParam itemParam){
      
        return 0;
    }
    
}
