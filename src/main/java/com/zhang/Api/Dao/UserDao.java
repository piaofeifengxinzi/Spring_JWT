package com.zhang.Api.Dao;

import com.zhang.Api.Model.DAOUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//接下来我们定义UserDao，
//它是扩展Spring Framework类CrudRepository的接口。
//CrudRepository类是一个泛型，并将以下两个参数作为参数 -
//这个存储库将使用什么类型的对象 -
//在我们的例子中DAOUser和Id将是什么类型的对象 -
// 整数（因为在UserDao类中定义的id是Integer）这是存储库类所需的唯一配置
//现在将处理在DB中插入用户详细信息所需的操作

@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {
    UserDao findByUsername(String username);
}

