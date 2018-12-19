package cz.secda1.studentWeb.model;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@MappedSuperclass
public abstract class BaseModel implements Serializable {

    private String uuid = UUID.randomUUID().toString();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseModel baseModel = (BaseModel) o;
        return Objects.equals(uuid, baseModel.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
}
