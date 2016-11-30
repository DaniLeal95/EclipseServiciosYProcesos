package dal;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import okhttp3.Headers;

import model.Almacen;


public class AlmacenCallback implements Callback<Almacen>{
	@Override
	public void onFailure(Call<Almacen> arg0, Throwable arg1) {
		int i;
		
		i=0;
	}

	@Override
	public void onResponse(Call<Almacen> arg0, Response<Almacen> resp) {
		
	Almacen almacen;
	String contentType;
	int code;
	String message;
	boolean isSuccesful;
	
	almacen = resp.body();
	
	Headers cabeceras = resp.headers();
	contentType = cabeceras.get("Content-Type");
	code = resp.code();
	message = resp.message();
	isSuccesful = resp.isSuccessful();
	
	System.out.println(almacen.toString());

    

		
	}
	
	
}
