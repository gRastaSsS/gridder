package com.example.grid.data.payload;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SearchByPhraseRequest extends DefaultPageRequest {
    private String phrase;
}
