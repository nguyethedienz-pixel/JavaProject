/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.*;
import dto.ShapeDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class ShapeRepository {
    
    private final List<Shape> shapes = new ArrayList<>();
    
    public void addShapes(ShapeDTO dto){
        shapes.clear();
        
        shapes.add(new Rectangle(dto.getWidth() , dto.getLength()));
        shapes.add(new Circle(dto.getRadius()));
        shapes.add(new Triangle(dto.getA() , dto.getB() , dto.getC()));
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Shape shape : shapes){
            sb.append(sb.toString()).append("\n");
        }
        return sb.toString();
    }
}
