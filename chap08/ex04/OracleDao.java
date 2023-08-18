package ex04;

public class OracleDao implements DataAccessObject {
	
	@Override
	public void select() {
		System.out.println("search from OracleDB");
	}
	@Override
	public void insert() {
		System.out.println("insert into OracleDB");
	}
	@Override
	public void update() {
		System.out.println("modify OracleDB");
	}
	@Override
	public void delete() {
		System.out.println("delete from OracleDB");
	}
}
