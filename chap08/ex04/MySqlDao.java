package ex04;

public class MySqlDao implements DataAccessObject {
	
	@Override
	public void select() {
		System.out.println("search from MySqlDB");
	}
	@Override
	public void insert() {
		System.out.println("insert into MySqlDB");
	}
	@Override
	public void update() {
		System.out.println("modify MySqlDB");
	}
	@Override
	public void delete() {
		System.out.println("delete from MySqlDB");
	}
}
