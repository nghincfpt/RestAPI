package com.nghinc.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nghinc.model.KhachHang;
import com.nghinc.repository.KhachHangRepo;
import com.nghinc.service.KhachHangService;

@Service
public class KhachHangServiceImpl  implements KhachHangService{

	private KhachHangRepo khachHangRepo;
	
	public KhachHangServiceImpl(KhachHangRepo khachHangRepo) {
		this.khachHangRepo = khachHangRepo;
	}

	@Override
	public <S extends KhachHang> S save(S entity) {
		return khachHangRepo.save(entity);
	}

	@Override
	public List<KhachHang> findAll() {
		return khachHangRepo.findAll();
	}

	@Override
	public Optional<KhachHang> findById(String id) {
		return khachHangRepo.findById(id);
	}

	@Override
	public boolean existsById(String id) {
		return khachHangRepo.existsById(id);
	}

	@Override
	public void deleteById(String id) {
		khachHangRepo.deleteById(id);
	}
	
	
}
