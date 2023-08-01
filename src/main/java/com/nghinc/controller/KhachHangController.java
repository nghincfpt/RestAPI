package com.nghinc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nghinc.exception.KhachHangNotfoundException;
import com.nghinc.model.KhachHang;
import com.nghinc.service.KhachHangService;

@RestController
@RequestMapping("API")
@CrossOrigin("*")
public class KhachHangController {

	@Autowired
	private KhachHangService khachHangService;
	
	@GetMapping("/khachhangs")
	List<KhachHang> listAllKhachHang(){
		return khachHangService.findAll();
	}
	
	@PostMapping("/khachhang")
	KhachHang newKhachHang(@RequestBody KhachHang newKhachHang) {
		return khachHangService.save(newKhachHang);
	}
	
	@PutMapping("/khachhang/{id}")
	KhachHang updateKhachHang(@RequestBody KhachHang newKhachHang,@PathVariable String id) {
		return khachHangService.findById(id)
				.map(khachhang ->{
//					khachhang.setMaKhachHang(newKhachHang.getMaKhachHang());
					khachhang.setTenCongTy(newKhachHang.getTenCongTy());
					khachhang.setTenGiaoDich(newKhachHang.getTenGiaoDich());
					khachhang.setDiaChi(newKhachHang.getDiaChi());
					khachhang.setEmail(newKhachHang.getEmail());
					khachhang.setDienThoai(newKhachHang.getDienThoai());
					khachhang.setFax(newKhachHang.getFax());
					 
					return khachHangService.save(khachhang);
				}).orElseThrow(()-> new KhachHangNotfoundException(id));
	}
	
	
	@DeleteMapping("/khachhang/{id}")
	String deleteID(@PathVariable String id) {
		if(!khachHangService.existsById(id)) {
			throw new  KhachHangNotfoundException(id);
		}else {
		 khachHangService.deleteById(id);
		 return " Khách Hàng với id là :" + id +"  đã xóa thành công";
		}
	}
	
	
	
}
