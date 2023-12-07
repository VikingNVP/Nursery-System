package SYSTEM;

import SYSTEM.Controller.PetsController;
import SYSTEM.UsersInterface.ConsoleMenu;
import SYSTEM.ObjectsPets.*;
import SYSTEM.Servises.*;


public class Programm {
    public static void main(String[] args) throws Exception {

        AnimalsRepository <Pet> myFarm = new PRepository();
        PetsController controller = new PetsController(myFarm);
        new ConsoleMenu (controller).start();
    }

}
