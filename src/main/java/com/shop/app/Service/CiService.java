package com.shop.app.Service;

import com.shop.app.Entity.ci;

import java.util.List;

public interface CiService {
    public String createCi(ci ci);
    public String updateCi(ci ci);
    public String deleteCi(int ci_id);
    public ci getCi(int ci_id);
    public List<ci> getAllCi();
}
