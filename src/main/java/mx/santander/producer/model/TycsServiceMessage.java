package mx.santander.producer.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class TycsServiceMessage implements Serializable {

    private String buc;
    private String applicationId;
    private String tycVersion;

    @Override
    public String toString() {
        return "TycsServiceMessage [buc=" + buc + ", applicationId=" + applicationId + ", tycVersion=" + tycVersion + "]";
    }
}
