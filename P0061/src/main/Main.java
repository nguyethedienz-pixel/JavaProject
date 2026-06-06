package main;

import dto.ShapeDTO;
import constants.Message;
import controller.ShapeController;
import java.util.Scanner;
import utils.Validation;

/**
 *
 * @author Dell
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap du lieu Shape va luu vao dto
        ShapeDTO dto = new ShapeDTO();
        dto.setWidth(inputNumber(sc, Message.MSG_CALCULATOR_RECTANGLE_WIDTH));
        dto.setLength(inputNumber(sc, Message.MSG_CALCULATOR_RECTANGLE_LENGTH));
        dto.setRadius(inputNumber(sc, Message.MSG_CALCULATOR_CIRCLE_RADIUS));
        double a = inputNumber(sc, Message.MSG_CALCULATOR_Triangle_SideA);
        double b = inputNumber(sc, Message.MSG_CALCULATOR_Triangle_SideB);
        double c = inputNumber(sc, Message.MSG_CALCULATOR_Triangle_SideC);

        dto.setA(a);
        dto.setB(b);
        dto.setC(c);

        // Tao controller de xu li du lieu
        ShapeController controller = new ShapeController(dto);
        controller.process();
    }

    private static double inputNumber(Scanner sc, String message) {
        while (true) {
            try {
                System.out.println(message);
                return Validation.getinput(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(Message.MSG_INVALID_INPUT);
            }
        }
    }
}
