package com.gx.data.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gx.data.server.entity.Goods;
import com.gx.data.server.mapper.GoodsMapper;
import com.gx.data.server.service.GoodsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xun.guo
 * @since 2019-12-31
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

    public List<Goods> getAll(){

        List<Goods> result = new ArrayList<>();
        result = this.list();
        if(null == list()){
            return new ArrayList<>();
        }else {
            return result;
        }
    }


}
