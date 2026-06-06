/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import constants.Message;
import dto.ShapeDTO;
import view.ShapeView;
import repository.ShapeRepository;
import utils.Validation;

/**
 *
 * @author Dell
 */
public class ShapeController {

    private final ShapeDTO dto;
    private final ShapeView views = new ShapeView();
    private final ShapeRepository repository = new ShapeRepository();

    public ShapeController(ShapeDTO dto) {
        this.dto = dto;
    }

    public void process() {
//        if (!Validation.checkValidShape(dto.getA(), dto.getB(), dto.getC())) {
//            views.setResult("Invalid side of Triangle");
//            views.displayShape();
//            return;
//        }
        if(!Validation.checkValidShape(dto.getA(), dto.getB(), dto.getC())){
            views.setResult(Message.MSG_INVALID_INPUT);
            views.displayShape();
            return;
        }
        repository.addShapes(dto);
        views.setResult(repository.toString());
        views.displayShape();
    }
}
