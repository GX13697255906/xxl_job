package com.gx.data.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gx.data.server.entity.Goods;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xun.guo
 * @since 2019-12-31
 */
public interface GoodsService extends IService<Goods> {

    List<Goods> getAll();

}
