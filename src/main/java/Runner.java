import db.DBGolfer;
import models.Golfer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer1 = new Golfer("Tiger", "Woods", 40);
        DBGolfer.save(golfer1);

        Golfer golfer2 = new Golfer("Jack", "Nicklaus", 60);
        DBGolfer.save(golfer2);


        List<Golfer> golfers = DBGolfer.getAll();



        System.exit(0);

    }
}