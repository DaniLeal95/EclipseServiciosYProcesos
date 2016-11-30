package dal;

import java.util.List;

import model.Almacen;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AlmacenCallbackArray implements Callback<List<Almacen>>{
	
	
	


	@Override
	public void onFailure(Call<List<Almacen>> arg0, Throwable arg1) {
		System.out.println(arg1.getMessage());
		
	}

	@Override
	public void onResponse(Call<List<Almacen>> arg0, Response<List<Almacen>> arg1) {
		try{
			
			List<Almacen> productos = arg1.body();
			
			for (int i= 0 ; i<productos.size();i++){
				System.out.println(productos.get(i).toString());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
