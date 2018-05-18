package dao.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "route_info", schema = "express")
public class RouteInfo {
    private String expressNo;
    private String info;
    private Timestamp time;

    @Id
    @Column(name = "express_no", nullable = false, length = 10)
    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo;
    }

    @Basic
    @Column(name = "info", nullable = false, length = -1)
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Basic
    @Column(name = "time", nullable = false)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RouteInfo routeInfo = (RouteInfo) o;
        return Objects.equals(expressNo, routeInfo.expressNo) &&
                Objects.equals(info, routeInfo.info) &&
                Objects.equals(time, routeInfo.time);
    }

    @Override
    public int hashCode() {

        return Objects.hash(expressNo, info, time);
    }
}
