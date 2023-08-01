package com.nghinc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "khachhang")
public class KhachHang {

	@Id
	@Column(name = "makhachhang", columnDefinition = "VARCHAR(10) not null")
	private String maKhachHang;
	@Column(name = "tencongty", columnDefinition = "VARCHAR(50)")
	private String tenCongTy;
	@Column(name = "tengiaodich", columnDefinition = "VARCHAR(30)")
	private String tenGiaoDich;
	@Column(name = "diachi", columnDefinition = "VARCHAR(50)")
	private String diaChi;
	@Column(name = "email", columnDefinition = "VARCHAR(30)")
	private String email;
	@Column(name = "dienthoai", columnDefinition = "VARCHAR(15)")
	private String dienThoai;
	@Column(name = "fax", columnDefinition = "VARCHAR(15)")
	private String fax;

}
