package com.hexaware.FTP105.factory;

import com.hexaware.FTP105.persistence.MenuDAO;
import com.hexaware.FTP105.persistence.DbConnection;
import java.util.List;

import com.hexaware.FTP105.model.Menu;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class MenuFactory {
  /**
   *  Protected constructor.
   */
  protected MenuFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  public static MenuDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(MenuDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Menu[] showMenu() {
    List<Menu> menu = dao().show();
    return menu.toArray(new Menu[menu.size()]);
  }
  /**
   * get Single Food details.
   * @param foodId for foodID.
   * @return the menu.
   */
  public static Menu getSingleMenu(final int foodId) {
    Menu menu = dao().getMenu(foodId);
    return menu;
  }
}
