package com.company.create.FactoryPattern;
/***
 * 1.用反射机制可以解决每次增加一个产品时，都需要增加一个对象实现工厂的缺点
 * 2,使用范型，省略类型强制转换，支持多态
 */

public class ShapeFactory1 {

	//使用 getShape 方法获取形状类型的对象
   public static <T> T getShape(Class<? extends T> clazz){
    T obj = null;

      try {
         obj = (T) Class.forName(clazz.getName()).newInstance();
      } catch (InstantiationException e) {
         e.printStackTrace();
      } catch (IllegalAccessException e) {
         e.printStackTrace();
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }


      return obj;
   }
}