package principal;

import java.util.List;

import dal.AlmacenCallback;
import dal.AlmacenCallbackArray;
import model.Almacen;
import model.AlmacenInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main {

	public static void main(String[] args) {
		final String SERVER_URL = "http://ejemplorestdani.com:8080";
		Retrofit retrofit;
		AlmacenCallbackArray almacenCallback = new AlmacenCallbackArray();
		
		retrofit = new Retrofit.Builder()
							   .baseUrl(SERVER_URL)
							   .addConverterFactory(GsonConverterFactory.create())
							   .build();
		
		AlmacenInterface almacenInter = (AlmacenInterface) retrofit.create(AlmacenInterface.class);
		
		
		System.out.println("Obtenemos los almacenes");
        Call<List<Almacen>> call = almacenInter.getAlmacen();
        call.enqueue(almacenCallback);
        
        
        
		
		
		
	}

}
