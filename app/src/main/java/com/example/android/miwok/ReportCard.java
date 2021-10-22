package com.example.android.miwok;

public class ReportCard {
    private String name;
    private int englishGrade;
    private int mathGrade;
    private int chemistryGrade;

    public ReportCard(String name, int englishGrade, int mathGrade, int chemistryGrade) {
        this.name = name;
        this.chemistryGrade = chemistryGrade;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
    }

    public int getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(int grade) {
        chemistryGrade = grade;
    }

    public String getName() { return name; }

    public void printReport() {
        String OutputString = "Student Name:";
        OutputString += this.name;
        OutputString += "/nChemistry Grade:";
        OutputString += Integer.toString(this.chemistryGrade);
        System.out.print(OutputString);
    }
}
