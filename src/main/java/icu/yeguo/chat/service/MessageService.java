package icu.yeguo.chat.service;

import icu.yeguo.chat.model.entity.Message;
import com.baomidou.mybatisplus.extension.service.IService;
import icu.yeguo.chat.model.vo.Combined.MessageANDUserVo;
import icu.yeguo.chat.model.vo.CursorResponse;

/**
 * @author Lenovo
 * @description 针对表【message(聊天消息)】的数据库操作Service
 * @createDate 2024-08-11 16:32:19
 */
public interface MessageService extends IService<Message> {

    CursorResponse<MessageANDUserVo> cursorQuery(Long roomId, Long pageSize, Long cursorId);

    String getSomeData(String test) throws InterruptedException;
}
