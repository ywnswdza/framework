package org.losy;



import org.losy.core.AnnotationParser;
import org.losy.core.CodeGenerator;
import org.losy.domian.TableInfo;


import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<TableInfo> list =  new AnnotationParser().parse(Role.class);
		CodeGenerator.generatorAll(list);
	}
}
