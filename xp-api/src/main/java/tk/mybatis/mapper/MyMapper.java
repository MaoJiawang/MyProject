package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 自己的mapper
 * 注意  该类一定不能被spring扫描到
 * @author dp
 * @version 1.0.0
 * @date 2020-02-28 12:00
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
