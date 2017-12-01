package dom4j.pojo;

import java.util.Date;

public class EcgAiEvent {
	  
    /**
     * ID
     */
    private long id ;
    
    /**
     * 错误事件ID
     */
    private long errId ;
    
    /**
     * 调用（执行）ID
     */
    private long excId ;
    
    /**
     * 事件级别（0紧急事件 1一般事件 2普通事件）
     */
    private int eventLevel ;
    
    /**
     * 事件编码
     */
    private String eventCode ;
    
    /**
     * 事件名称
     */
    private String eventName ;
    
    /**
     * 起始位置
     */
    private int startPos ;
    
    /**
     * 结束位置
     */
    private int endPos ;
    
    /**
     * 平均心率
     */
    private int avgRate ;
    
    /**
     * 最大心率
     */
    private int maxRate ;
    
    /**
     * 最小心率
     */
    private int minRate ;
    
    /**
     * 事件数量
     */
    private int count ;
    
    /**
     * 最大时长
     */
    private float maxLenTime ;
    
    /**
     * 是否正确（默认正常）
     */
    private boolean isOk ;
    
    /**
     * 修改人
     */
    private long editUserId ;
    
    /**
     * 修改时间
     */
    private Date editTime ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getErrId() {
        return errId;
    }

    public void setErrId(long errId) {
        this.errId = errId;
    }

    public long getExcId() {
        return excId;
    }

    public void setExcId(long excId) {
        this.excId = excId;
    }

    public int getEventLevel() {
        return eventLevel;
    }

    public void setEventLevel(int eventLevel) {
        this.eventLevel = eventLevel;
    }

    public String getEventCode() {
        return eventCode;
    }

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getStartPos() {
        return startPos;
    }

    public void setStartPos(int startPos) {
        this.startPos = startPos;
    }

    public int getEndPos() {
        return endPos;
    }

    public void setEndPos(int endPos) {
        this.endPos = endPos;
    }

    public int getAvgRate() {
        return avgRate;
    }

    public void setAvgRate(int avgRate) {
        this.avgRate = avgRate;
    }

    public int getMaxRate() {
        return maxRate;
    }

    public void setMaxRate(int maxRate) {
        this.maxRate = maxRate;
    }

    public int getMinRate() {
        return minRate;
    }

    public void setMinRate(int minRate) {
        this.minRate = minRate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getMaxLenTime() {
        return maxLenTime;
    }

    public void setMaxLenTime(float maxLenTime) {
        this.maxLenTime = maxLenTime;
    }

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean isOk) {
        this.isOk = isOk;
    }

    public long getEditUserId() {
        return editUserId;
    }

    public void setEditUserId(long editUserId) {
        this.editUserId = editUserId;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }
}
