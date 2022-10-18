package com.kodilla.testing.weather.stub;

import java.util.*;


public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemp(){
        double sumTemp = 0;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){
            sumTemp += temperature.getValue();
        }

        return sumTemp/temperatures.getTemperatures().size();
    }

    public double medianTemp(){
        List<Double> temp = new ArrayList<>();
        double result;

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()){
            temp.add(temperature.getValue());
        }

        Collections.sort(temp);

        if(temp.size() %2 == 0){
            result = (temp.get(temp.size()/2-1) + temp.get(temp.size()/2))/2;
            return result;
        }else{
            result = temp.get(temp.size()/2);
            return result;
        }

    }
}
