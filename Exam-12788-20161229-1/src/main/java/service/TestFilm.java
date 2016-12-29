package service;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.FilmDao;
import domain.Film;

public class TestFilm {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		applicationContext.start();
		FilmDao filmDao=(FilmDao) applicationContext.getBean("filmDao");
		Scanner scanner=new Scanner(System.in);
		Film film=new Film();
		System.out.println("请输入电影名称(title): ");
		String title=scanner.next();
		film.setTitle(title);
		System.out.println("请输入电影描述(description): ");
		String description=scanner.next();
		film.setDescription(description);
		System.out.println("请输入语言 ID(language_id): ");
		int id=scanner.nextInt();
		film.setId(id);
		filmDao.add(film);
		applicationContext.stop();
		
		
	}
}
