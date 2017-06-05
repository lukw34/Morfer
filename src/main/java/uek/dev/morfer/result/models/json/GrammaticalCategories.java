package uek.dev.morfer.result.models.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import uek.dev.morfer.result.models.json.rules.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Consumer;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GrammaticalCategories implements GrammaticalCategoryInterprereter {
    private ArrayList<String> akcent;
    private ArrayList<String> akomodacyjnosc;
    private ArrayList<String> aglutynacyjnosc;
    private ArrayList<String> aspekt;
    private ArrayList<String> przypadek;
    private ArrayList<String> rodzaj;
    private ArrayList<String> stopien;
    private ArrayList<String> wymaganieKropki;
    private ArrayList<String> negacja;
    private ArrayList<String> liczba;
    private ArrayList<String> osoba;
    private ArrayList<String> pluralTantum;
    private ArrayList<String> poprzyimkowosc;
    private ArrayList<String> wokalicznosc;

    private final static String UNDEFINED = "undefined";

    public void interpretRules(GrammaticalCategory grammaticalCategory, String value) {
        String[] values = value.split("\\.");
        GrammaticalCategoryRule rule;
        ArrayList<String> result = new ArrayList<>();
        Consumer<ArrayList<String>> setter;
        switch (grammaticalCategory) {
            case NUMBER:
                rule = new GrammaticalNumberRules();
                setter = this::setLiczba;
                break;
            case CASE:
                rule = new GrammaticalCaseRules();
                setter = this::setPrzypadek;
                break;
            case GENDER:
                rule = new GrammaticalGenderRules();
                setter = this::setRodzaj;
                break;
            case PERSON:
                rule = new GrammaticalPersonRules();
                setter = this::setOsoba;
                break;
            case GRADE:
                rule = new GrammaticalGradeRules();
                setter = this::setStopien;
                break;
            case ASPECT:
                rule = new GrammaticalAspectRules();
                setter = this::setAspekt;
                break;
            case NEGATE:
                rule = new GrammaticalNegateRules();
                setter = this::setNegacja;
                break;
            case ACCOMMODATIVE:
                rule = new GrammaticalAccommodativeRules();
                setter = this::setAkomodacyjnosc;
                break;
            case ACCENT:
                rule = new GrammaticalAccentRules();
                setter = this::setAkcent;
                break;
            case POST_PREPOSITIONALITY:
                rule = new GrammaticalPostPrepositionalityRules();
                setter = this::setPoprzyimkowosc;
                break;
            case AGLUTYNACYJNOSC:
                rule = new GrammaticalAglutynacyjnoscRules();
                setter = this::setAglutynacyjnosc;
                break;
            case WOKALICZNOSC:
                rule = new GrammaticalWokalicznoscRules();
                setter = this::setWokalicznosc;
                break;
            case NEED_DOT:
                rule = new GrammaticalNeedDotRules();
                setter = this::setWymaganieKropki;
                break;
            case PLURAL_TANTUM:
                rule = new GrammaticalPluralTantumRules();
                setter = this::setPluralTantum;
                break;
            default:
                return;
        }

        Map<String, String> ruleMap = rule.getRuleMap();
        for (String v : values) {
            if (ruleMap.containsKey(v)) {
                result.add(ruleMap.get(v));
            } else {
                result.add(UNDEFINED);
            }
        }

        setter.accept(result);
    }

    public ArrayList<String> getAkcent() {
        return akcent;
    }

    private void setAkcent(ArrayList<String> akcent) {
        this.akcent = akcent;
    }

    public ArrayList<String> getAkomodacyjnosc() {
        return akomodacyjnosc;
    }

    private void setAkomodacyjnosc(ArrayList<String> akomodacyjnosc) {
        this.akomodacyjnosc = akomodacyjnosc;
    }

    public ArrayList<String> getAglutynacyjnosc() {
        return aglutynacyjnosc;
    }

    private void setAglutynacyjnosc(ArrayList<String> aglutynacyjnosc) {
        this.aglutynacyjnosc = aglutynacyjnosc;
    }

    public ArrayList<String> getAspekt() {
        return aspekt;
    }

    void setAspekt(ArrayList<String> aspekt) {
        this.aspekt = aspekt;
    }

    public ArrayList<String> getPrzypadek() {
        return przypadek;
    }

    void setPrzypadek(ArrayList<String> przypadek) {
        this.przypadek = przypadek;
    }

    public ArrayList<String> getRodzaj() {
        return rodzaj;
    }

    void setRodzaj(ArrayList<String> rodzaj) {
        this.rodzaj = rodzaj;
    }

    public ArrayList<String> getStopien() {
        return stopien;
    }

    private void setStopien(ArrayList<String> stopien) {
        this.stopien = stopien;
    }

    public ArrayList<String> getWymaganieKropki() {
        return wymaganieKropki;
    }

    private void setWymaganieKropki(ArrayList<String> wymaganieKropki) {
        this.wymaganieKropki = wymaganieKropki;
    }

    public ArrayList<String> getNegacja() {
        return negacja;
    }

    private void setNegacja(ArrayList<String> negacja) {
        this.negacja = negacja;
    }

    public ArrayList<String> getLiczba() {
        return liczba;
    }

    public void setLiczba(ArrayList<String> liczba) {
        this.liczba = liczba;
    }

    public ArrayList<String> getOsoba() {
        return osoba;
    }

    private void setOsoba(ArrayList<String> osoba) {
        this.osoba = osoba;
    }

    public ArrayList<String> getPluralTantum() {
        return pluralTantum;
    }

    private void setPluralTantum(ArrayList<String> pluralTantum) {
        this.pluralTantum = pluralTantum;
    }

    public ArrayList<String> getPoprzyimkowosc() {
        return poprzyimkowosc;
    }

    private void setPoprzyimkowosc(ArrayList<String> poprzyimkowosc) {
        this.poprzyimkowosc = poprzyimkowosc;
    }

    public ArrayList<String> getWokalicznosc() {
        return wokalicznosc;
    }

    private void setWokalicznosc(ArrayList<String> wokalicznosc) {
        this.wokalicznosc = wokalicznosc;
    }
}
