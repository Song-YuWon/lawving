package com.ict.lawving.limit.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.lawving.limit.model.dao.LimitDao;
import com.ict.lawving.limit.model.vo.LimitVo;

@Service("limitServiceImpl")
public class LimitServiceImpliment implements LimitService{
	@Autowired
	private LimitDao limitDao;
	
	
	
	@Override
	public ArrayList<LimitVo> selectLimitList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<LimitVo> selectBlackList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertLimitMember(int members_idx) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int chkinsertLimitMember(int[] members_idx) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateLimitCountPlus(int members_idx) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int chkUpdateLimitCountPlus(int[] members_idx) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateLimitCountMinus(int members_idx) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int chkUpdateLimitCountMinus(int members_idx) {
		// TODO Auto-generated method stub
		return 0;
	}

}
