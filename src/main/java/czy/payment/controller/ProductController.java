package czy.payment.controller;

import czy.payment.entity.Product;
import czy.payment.service.ProductService;
import czy.payment.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController  //确保接口方法都是以json的数据形式返回
@RequestMapping("/api/product")
@CrossOrigin
public class ProductController {
    @Resource
    private ProductService productService;

    @GetMapping("/test")
    public R test(){
        return R.ok()
                .data("message","hello")
                .data("time",new Date());
    }

    @GetMapping("/list")
    public R list(){
        List<Product> list=productService.list();
        return R.ok().data("productList",list);
    }

}


