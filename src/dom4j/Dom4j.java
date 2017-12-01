package dom4j;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import dom4j.pojo.EcgAiEvent;

public class Dom4j {

	private static ArrayList<Book> bookList = new ArrayList<Book>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SAXReader reader = new SAXReader();
		try {
			Document document = reader.read(new File("src/test/file/0b30f12c2693402d88fec1321a7cd034.xml"));
			Element bookStore = document.getRootElement();
			Iterator it = bookStore.elementIterator();
			while (it.hasNext()) {
				Element book = (Element) it.next();
				System.out.println("节点的名字是：" + book.getName());
				if (book.getName().equals("heart_beat")) {
					System.out.println("===========heart_beat=============");
					List<Attribute> tempAttrs = book.attributes();
					if (tempAttrs != null && tempAttrs.size() > 0) {
						for (Attribute attr : tempAttrs) {
							System.out.println("属性的名字是：" + attr.getName() + "属性的值是：" + attr.getValue());
						}
					} else {
						System.out.println("没有属性！！");
					}
				} else {
					Iterator it1 = book.elementIterator();
					EcgAiEvent eae = new EcgAiEvent();
					eae.setEventLevel(Integer.parseInt(book.getName().substring(book.getName().length() - 1)));
					System.out.println(eae.getEventLevel());
					while (it1.hasNext()) {
						Element book1 = (Element) it1.next();
						System.out.println("节点的名字是：" + book1.getName());
						List<Attribute> tempAttrs1 = book1.attributes();
						if (tempAttrs1 != null && tempAttrs1.size() > 0) {
							for (Attribute attr1 : tempAttrs1) {
								if (attr1.getName().equals("info")) {
									System.out.println(attr1.getValue());
									String[] temp = attr1.getValue().split(",");

									eae.setEventCode(temp[0]);
									eae.setEventName(temp[1]);
									eae.setStartPos(Integer.parseInt(temp[2]));
									eae.setEndPos(Integer.parseInt(temp[3]));
									eae.setAvgRate(Integer.parseInt(temp[4]));
									eae.setMaxRate(Integer.parseInt(temp[5]));
									eae.setMinRate(Integer.parseInt(temp[6]));
									eae.setCount(Integer.parseInt(temp[7]));
									eae.setMaxLenTime(Float.parseFloat(temp[8]));
									System.out.print(eae.getEventCode());
									System.out.print(",");
									System.out.print(eae.getEventName());
									System.out.print(",");
									System.out.print(eae.getStartPos());
									System.out.print(",");
									System.out.print(eae.getEndPos());
									System.out.print(",");
									System.out.print(eae.getAvgRate());
									System.out.print(",");
									System.out.print(eae.getMaxRate());
									System.out.print(",");
									System.out.print(eae.getMinRate());
									System.out.print(",");
									System.out.print(eae.getCount());
									System.out.print(",");
									System.out.print(eae.getMaxLenTime());
									System.out.print("\n");

								}
							}
						} else {
							System.out.println("没有属性！！");
						}
					}

				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

}
