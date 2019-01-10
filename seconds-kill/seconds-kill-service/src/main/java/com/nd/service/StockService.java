package com.nd.service;


import com.nd.pojo.Stock;

/**
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}(用一句话描述该文件做什么)
 * @date : ${date} ${time}
 * @author : 新梦想IT教育.陈超
 * @version V1.0
 */
public interface StockService {

    /**
     * 获取剩余库存
     * @param id
     * @return
     */
    int getStockCount(int id) ;

    /**
     * 根据库存 ID 查询库存信息
     * @param id
     * @return
     */
    Stock getStockById(int id) ;

    /**
     * 更新库存信息
     * @param stock
     * return
     */
    int updateStockById(Stock stock);

    /**
     * 乐观锁更新库存
     * @param stock
     * @return
     */
    int updateStockByOptimistic(Stock stock);


}
