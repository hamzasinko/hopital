package ma.enset.hospital.service;

import ma.enset.hospital.entities.Consultation;
import ma.enset.hospital.entities.Medecin;
import ma.enset.hospital.entities.Patient;
import ma.enset.hospital.entities.RendezVous;

public interface IHospitalService {
    public Patient savePatient(Patient patient);
    public Medecin saveMedecin(Medecin medecin);
    public RendezVous saveRDV(RendezVous rendezVous);
    public Consultation saveConsultation(Consultation consultation);
}
