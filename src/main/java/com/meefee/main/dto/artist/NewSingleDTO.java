package com.meefee.main.dto.artist;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class NewSingleDTO {

    @NotNull
    @NotEmpty(message = "Invalid title. Title is empty.")
    @Pattern(regexp = "^[a-zA-Z0-9-&]{4,50}$",
            message = "Title must contains [4;50] characters and allows only latin alphabet, numbers and -&")
    private String title;

    @NotEmpty(message = "Invalid title. Title is empty.")
    @Pattern(regexp = "^[a-zA-Z0-9-?—,]{50,2000}$",
            message = "Lyrics must contains [50;2000] characters and allows only latin alphabet, numbers and -?—,")
    private String lyrics;

}
