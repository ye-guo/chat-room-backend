package icu.yeguo.chat.model.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 聊天消息
 *
 * @TableName message
 */
@TableName(value = "message")
@Data
public class Message implements Serializable {
    /**
     * 消息id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 聊天室id
     */
    @TableField(value = "room_id")
    private Long roomId;

    /**
     * 发送消息人uid
     */
    @TableField(value = "from_uid")
    private Long fromUid;

    /**
     * 消息内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 0未读 1已读
     */
    @TableField(value = "is_read")
    private Integer isRead;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    private Date updateTime;

    /**
     * 0正常 1删除
     */
    @TableLogic(value = "is_deleted")
    private Integer isDeleted;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    public Message(Long fromUid, String content, Long roomId) {
        this.fromUid = fromUid;
        this.content = content;
        this.roomId = roomId;
    }
}