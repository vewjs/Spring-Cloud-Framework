package com.cloud.user.service;

import com.cloud.user.bean.request.RealNameAuthRequest;
import com.cloud.user.bean.request.TaoBaoRequest;
import com.cloud.user.bean.response.RrealNameAuthResponse;
import com.cloud.user.bean.response.TaobaoResponse;
import com.cloud.user.dao.base.UserTaobaoMapper;
import com.cloud.user.dao.base.model.UserTaobao;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @version V1.0
 * @Description: TODO
 * @Date 2018年11月6日 上午10:54:37
 */
@Service
public class RealNameAuthServiceImpl implements RealNameAuthService {

    public RrealNameAuthResponse addUserInfo(RealNameAuthRequest request) {
        UserTaobao bean = new UserTaobao();
        BeanUtils.copyProperties(request, bean);
        userTaobaoMapper.insertSelective(bean);
        RrealNameAuthResponse response = new RrealNameAuthResponse();
        return response;
    }

    @Autowired
    private UserTaobaoMapper userTaobaoMapper;
}
