package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    //动态sql，有时需要使用userId，有时候不需要,首页（所有帖子）不需要userId，而个人主页（我的帖子）则需要userId
    //offset 起始行的行号，limit 每页最多显示多少个数据
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);

    //@Param用于给参数起别名
    //如果某个方法是动态sql(并且在<if>中使用)，而这个方法有且仅有一个参数，那么这个参数就需要起别名
    int selectDiscussPostRows(@Param("userId") int userId);


}
