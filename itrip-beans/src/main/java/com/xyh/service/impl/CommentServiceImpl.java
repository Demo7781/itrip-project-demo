package com.xyh.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xyh.entity.Comment;
import com.xyh.mapper.CommentMapper;
import com.xyh.service.CommentService;

/**
 * @Author xyh
 * @Dare 2020/11/6 15:29
 * @description: ${description}
 * @Version 1.0
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}

