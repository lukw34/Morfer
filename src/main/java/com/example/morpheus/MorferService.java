package com.example.morpheus;

import com.example.result.Result;

public interface MorferService {
    Result findById(Long id);
    void saveResult(Result result);
    void deleteResultById(Long id);
}
