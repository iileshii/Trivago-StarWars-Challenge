package jedi.mobi.challenge.trivagostarwars.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import jedi.mobi.challenge.trivagostarwars.domain.Planet
import jedi.mobi.challenge.trivagostarwars.domain.StarWarsCharacter

internal class CharacterRepository private constructor() : ICharacterRepository {

    companion object {
        val instance: ICharacterRepository by lazy { CharacterRepository() }
    }

    override fun loadItem(id: Long): LiveData<StarWarsCharacter> {
        //todo remove stub
        return MutableLiveData<StarWarsCharacter>().apply {
            value = if (id % 2 == 0L) {
                StarWarsCharacter("TestName", "brth year test", 1f, 1f, 1f, emptyList(), Planet(100L), emptyList())
            } else {
                StarWarsCharacter("SecondCharacter", "1100BBR", 1f, 1f, 1f, emptyList(), Planet(100L), emptyList())
            }
        }
    }
}