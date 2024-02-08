package com.vladimirpandurov.invoice_manager4_02.rowmapper;

import com.vladimirpandurov.invoice_manager4_02.domain.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return User.builder()
                .id(rs.getLong("id"))
                .firstName(rs.getString("first_name"))
                .lastName(rs.getString("last_name"))
                .email(rs.getString("email"))
                .password(rs.getString("password"))
                .bio(rs.getString("bio"))
                .address(rs.getString("address"))
                .imageUrl(rs.getString("image_url"))
                .phone(rs.getString("phone"))
                .title(rs.getString("title"))
                .enabled(rs.getBoolean("enabled"))
                .isUsingMfa(rs.getBoolean("using_mfa"))
                .isNotLocked(rs.getBoolean("non_locked"))
                .createdAt(rs.getTimestamp("created_at").toLocalDateTime()).build();
    }
}
