package com.nghinc.exception;

public class KhachHangNotfoundException  extends RuntimeException{
  public KhachHangNotfoundException(String id) {
	  super("Could not found the  khach hang with id :"+id);
  }
}

