package springbook.user.dao;

public class DaoFactory {
	
	public UserDao userDao() {
		return new UserDao(connectionMaker());
	}
	
	// DB 연결 기능 분리
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}

}
