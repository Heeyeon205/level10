package _14콜렉션멤버;

import java.util.ArrayList;

public class ActionUpdate implements Action {
	private Utils utils;
	private ArrayList<Member> mList;
	private MemberDAO mDao;
	
	public ActionUpdate() {
		utils = Utils.getInstance();
		mList = MemberDAO.getMemberList();
		mDao = MemberDAO.getInstance();
	}
	
	@Override
	public void execute() {
		if(!mDao.hasData()) return;
		System.out.println("==========[회원 수정]==========");
		String id = utils.getString("ID 입력: ");
		if(!mDao.hasId(id)) return;
		String pw = utils.getString("PW 입력: ");
		if(!mDao.isMatch(id, pw)) return;
		int idx = mDao.getIdx(id);
		String newName = utils.getString("이름 입력: ");
		if(mDao.isDupName(newName, idx)) return;
		mList.set(idx, new Member(id, pw, newName));
		System.out.printf("ID: %s, %s님으로 정보 변경 완료!\n", id, newName);
	}

}
