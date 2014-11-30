package org.losy.core;

import org.losy.annotation.Column;
import org.losy.annotation.Table;
import org.losy.domian.ColumnInfo;
import org.losy.domian.TableInfo;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;



public class AnnotationParser{

	public List<TableInfo> parse(Class<?>... entitys) {
		List<TableInfo> tableList = new ArrayList<TableInfo>();
		for (Class<?> clazz : entitys) {
			if(clazz.isAnnotationPresent(Table.class)) {
				Table table = clazz.getAnnotation(Table.class);
				TableInfo ti = TableInfo.init(table);
				ti.setEntityName(clazz.getName());
				ti.setEntitySimpleName(clazz.getSimpleName());
				Field[] fields = clazz.getDeclaredFields();
				for (Field field : fields) {
					if(field.isAnnotationPresent(Column.class)) {
						Column colunm = field.getAnnotation(Column.class);
						ColumnInfo ci = ColumnInfo.init(colunm);
						ci.setFieldName(field.getName());
						ci.setJavaType(field.getType().getSimpleName());
						ci.setJavaFullType(field.getType().getName());
						ci.validation();
						ti.addImport(field.getType().getName());
						ti.addColumn(ci);
					}
				}
				ti.validation();
				tableList.add(ti);
			} 
		}
		return tableList;
	}

}
