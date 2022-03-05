package com.mulcam.run.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mulcam.run.dao.MateDAO;
import com.mulcam.run.dto.Group;
import com.mulcam.run.dto.GroupAndMate;
import com.mulcam.run.dto.Mate;
import com.mulcam.run.dto.Ptp;
import com.mulcam.run.dto.Warning;

@Service
public class MateServiceImipl implements MateService {

		
	@Autowired
	MateDAO mateDAO;
	
	@Override
	public List<GroupAndMate> allpostInfo() throws Exception {
		return mateDAO.postList();
	}
	
	@Override
	public List<Mate> allMateInfo() throws Exception {
		return mateDAO.mateList();
	}

	@Override
	public List<Group> allGroupInfo() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mate mateInfo(int mate_articleNO) throws Exception {
		return mateDAO.queryMate(mate_articleNO);
		
	}

	@Override
	public Group groupInfo(int group_articleNO) throws Exception {
		return mateDAO.queryGroup(group_articleNO);
	}

	@Override
	public Mate updateMate(int mate_articleNO) throws Exception {
		return null;
	}

	@Override
	public Group updateGroup(int group_articleNO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mate removeMate(Mate mate) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Group removeGroup(Group group) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int viewsMate(int mate_articleNO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int viewsGroup(int group_articleNO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void makeMate(Mate mate) throws Exception {
		mateDAO.insertMate(mate);
	}
	
	@Override
	public void makeGroup(Group group) throws Exception {
		mateDAO.insertGroup(group);
		
	}

	@Override
	public Warning makeWarning(Warning warning) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ptpInfo(int mate_articleNO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void like(int mate_articleNO) throws Exception {
			mateDAO.like(mate_articleNO);
//			mateDAO.insertptp(mate_articleNO);
	}

	@Override
	public void likeCancel(int mate_articleNO) throws Exception {
		mateDAO.likeCancel(mate_articleNO);
	}

	@Override
	public void makePtp(Ptp ptp) throws Exception {
		mateDAO.insertptp(ptp);
	}
}
