package uek.dev.morfer.result.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uek.dev.morfer.result.models.CSVMorferResult;

import java.util.ArrayList;

@Service("csvMorferService")
@Transactional
public class CSVMorferService implements CSVService {


    @Override
    public String getCSVData(ArrayList<String> morferResult) {
        StringBuilder CSVBuilder = new StringBuilder();
        CSVBuilder.append(CSVMorferResult.getHeader());
        CSVBuilder.append("\n");
        morferResult.stream()
                .map(val -> new CSVMorferResult(val.split(" ")))
                .forEach(csvRow -> {
                    CSVBuilder.append(csvRow.toString());
                    CSVBuilder.append("\n");
                });
        return CSVBuilder.toString();
    }


}
