package _14콜렉션멤버;

import java.util.ArrayList;

public class ActionLoad implements Action {
	private Utils utils;
	private ArrayList<Member> mList;
	private MemberDAO mDao;
	
	public ActionLoad() {
		utils = Utils.getInstance();
		mList = MemberDAO.getMemberList();
		mDao = MemberDAO.getInstance();
	}
	
	@Override
	public void execute() {
		System.out.println("==========[회원 데이터 불러오기]==========");
		utils.loadFile(mList);
	}

}
