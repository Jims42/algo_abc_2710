import java.util.LinkedList;
import java.util.List;

import libVoiture.Voiture;
import libVoiture.VoitureCourse;

public class App {
    public static void main(String[] args) throws Exception {
        Voiture maVoiture = new Voiture("renault", "twingo", 1200, "nissan", 450);
        int vitesseMax = maVoiture.vitesseMax();

        System.out.println(maVoiture + "\nVitesse max ==> " + vitesseMax);

        try {
            System.out.println(
                    "================================ VOITURE COURSE ============================================");
            VoitureCourse maVoitureCourse = new VoitureCourse("renault", "Alpine", 1100, "renault", 450);
            int vitesseMacCourse = maVoitureCourse.vitesseMax();
            System.out.println(maVoitureCourse);
            List<Voiture> garageList = new LinkedList<>();
            garageList.add(maVoiture);
            garageList.add(maVoitureCourse);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
