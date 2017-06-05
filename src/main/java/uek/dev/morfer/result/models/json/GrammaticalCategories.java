package uek.dev.morfer.result.models.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import uek.dev.morfer.result.models.json.rules.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Consumer;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GrammaticalCategories implements GrammaticalCategoryInterprereter {
    private ArrayList<String> grammaticalAccent;
    private ArrayList<String> grammaticalAccomodative;
    private ArrayList<String> grammaticalAglutynacyjnosc;
    private ArrayList<String> grammaticalAspect;
    private ArrayList<String> grammaticalCase;
    private ArrayList<String> grammaticalGender;
    private ArrayList<String> grammaticalGrade;
    private ArrayList<String> grammaticalNeedDot;
    private ArrayList<String> grammaticalNegate;
    private ArrayList<String> grammaticalNumber;
    private ArrayList<String> grammaticalPerson;
    private ArrayList<String> grammaticalPluralTantum;
    private ArrayList<String> grammaticalPostPrepositionality;
    private ArrayList<String> grammaticalWokalicznosc;

    private final static String UNDEFINED = "undefined";

    public void interpretRules(GrammaticalCategory grammaticalCategory, String value) {
        String[] values = value.split("\\.");
        GrammaticalCategoryRule rule;
        ArrayList<String> result = new ArrayList<>();
        Consumer<ArrayList<String>> setter;
        switch (grammaticalCategory) {
            case NUMBER:
                rule = new GrammaticalNumberRules();
                setter = this::setGrammaticalNumber;
                break;
            case CASE:
                rule = new GrammaticalCaseRules();
                setter = this::setGrammaticalCase;
                break;
            case GENDER:
                rule = new GrammaticalGenderRules();
                setter = this::setGrammaticalGender;
                break;
            case PERSON:
                rule = new GrammaticalPersonRules();
                setter = this::setGrammaticalPerson;
                break;
            case GRADE:
                rule = new GrammaticalGradeRules();
                setter = this::setGrammaticalGrade;
                break;
            case ASPECT:
                rule = new GrammaticalAspectRules();
                setter = this::setGrammaticalAspect;
                break;
            case NEGATE:
                rule = new GrammaticalNegateRules();
                setter = this::setGrammaticalNegate;
                break;
            case ACCOMMODATIVE:
                rule = new GrammaticalAccommodativeRules();
                setter = this::setGrammaticalAccomodative;
                break;
            case ACCENT:
                rule = new GrammaticalAccentRules();
                setter = this::setGrammaticalAccent;
                break;
            case POST_PREPOSITIONALITY:
                rule = new GrammaticalPostPrepositionalityRules();
                setter = this::setGrammaticalPostPrepositionality;
                break;
            case AGLUTYNACYJNOSC:
                rule = new GrammaticalAglutynacyjnoscRules();
                setter = this::setGrammaticalAglutynacyjnosc;
                break;
            case WOKALICZNOSC:
                rule = new GrammaticalWokalicznoscRules();
                setter = this::setGrammaticalWokalicznosc;
                break;
            case NEED_DOT:
                rule = new GrammaticalNeedDotRules();
                setter = this::setGrammaticalNeedDot;
                break;
            case PLURAL_TANTUM:
                rule = new GrammaticalPluralTantumRules();
                setter = this::setGrammaticalPluralTantum;
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

    public ArrayList<String> getGrammaticalAccent() {
        return grammaticalAccent;
    }

    private void setGrammaticalAccent(ArrayList<String> grammaticalAccent) {
        this.grammaticalAccent = grammaticalAccent;
    }

    public ArrayList<String> getGrammaticalAccomodative() {
        return grammaticalAccomodative;
    }

    private void setGrammaticalAccomodative(ArrayList<String> grammaticalAccomodative) {
        this.grammaticalAccomodative = grammaticalAccomodative;
    }

    public ArrayList<String> getGrammaticalAglutynacyjnosc() {
        return grammaticalAglutynacyjnosc;
    }

    private void setGrammaticalAglutynacyjnosc(ArrayList<String> grammaticalAglutynacyjnosc) {
        this.grammaticalAglutynacyjnosc = grammaticalAglutynacyjnosc;
    }

    public ArrayList<String> getGrammaticalAspect() {
        return grammaticalAspect;
    }

    void setGrammaticalAspect(ArrayList<String> grammaticalAspect) {
        this.grammaticalAspect = grammaticalAspect;
    }

    public ArrayList<String> getGrammaticalCase() {
        return grammaticalCase;
    }

    void setGrammaticalCase(ArrayList<String> grammaticalCase) {
        this.grammaticalCase = grammaticalCase;
    }

    public ArrayList<String> getGrammaticalGender() {
        return grammaticalGender;
    }

    void setGrammaticalGender(ArrayList<String> grammaticalGender) {
        this.grammaticalGender = grammaticalGender;
    }

    public ArrayList<String> getGrammaticalGrade() {
        return grammaticalGrade;
    }

    private void setGrammaticalGrade(ArrayList<String> grammaticalGrade) {
        this.grammaticalGrade = grammaticalGrade;
    }

    public ArrayList<String> getGrammaticalNeedDot() {
        return grammaticalNeedDot;
    }

    private void setGrammaticalNeedDot(ArrayList<String> grammaticalNeedDot) {
        this.grammaticalNeedDot = grammaticalNeedDot;
    }

    public ArrayList<String> getGrammaticalNegate() {
        return grammaticalNegate;
    }

    private void setGrammaticalNegate(ArrayList<String> grammaticalNegate) {
        this.grammaticalNegate = grammaticalNegate;
    }

    public ArrayList<String> getGrammaticalNumber() {
        return grammaticalNumber;
    }

    public void setGrammaticalNumber(ArrayList<String> grammaticalNumber) {
        this.grammaticalNumber = grammaticalNumber;
    }

    public ArrayList<String> getGrammaticalPerson() {
        return grammaticalPerson;
    }

    private void setGrammaticalPerson(ArrayList<String> grammaticalPerson) {
        this.grammaticalPerson = grammaticalPerson;
    }

    public ArrayList<String> getGrammaticalPluralTantum() {
        return grammaticalPluralTantum;
    }

    private void setGrammaticalPluralTantum(ArrayList<String> grammaticalPluralTantum) {
        this.grammaticalPluralTantum = grammaticalPluralTantum;
    }

    public ArrayList<String> getGrammaticalPostPrepositionality() {
        return grammaticalPostPrepositionality;
    }

    private void setGrammaticalPostPrepositionality(ArrayList<String> grammaticalPostPrepositionality) {
        this.grammaticalPostPrepositionality = grammaticalPostPrepositionality;
    }

    public ArrayList<String> getGrammaticalWokalicznosc() {
        return grammaticalWokalicznosc;
    }

    private void setGrammaticalWokalicznosc(ArrayList<String> grammaticalWokalicznosc) {
        this.grammaticalWokalicznosc = grammaticalWokalicznosc;
    }
}
