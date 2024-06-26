package com.bits.wilp.fsa.langLearnModel.repositories;

import com.bits.wilp.fsa.langLearnModel.models.Alphabet;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlphabetRepo extends CrudRepository<Alphabet, Long> {
    List<Alphabet> findAlphabetByLanguage(String language);
}
