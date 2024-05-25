package czy.payment.service.impl;

import czy.payment.entity.Product;
import czy.payment.mapper.ProductMapper;
import czy.payment.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
