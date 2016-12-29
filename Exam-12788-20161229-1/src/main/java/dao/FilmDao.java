package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import aop.Aop;

import domain.Film;

public class FilmDao {
	private Aop aop;//aop依赖注入
	public void setAop(Aop aop) {
		this.aop = aop;
	}

	private SqlSessionFactory sqlSessionFactory;//sqlSessionFactory依赖注入
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	//插入film信息
	public void add(Film film){
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		sqlSession.insert(Film.class.getName()+".add", film);
		
		sqlSession.close();
	}
}
