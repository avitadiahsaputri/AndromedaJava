package org.pasim.andromeda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController //anotasi

class PlanetController {

    @GetMapping("/planet")
    Map<String, Object> getPlanet() {
        Map<String, Object> planet = new HashMap<>();
        planet.put("id", 1);
        planet.put("name", "Mercuri");
        planet.put("Diameter", 12345.877);
        return planet;
    }

    //array
    @GetMapping("/planets")
    String[] getPlanets(){
       return  new String[] {"Mercury","Venus","Erath"};

    }

    //array
    @GetMapping("/planet-list")
    List<String> getPlanetsList(){
        List<String> planetList = new ArrayList<>();
        planetList.add("Mercury");
        planetList.add("Venus");
        planetList.add("Earth");
        return planetList;

    }
}
