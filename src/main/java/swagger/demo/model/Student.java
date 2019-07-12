package swagger.demo.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Student {
    @ApiModelProperty(notes = "Name of the Student",
            name = "name",
            required = true,
            value = "test name")
    private String name;
    private String cls;
    private String country;
}
