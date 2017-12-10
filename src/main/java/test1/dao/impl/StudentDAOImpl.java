package test1.dao.impl;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import test1.constants.MajorType;
import test1.dao.StudentDAO;
import test1.model.Student;

import javax.annotation.PostConstruct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * created by ewang on 2017/12/10.
 */
@Repository
public class StudentDAOImpl implements StudentDAO, RowMapper<Student> {

    private NamedParameterJdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/test1");
        dataSource.setUsername("root");
        dataSource.setPassword("0530");

        jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Student(rs.getLong("id"),
                rs.getString("name"),
                rs.getInt("age"),
                MajorType.fromValue(rs.getInt("major")),
                new Date(rs.getTimestamp("create_time").getTime()));
    }

    public List<Student> findAll() {
        String sql = "select * from student order by id";
        return jdbcTemplate.query(sql, (MapSqlParameterSource) null, this);
    }
}
