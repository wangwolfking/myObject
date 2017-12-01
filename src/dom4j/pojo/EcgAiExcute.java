package dom4j.pojo;

import java.util.Date;

public class EcgAiExcute {

	/**
	 * ID
	 */
	private long id;

	/**
	 * 数据编码
	 */
	private String serviceCode;

	/**
	 * 线程组
	 */
	private String threadGroup;

	/**
	 * 线程序号
	 */
	private int threadIdx;

	/**
	 * 返回结果
	 */
	private String resultCode;

	/**
	 * 执行时间
	 */
	private Date startTime;

	/**
	 * 结束时间
	 */
	private Date endTime;

	/**
	 * 执行时长
	 */
	private long excLong;

	/**
	 * 紧急事件数
	 */
	private int level0;

	/**
	 * 一般事件数
	 */
	private int level1;

	/**
	 * 普通事件数
	 */
	private int level2;

	/**
	 * 备注（错误信息）
	 */
	private String remark;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getThreadGroup() {
		return threadGroup;
	}

	public void setThreadGroup(String threadGroup) {
		this.threadGroup = threadGroup;
	}

	public int getThreadIdx() {
		return threadIdx;
	}

	public void setThreadIdx(int threadIdx) {
		this.threadIdx = threadIdx;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public long getExcLong() {
		return excLong;
	}

	public void setExcLong(long excLong) {
		this.excLong = excLong;
	}

	public int getLevel0() {
		return level0;
	}

	public void setLevel0(int level0) {
		this.level0 = level0;
	}

	public int getLevel1() {
		return level1;
	}

	public void setLevel1(int level1) {
		this.level1 = level1;
	}

	public int getLevel2() {
		return level2;
	}

	public void setLevel2(int level2) {
		this.level2 = level2;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
