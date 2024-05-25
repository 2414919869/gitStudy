package czy.payment.service.impl;

import czy.payment.entity.OrderInfo;
import czy.payment.mapper.OrderInfoMapper;
import czy.payment.service.OrderInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}
