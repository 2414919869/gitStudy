package czy.payment.service.impl;

import czy.payment.entity.PaymentInfo;
import czy.payment.mapper.PaymentInfoMapper;
import czy.payment.service.PaymentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements PaymentInfoService {

}
