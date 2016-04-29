package io.github.didriklind.javaClasses;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DBAndDAOImitation {

	private static ArrayList<BlogBean> blogList = new ArrayList<>();
	
	public static void genereteBlogs() {
		
		if(blogList != null) {
			blogList.add(new BlogBean(0, "I LOVE WWW", "Didrik Lind", new Date(2009,12,1),
					"In practice, a writer can get too caught up in all the things they"
					+ " have to say and fail to organize it all into bits an ordinary "
					+ "human being would be able to digest. The end result is a huge "
					+ "run-on paragraph that makes it difficult to recall the original "
					+ "point of it, if there was one in the first place. The reader's "
					+ "eyes glaze over and all they see is a Wall Of Text."));
			blogList.add(new BlogBean(1, "JESUS IS B*CK", "Niclas Ivarsson Rudman", new Date(2009,12,1),
					"Ladies others the six desire age. Bred am soon park past read by lain. "
					+ "As excuse eldest no moment. An delight beloved up garrets am cottage private."
					+ " The far attachment discovered celebrated decisively surrounded for and."
					+ " Sir new the particular frequently indulgence excellence how. "
					+ "Wishing an if he sixteen visited tedious subject it. Mind mrs"));
			blogList.add(new BlogBean(2, "building budwowo", "Hannes Nyberg", new Date(2009,12,1),
					"Left till here away at to whom past. Feelings laughing at no wondered repeated"
					+ " provided finished. It acceptance thoroughly my advantages everything as."
					+ " Are projecting inquietude affronting preference saw who. Marry of am do"
					+ " avoid ample as. Old disposal followed she ignorant desirous two has."
					+ " Called played entire roused though for one too. He into walk roof made"
					+ " tall cold he. Feelings way likewise addition wandered contempt bed indulged"));
			blogList.add(new BlogBean(3, "yippikayajate", "Tor Gammelgard", new Date(2009,12,1),
					"One of the first things learned in comics is how to use dialogue "
					+ "bubbles effectively; a writer not allocating space carefully will"
					+ " end up covering their panel with a bunch of text and white space."
					+ " Eventually the reader will realize that they're just looking at plain "));
			blogList.add(new BlogBean(4, "MUSIC IS MY THANG", "Pierre Olsson Kruse", new Date(2009,12,1),
					"Far curiosity incommode now led smallness allowance. Favour bed"
					+ " assure son things yet. She consisted consulted elsewhere"
					+ " happiness disposing household any old the. Widow downs "
					+ "you new shade drift hopes small. So otherwise commanded "
					+ "sweetness we improving. Instantly by daughters resembled "
					+ "unwilling principle so middleton. Fail most room even gone"
					+ " her end like. Comparison dissimilar unpleasant six "
					+ "compliment two unpleasing any add. Ashamed my company"
					+ " thought wishing colonel it prevent he in. Pretended residence"
					+ " are something far engrossed old off. "));
		}

	}
	
	public static ArrayList<BlogBean> getAllBlogs() {
		return blogList;
	}
	
	public static BlogBean getBlog(int id) {
		return blogList.get(id);
	}
}
