package com.rookie.design_patterns.abstract_factory;

/**
 * 继承抽象工厂类，定义地点的简单工厂类
 * @author Masker
 */
public class PlaceFactory extends AbstractFactory{
    @Override
    public Animal getAnimal(String specie) {
        return null;
    }

    @Override
    public Place getPlace(String place) {
        if(place==null||place.equals("")){
            return  null;
        }

        if(place.equalsIgnoreCase("farm")){
            return new Farm();
        }else if(place.equalsIgnoreCase("wilderness")){
            return new Wilderness();
        }

        return null;
    }
}
