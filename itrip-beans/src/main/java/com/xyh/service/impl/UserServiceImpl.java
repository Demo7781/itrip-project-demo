package com.xyh.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyh.entity.User;
import com.xyh.mapper.UserMapper;
import com.xyh.service.UserService;

/**
 * @Author xyh
 * @Dare 2020/11/6 15:29
 * @description: ${description}
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

