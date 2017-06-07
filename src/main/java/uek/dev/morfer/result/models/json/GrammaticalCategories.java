package uek.dev.morfer.result.models.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import uek.dev.morfer.result.models.json.rules.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Consumer;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GrammaticalCategories implements GrammaticalCategoryInterprereter {
    private ArrayList<String> accent;
    private ArrayList<String> accomodative;
    private ArrayList<String> aglutynacyjnosc;
    private ArrayList<String> aspect;
    private ArrayList<String> grammaticalCase;
    private ArrayList<String> gender;
    private ArrayList<String> grade;
    private ArrayList<String> needDot;
    private ArrayList<String> negate;
    private ArrayList<String> number;
    private ArrayList<String> person;
    private ArrayList<String> pluralTantum;
    private ArrayList<String> postPrepositionality;
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
                setter = this::setNumber;
                break;
            case CASE:
                rule = new GrammaticalCaseRules();
                setter = this::setCase;
                break;
            case GENDER:
                rule = new GrammaticalGenderRules();
                setter = this::setGender;
                break;
            case PERSON:
                rule = new GrammaticalPersonRules();
                setter = this::setPerson;
                break;
            case GRADE:
                rule = new GrammaticalGradeRules();
                setter = this::setGrade;
                break;
            case ASPECT:
                rule = new GrammaticalAspectRules();
                setter = this::setAspect;
                break;
            case NEGATE:
                rule = new GrammaticalNegateRules();
                setter = this::setNegate;
                break;
            case ACCOMMODATIVE:
                rule = new GrammaticalAccommodativeRules();
                setter = this::setAccomodative;
                break;
            case ACCENT:
                rule = new GrammaticalAccentRules();
                setter = this::setAccent;
                break;
            case POST_PREPOSITIONALITY:
                rule = new GrammaticalPostPrepositionalityRules();
                setter = this::setPostPrepositionality;
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
                setter = this::setNeedDot;
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

    public ArrayList<String> getAccent() {
        return accent;
    }

    private void setAccent(ArrayList<String> accent) {
        this.accent = accent;
    }

    public ArrayList<String> getAccomodative() {
        return accomodative;
    }

    private void setAccomodative(ArrayList<String> accomodative) {
        this.accomodative = accomodative;
    }

    public ArrayList<String> getAglutynacyjnosc() {
        return aglutynacyjnosc;
    }

    private void setAglutynacyjnosc(ArrayList<String> aglutynacyjnosc) {
        this.aglutynacyjnosc = aglutynacyjnosc;
    }

    public ArrayList<String> getAspect() {
        return aspect;
    }

    void setAspect(ArrayList<String> aspect) {
        this.aspect = aspect;
    }

    public ArrayList<String> getCase() {
        return grammaticalCase;
    }

    void setCase(ArrayList<String> grammaticalCase) {
        this.grammaticalCase = grammaticalCase;
    }

    public ArrayList<String> getGender() {
        return gender;
    }

    void setGender(ArrayList<String> gender) {
        this.gender = gender;
    }

    public ArrayList<String> getGrade() {
        return grade;
    }

    private void setGrade(ArrayList<String> grade) {
        this.grade = grade;
    }

    public ArrayList<String> getNeedDot() {
        return needDot;
    }

    private void setNeedDot(ArrayList<String> needDot) {
        this.needDot = needDot;
    }

    public ArrayList<String> getNegate() {
        return negate;
    }

    private void setNegate(ArrayList<String> negate) {
        this.negate = negate;
    }

    public ArrayList<String> getNumber() {
        return number;
    }

    public void setNumber(ArrayList<String> number) {
        this.number = number;
    }

    public ArrayList<String> getPerson() {
        return person;
    }

    private void setPerson(ArrayList<String> person) {
        this.person = person;
    }

    public ArrayList<String> getPluralTantum() {
        return pluralTantum;
    }

    private void setPluralTantum(ArrayList<String> pluralTantum) {
        this.pluralTantum = pluralTantum;
    }

    public ArrayList<String> getPostPrepositionality() {
        return postPrepositionality;
    }

    private void setPostPrepositionality(ArrayList<String> postPrepositionality) {
        this.postPrepositionality = postPrepositionality;
    }

    public ArrayList<String> getWokalicznosc() {
        return wokalicznosc;
    }

    private void setWokalicznosc(ArrayList<String> wokalicznosc) {
        this.wokalicznosc = wokalicznosc;
    }
}
