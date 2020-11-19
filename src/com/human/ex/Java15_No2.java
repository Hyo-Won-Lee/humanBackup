package com.human.ex;

class Order{
	
	public String orderNo = "201803120001";
	public String ordererId = "abc123";
	public String orderDate = "2018�� 3�� 12��";
	public String orderer = "ȫ���";
	public String orderProductNo = "PD0345-12";
	public String toAddress = "����� �������� ���ǵ��� 20����";
	public Order() {}
	public Order(String orderNo, String ordererId, String orderDate, String orderer, String orderProductNo,
			String toAddress) {
		super();
		this.orderNo = orderNo;
		this.ordererId = ordererId;
		this.orderDate = orderDate;
		this.orderer = orderer;
		this.orderProductNo = orderProductNo;
		this.toAddress = toAddress;
	}
	@Override
	public String toString() {
		return "�ֹ� ��ȣ : " + orderNo +
				"\n�ֹ��� ���̵� : " + ordererId +
				"\n�ֹ� ��¥ : " + orderDate +
				"\n�ֹ��� �̸� : " + orderer +
				"\n�ֹ� ��ǰ ��ȣ : " + orderProductNo +
				"\n��� �ּ� : " + toAddress;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + ((orderNo == null) ? 0 : orderNo.hashCode());
		result = prime * result + ((orderProductNo == null) ? 0 : orderProductNo.hashCode());
		result = prime * result + ((orderer == null) ? 0 : orderer.hashCode());
		result = prime * result + ((ordererId == null) ? 0 : ordererId.hashCode());
		result = prime * result + ((toAddress == null) ? 0 : toAddress.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (orderNo == null) {
			if (other.orderNo != null)
				return false;
		} else if (!orderNo.equals(other.orderNo))
			return false;
		if (orderProductNo == null) {
			if (other.orderProductNo != null)
				return false;
		} else if (!orderProductNo.equals(other.orderProductNo))
			return false;
		if (orderer == null) {
			if (other.orderer != null)
				return false;
		} else if (!orderer.equals(other.orderer))
			return false;
		if (ordererId == null) {
			if (other.ordererId != null)
				return false;
		} else if (!ordererId.equals(other.ordererId))
			return false;
		if (toAddress == null) {
			if (other.toAddress != null)
				return false;
		} else if (!toAddress.equals(other.toAddress))
			return false;
		return true;
	}
	
}

public class Java15_No2 {

	public static void main(String[] args) {
		Order o=new Order();
		System.out.println(o);

	}

}
