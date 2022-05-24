package fp.aereopuerto;

import java.util.stream.Collectors;

public class EstadisticasVuelos {
	
	public void agregarVuelo(Vuelo v) {
		vuelos.add(v);
	}
	
	
	public Map <String,Set<LocalDate>> getFechasPorDestino(){
		return vuelos.stream()
		.collect(Collectors.groupingby(Vuelo::getDestino,
				Collectors.mapping(v->v.getFechaSalida().toLocalDate(),
						Collectors.toSet())));
	}
	
	public String getDestinoConMasVuelos(){
		
	}

}
