package com.ict.lawving.members.model.service;

import com.ict.lawving.members.model.vo.MembersVo;

public interface MembersService {

	int insertMember(MembersVo members);
	MembersVo selectloginCheck(MembersVo members);
	int selectCheckid(String id);

}
