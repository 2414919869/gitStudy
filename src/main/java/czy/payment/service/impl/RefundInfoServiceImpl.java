package czy.payment.service.impl;

import czy.payment.entity.RefundInfo;
import czy.payment.mapper.RefundInfoMapper;
import czy.payment.service.RefundInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class RefundInfoServiceImpl extends ServiceImpl<RefundInfoMapper, RefundInfo> implements RefundInfoService {

}
