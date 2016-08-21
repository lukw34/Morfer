package com.example.morpheus;

import com.example.Result.Result;

public interface MorferService {
    Result findById(Long id);
    void saveResult(Result result);
    void deleteResultById(Long id);
}
