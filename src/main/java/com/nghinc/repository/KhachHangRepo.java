package com.nghinc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nghinc.model.KhachHang;

@Repository
public interface KhachHangRepo  extends JpaRepository<KhachHang, String>{
	

}
