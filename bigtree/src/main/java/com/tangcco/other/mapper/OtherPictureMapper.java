package com.tangcco.other.mapper;

import java.util.List;

import com.tangcco.other.beans.OtherPicture;
import com.tangcco.utils.MyMapper;

public interface OtherPictureMapper extends MyMapper<OtherPicture> {
	
	public List<OtherPicture> findBinnerPic();
}