package site.heehee.property.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class Customer {

    @Id
    private Long id;
    private final String firstName;
    private final String lastName;

}
