package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {

        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.string.url1),
            Affirmation(R.string.affirmation2, R.string.url2),
            Affirmation(R.string.affirmation3, R.string.url3),
            Affirmation(R.string.affirmation4, R.string.url4),
            Affirmation(R.string.affirmation5, R.string.url5),
            Affirmation(R.string.affirmation6, R.string.url6),
            Affirmation(R.string.affirmation7, R.string.url7),
            Affirmation(R.string.affirmation8, R.string.url8),
            Affirmation(R.string.affirmation9, R.string.url9),
            Affirmation(R.string.affirmation10, R.string.url10)
        )
    }

}