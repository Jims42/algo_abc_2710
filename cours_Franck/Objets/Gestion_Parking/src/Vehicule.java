 public class Vehicule {
private String plaqueImmatriculation;
private String marque;

public Vehicule(String _palqueImmatriculation, String _marque){
    this.plaqueImmatriculation=_palqueImmatriculation;
    this.marque=_marque;
}

public String getPlaque(){
    return plaqueImmatriculation;
}
public String getMarque(){
    return marque;
}
public void setPlaque(String _newVal){
this.plaqueImmatriculation=_newVal;
}
public void setMarque(String _newVal){
    this.marque=_newVal;
}

 }