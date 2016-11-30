package model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface AlmacenInterface {
	@GET("/Almacen/{id}")
	Call<List<Almacen>> getAlmacen (@Path("id") int id);
	
	@GET("/Almacen")
	Call<List<Almacen>> getAlmacen ();
	
	@POST("/Almacen")
	
	public Response createProductInJSON(Product product) {

		String result = "Product created : " + product;
		return Response.status(201).entity(result).build();

	}
		
	
}
