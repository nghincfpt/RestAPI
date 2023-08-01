package com.nghinc.service;

import java.util.List;
import java.util.Optional;

import com.nghinc.model.KhachHang;

public interface KhachHangService {

	void deleteById(String id);

	boolean existsById(String id);

	Optional<KhachHang> findById(String id);

	List<KhachHang> findAll();

	<S extends KhachHang> S save(S entity);

}
