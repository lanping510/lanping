package me.andpay.ac.entity;

/**
 * 实体类
 * @author lanping
 * @version 1.0
 * @date 2018-05-29
 */
public class Merchant { 

	private Integer id;	//
	private String merchantName;	//商户名称
	private String chargeName;	//负责人姓名
	private String telephone;	//联系电话
	private String licence;	//营业执照号
	private String businessScope;	//经营范围
	private String certificate;	//经营许可证号
	private String certificateStartTime;	//许可证有效期 开始时间
	private String remark;	//备注信息
	private String healthCertificate;	//健康证配备情况
	private String state;	//有效状态
	private String sequenceId;	//编号
	private String codeImgPath;	//二维码地址
	private String codeMessage;	//二维码信息
	private String licencePath;	//营业执照照片
	private String storeIcon;	//
	private String certificateEndTime;	//许可证有效期 结束时间
	private String company;	//公司名称
	private String createTime;	//发布时间
	private String certificatePath;	//经营许可证照片
	private String healthPath;	//
	private Integer partitionId;	//
	private String address;	//省市区地址
	private String detailAddress;	//详细地址
	private String storeImage;	//storeImage
	private String commitmentImg;	//承诺书
	private String goodsRegisterImg;	//食品小作坊登记证

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) { 
		this.id = id;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) { 
		this.merchantName = merchantName;
	}

	public String getChargeName() {
		return chargeName;
	}

	public void setChargeName(String chargeName) { 
		this.chargeName = chargeName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) { 
		this.telephone = telephone;
	}

	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) { 
		this.licence = licence;
	}

	public String getBusinessScope() {
		return businessScope;
	}

	public void setBusinessScope(String businessScope) { 
		this.businessScope = businessScope;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) { 
		this.certificate = certificate;
	}

	public String getCertificateStartTime() {
		return certificateStartTime;
	}

	public void setCertificateStartTime(String certificateStartTime) { 
		this.certificateStartTime = certificateStartTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) { 
		this.remark = remark;
	}

	public String getHealthCertificate() {
		return healthCertificate;
	}

	public void setHealthCertificate(String healthCertificate) { 
		this.healthCertificate = healthCertificate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) { 
		this.state = state;
	}

	public String getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(String sequenceId) { 
		this.sequenceId = sequenceId;
	}

	public String getCodeImgPath() {
		return codeImgPath;
	}

	public void setCodeImgPath(String codeImgPath) { 
		this.codeImgPath = codeImgPath;
	}

	public String getCodeMessage() {
		return codeMessage;
	}

	public void setCodeMessage(String codeMessage) { 
		this.codeMessage = codeMessage;
	}

	public String getLicencePath() {
		return licencePath;
	}

	public void setLicencePath(String licencePath) { 
		this.licencePath = licencePath;
	}

	public String getStoreIcon() {
		return storeIcon;
	}

	public void setStoreIcon(String storeIcon) { 
		this.storeIcon = storeIcon;
	}

	public String getCertificateEndTime() {
		return certificateEndTime;
	}

	public void setCertificateEndTime(String certificateEndTime) { 
		this.certificateEndTime = certificateEndTime;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) { 
		this.company = company;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) { 
		this.createTime = createTime;
	}

	public String getCertificatePath() {
		return certificatePath;
	}

	public void setCertificatePath(String certificatePath) { 
		this.certificatePath = certificatePath;
	}

	public String getHealthPath() {
		return healthPath;
	}

	public void setHealthPath(String healthPath) { 
		this.healthPath = healthPath;
	}

	public Integer getPartitionId() {
		return partitionId;
	}

	public void setPartitionId(Integer partitionId) { 
		this.partitionId = partitionId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) { 
		this.address = address;
	}

	public String getDetailAddress() {
		return detailAddress;
	}

	public void setDetailAddress(String detailAddress) { 
		this.detailAddress = detailAddress;
	}

	public String getStoreImage() {
		return storeImage;
	}

	public void setStoreImage(String storeImage) { 
		this.storeImage = storeImage;
	}

	public String getCommitmentImg() {
		return commitmentImg;
	}

	public void setCommitmentImg(String commitmentImg) { 
		this.commitmentImg = commitmentImg;
	}

	public String getGoodsRegisterImg() {
		return goodsRegisterImg;
	}

	public void setGoodsRegisterImg(String goodsRegisterImg) { 
		this.goodsRegisterImg = goodsRegisterImg;
	}

	@Override
	public String toString() {
		return "Merchant [id=" + id + ",merchantName=" + merchantName + ",chargeName=" + chargeName + ",telephone=" + telephone + ",licence=" + licence + ",businessScope=" + businessScope + ",certificate=" + certificate + ",certificateStartTime=" + certificateStartTime + ",remark=" + remark + ",healthCertificate=" + healthCertificate + ",state=" + state + ",sequenceId=" + sequenceId + ",codeImgPath=" + codeImgPath + ",codeMessage=" + codeMessage + ",licencePath=" + licencePath + ",storeIcon=" + storeIcon + ",certificateEndTime=" + certificateEndTime + ",company=" + company + ",createTime=" + createTime + ",certificatePath=" + certificatePath + ",healthPath=" + healthPath + ",partitionId=" + partitionId + ",address=" + address + ",detailAddress=" + detailAddress + ",storeImage=" + storeImage + ",commitmentImg=" + commitmentImg + ",goodsRegisterImg=" + goodsRegisterImg + "]";
	}
}