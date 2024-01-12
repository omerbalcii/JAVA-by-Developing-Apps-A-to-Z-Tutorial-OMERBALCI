package com.bilgeadam.springbootBTS.repository;

import com.bilgeadam.springbootBTS.model.Kullanicilar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class KullanicilarRepository {

    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public List<Kullanicilar> getAll() {
        String sql = "SELECT * FROM \"kullanicilar\"";
        return jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Kullanicilar.class));
    }

    public Kullanicilar getById(long kullaniciId) {
        String sql = "SELECT * FROM \"kullanicilar\" WHERE \"kullanici_id\" = :kullaniciId";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("kullaniciId", kullaniciId);
        return namedParameterJdbcTemplate.queryForObject(sql, paramMap, BeanPropertyRowMapper.newInstance(Kullanicilar.class));
    }

    public boolean save(Kullanicilar kullanici) {
        String sql = "INSERT INTO \"kullanicilar\" (\"kullanici_adi\", \"email\", \"sifre\", \"rol\") " +
                "VALUES (:kullaniciAdi, :email, :sifre, :rol)";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("kullaniciAdi", kullanici.getKullaniciAdi());
        paramMap.put("email", kullanici.getEmail());
        paramMap.put("sifre", kullanici.getSifre());
        paramMap.put("rol", kullanici.getRol());
        return namedParameterJdbcTemplate.update(sql, paramMap) == 1;
    }

    public boolean deleteById(long kullaniciId) {
        String sql = "DELETE FROM \"kullanicilar\" WHERE \"kullanici_id\" = :kullaniciId";
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("kullaniciId", kullaniciId);
        return namedParameterJdbcTemplate.update(sql, paramMap) == 1;
    }
}
