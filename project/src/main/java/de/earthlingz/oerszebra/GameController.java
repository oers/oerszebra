package de.earthlingz.oerszebra;

import com.shurik.droidzebra.CandidateMove;

import de.earthlingz.oerszebra.parser.GameParser;

/**
 * Created by stefan on 18.03.2018.
 */

public interface GameController {
    GameParser getParser();

    void setUpBoard(String s);

}
