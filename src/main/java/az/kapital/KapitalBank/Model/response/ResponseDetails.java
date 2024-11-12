package az.kapital.KapitalBank.Model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseDetails {
    private String name;
    private String surname;
    private LocalDate birthday;
    private String id;
    private String username;
    private String password;

}
