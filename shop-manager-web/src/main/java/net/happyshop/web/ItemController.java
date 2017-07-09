package net.happyshop.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.happyshop.pojo.EasyUiDataGridResult;
import net.happyshop.pojo.TbItem;
import net.happyshop.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
    
    @Autowired
    private ItemService itemService;
    
    @RequestMapping("/{itemId}")
    @ResponseBody
    public TbItem getItemById(@PathVariable long itemId){
        return itemService.getItemById(itemId);
    }
    
    @RequestMapping("/list")
    @ResponseBody
    public EasyUiDataGridResult<TbItem> getItemList(int page, int rows){
        return itemService.getItemList(page, rows);
    }

}
