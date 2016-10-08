package uek.dev.morpheus;

import uek.dev.result.Result;

public interface MorferService {
    Result findById(Long id);
    void saveResult(Result result);
    void deleteResultById(Long id);
}
