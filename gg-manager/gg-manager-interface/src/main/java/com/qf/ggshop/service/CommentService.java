package com.qf.ggshop.service;

import com.qf.ggshop.common.dto.Page;
import com.qf.ggshop.common.dto.Result;
import com.qf.ggshop.pojo.po.Comment;

import java.util.List;

public interface CommentService {
    Result<Comment> listCommentsByPage(Long itemId, Page page);
}
