package com.ProductImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.ProductDAO.ProductIntf;
import com.Productmodel.Product;

public class ProductImpl implements ProductIntf{
int row=0;
	@Override
	public int save(Object object) {
		Product p1 =(Product) object;
		try {
			

			Statement db = null;
			PreparedStatement s1 = db.getConnection().prepareStatement("insert into Product value(?,?,?");
			s1.setInt(1,p1.getProductID() );
			s1.setNString(2,p1.getProductName());
			s1.setDouble(3,p1.getProductPrice() );
			row = s1.executeUpdate();
			db.getConnection();
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		return row;
	}

}
