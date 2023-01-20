/* 
  *   Speech.java generated by speechmod 
 */   

package scxmlgen.Modalities; 

import scxmlgen.interfaces.IModality; 

public enum Speech implements IModality{  

	INIT("[Action][START][Entity][GAME]",1500),
    GO_BACK("[Action][GO_BACK]", 1500),
    SOUND_OFF("[Action][SOUND_MANIPULATION_OFF]", 1500),
    SOUND_ON("[Action][SOUND_MANIPULATION_ON]", 1500),
    ROQUE("[Action][SPECIAL][SpecialMove][ROQUE]", 1500),
    END("[Action][END]", 1500),


    // Selector

    SELECT_KNIGHT_FRONT("[Entity][KNIGHT][PositionInitial][FRONT]",1500),
    SELECT_KNIGHT_BACK("[Entity][KNIGHT][PositionInitial][BACK]",1500),
    SELECT_KNIGHT_LEFT("[Entity][KNIGHT][PositionInitial][LEFT]",1500),
    SELECT_KNIGHT_RIGHT("[Entity][KNIGHT][PositionInitial][RIGHT]",1500),
    SELECT_BISHOP_FRONT("[Entity][BISHOP][PositionInitial][FRONT]",1500),
    SELECT_BISHOP_BACK("[Entity][BISHOP][PositionInitial][BACK]",1500),
    SELECT_BISHOP_LEFT("[Entity][BISHOP][PositionInitial][LEFT]",1500),
    SELECT_BISHOP_RIGHT("[Entity][BISHOP][PositionInitial][RIGHT]",1500),
    SELECT_ROOK_FRONT("[Entity][ROOK][PositionInitial][FRONT]",1500),
    SELECT_ROOK_BACK("[Entity][ROOK][PositionInitial][BACK]",1500),
    SELECT_ROOK_LEFT("[Entity][ROOK][PositionInitial][LEFT]",1500),
    SELECT_ROOK_RIGHT("[Entity][ROOK][PositionInitial][RIGHT]",1500),
    SELECT_i_PAWN_FRONT("[NumberInitial][i][Entity][PAWN][PositionInitial][FRONT]",1500),
    SELECT_1_PAWN_FRONT("[NumberInitial][1][Entity][PAWN][PositionInitial][FRONT]",1500),
    SELECT_2_PAWN_FRONT("[NumberInitial][2][Entity][PAWN][PositionInitial][FRONT]",1500),
    SELECT_3_PAWN_FRONT("[NumberInitial][3][Entity][PAWN][PositionInitial][FRONT]",1500),
    SELECT_4_PAWN_FRONT("[NumberInitial][4][Entity][PAWN][PositionInitial][FRONT]",1500),
    SELECT_i_PAWN_BACK("[NumberInitial][i][Entity][PAWN][PositionInitial][BACK]",1500),
    SELECT_1_PAWN_BACK("[NumberInitial][1][Entity][PAWN][PositionInitial][BACK]",1500),
    SELECT_2_PAWN_BACK("[NumberInitial][2][Entity][PAWN][PositionInitial][BACK]",1500),
    SELECT_3_PAWN_BACK("[NumberInitial][3][Entity][PAWN][PositionInitial][BACK]",1500),
    SELECT_4_PAWN_BACK("[NumberInitial][4][Entity][PAWN][PositionInitial][BACK]",1500),
    SELECT_i_PAWN_LEFT("[NumberInitial][i][Entity][PAWN][PositionInitial][LEFT]",1500),
    SELECT_1_PAWN_LEFT("[NumberInitial][1][Entity][PAWN][PositionInitial][LEFT]",1500),
    SELECT_2_PAWN_LEFT("[NumberInitial][2][Entity][PAWN][PositionInitial][LEFT]",1500),
    SELECT_3_PAWN_LEFT("[NumberInitial][3][Entity][PAWN][PositionInitial][LEFT]",1500),
    SELECT_4_PAWN_LEFT("[NumberInitial][4][Entity][PAWN][PositionInitial][LEFT]",1500),
    SELECT_i_PAWN_RIGHT("[NumberInitial][i][Entity][PAWN][PositionInitial][RIGHT]",1500),
    SELECT_1_PAWN_RIGHT("[NumberInitial][1][Entity][PAWN][PositionInitial][RIGHT]",1500),
    SELECT_2_PAWN_RIGHT("[NumberInitial][2][Entity][PAWN][PositionInitial][RIGHT]",1500),
    SELECT_3_PAWN_RIGHT("[NumberInitial][3][Entity][PAWN][PositionInitial][RIGHT]",1500),
    SELECT_4_PAWN_RIGHT("[NumberInitial][4][Entity][PAWN][PositionInitial][RIGHT]",1500),
    SELECT_QUEEN_FRONT("[Entity][QUEEN][PositionInitial][FRONT]",1500),
    SELECT_QUEEN_BACK("[Entity][QUEEN][PositionInitial][BACK]",1500),
    SELECT_QUEEN_LEFT("[Entity][QUEEN][PositionInitial][LEFT]",1500),
    SELECT_QUEEN_RIGHT("[Entity][QUEEN][PositionInitial][RIGHT]",1500),
    SELECT_KING_FRONT("[Entity][KING][PositionInitial][FRONT]",1500),
    SELECT_KING_BACK("[Entity][KING][PositionInitial][BACK]",1500),
    SELECT_KING_LEFT("[Entity][KING][PositionInitial][LEFT]",1500),
    SELECT_KING_RIGHT("[Entity][KING][PositionInitial][RIGHT]",1500),

    // Movement

    // Independent Movement

    MOVE_KNIGHT_FRONT_FRONT("[Action][MOVE][Entity][KNIGHT][PositionInitial][FRONT][PositionFinal][FRONT]",1500),
    MOVE_KNIGHT_FRONT_BACK("[Action][MOVE][Entity][KNIGHT][PositionInitial][FRONT][PositionFinal][BACK]",1500),
    MOVE_KNIGHT_FRONT_LEFT("[Action][MOVE][Entity][KNIGHT][PositionInitial][FRONT][PositionFinal][LEFT]",1500),
    MOVE_KNIGHT_FRONT_RIGHT("[Action][MOVE][Entity][KNIGHT][PositionInitial][FRONT][PositionFinal][RIGHT]",1500),
    MOVE_KNIGHT_BACK_FRONT("[Action][MOVE][Entity][KNIGHT][PositionInitial][BACK][PositionFinal][FRONT]",1500),
    MOVE_KNIGHT_BACK_BACK("[Action][MOVE][Entity][KNIGHT][PositionInitial][BACK][PositionFinal][BACK]",1500),
    MOVE_KNIGHT_BACK_LEFT("[Action][MOVE][Entity][KNIGHT][PositionInitial][BACK][PositionFinal][LEFT]",1500),
    MOVE_KNIGHT_BACK_RIGHT("[Action][MOVE][Entity][KNIGHT][PositionInitial][BACK][PositionFinal][RIGHT]",1500),
    MOVE_KNIGHT_LEFT_FRONT("[Action][MOVE][Entity][KNIGHT][PositionInitial][LEFT][PositionFinal][FRONT]",1500),
    MOVE_KNIGHT_LEFT_BACK("[Action][MOVE][Entity][KNIGHT][PositionInitial][LEFT][PositionFinal][BACK]",1500),
    MOVE_KNIGHT_LEFT_LEFT("[Action][MOVE][Entity][KNIGHT][PositionInitial][LEFT][PositionFinal][LEFT]",1500),
    MOVE_KNIGHT_LEFT_RIGHT("[Action][MOVE][Entity][KNIGHT][PositionInitial][LEFT][PositionFinal][RIGHT]",1500),
    MOVE_KNIGHT_RIGHT_FRONT("[Action][MOVE][Entity][KNIGHT][PositionInitial][RIGHT][PositionFinal][FRONT]",1500),
    MOVE_KNIGHT_RIGHT_BACK("[Action][MOVE][Entity][KNIGHT][PositionInitial][RIGHT][PositionFinal][BACK]",1500),
    MOVE_KNIGHT_RIGHT_LEFT("[Action][MOVE][Entity][KNIGHT][PositionInitial][RIGHT][PositionFinal][LEFT]",1500),
    MOVE_KNIGHT_RIGHT_RIGHT("[Action][MOVE][Entity][KNIGHT][PositionInitial][RIGHT][PositionFinal][RIGHT]",1500),
    MOVE_BISHOP_FRONT_FRONT("[Action][MOVE][Entity][BISHOP][PositionInitial][FRONT][PositionFinal][FRONT]",1500),
    MOVE_BISHOP_FRONT_BACK("[Action][MOVE][Entity][BISHOP][PositionInitial][FRONT][PositionFinal][BACK]",1500),
    MOVE_BISHOP_FRONT_LEFT("[Action][MOVE][Entity][BISHOP][PositionInitial][FRONT][PositionFinal][LEFT]",1500),
    MOVE_BISHOP_FRONT_RIGHT("[Action][MOVE][Entity][BISHOP][PositionInitial][FRONT][PositionFinal][RIGHT]",1500),
    MOVE_BISHOP_BACK_FRONT("[Action][MOVE][Entity][BISHOP][PositionInitial][BACK][PositionFinal][FRONT]",1500),
    MOVE_BISHOP_BACK_BACK("[Action][MOVE][Entity][BISHOP][PositionInitial][BACK][PositionFinal][BACK]",1500),
    MOVE_BISHOP_BACK_LEFT("[Action][MOVE][Entity][BISHOP][PositionInitial][BACK][PositionFinal][LEFT]",1500),
    MOVE_BISHOP_BACK_RIGHT("[Action][MOVE][Entity][BISHOP][PositionInitial][BACK][PositionFinal][RIGHT]",1500),
    MOVE_BISHOP_LEFT_FRONT("[Action][MOVE][Entity][BISHOP][PositionInitial][LEFT][PositionFinal][FRONT]",1500),
    MOVE_BISHOP_LEFT_BACK("[Action][MOVE][Entity][BISHOP][PositionInitial][LEFT][PositionFinal][BACK]",1500),
    MOVE_BISHOP_LEFT_LEFT("[Action][MOVE][Entity][BISHOP][PositionInitial][LEFT][PositionFinal][LEFT]",1500),
    MOVE_BISHOP_LEFT_RIGHT("[Action][MOVE][Entity][BISHOP][PositionInitial][LEFT][PositionFinal][RIGHT]",1500),
    MOVE_BISHOP_RIGHT_FRONT("[Action][MOVE][Entity][BISHOP][PositionInitial][RIGHT][PositionFinal][FRONT]",1500),
    MOVE_BISHOP_RIGHT_BACK("[Action][MOVE][Entity][BISHOP][PositionInitial][RIGHT][PositionFinal][BACK]",1500),
    MOVE_BISHOP_RIGHT_LEFT("[Action][MOVE][Entity][BISHOP][PositionInitial][RIGHT][PositionFinal][LEFT]",1500),
    MOVE_BISHOP_RIGHT_RIGHT("[Action][MOVE][Entity][BISHOP][PositionInitial][RIGHT][PositionFinal][RIGHT]",1500),
    MOVE_ROOK_FRONT_FRONT("[Action][MOVE][Entity][ROOK][PositionInitial][FRONT][PositionFinal][FRONT]",1500),
    MOVE_ROOK_FRONT_BACK("[Action][MOVE][Entity][ROOK][PositionInitial][FRONT][PositionFinal][BACK]",1500),
    MOVE_ROOK_FRONT_LEFT("[Action][MOVE][Entity][ROOK][PositionInitial][FRONT][PositionFinal][LEFT]",1500),
    MOVE_ROOK_FRONT_RIGHT("[Action][MOVE][Entity][ROOK][PositionInitial][FRONT][PositionFinal][RIGHT]",1500),
    MOVE_ROOK_BACK_FRONT("[Action][MOVE][Entity][ROOK][PositionInitial][BACK][PositionFinal][FRONT]",1500),
    MOVE_ROOK_BACK_BACK("[Action][MOVE][Entity][ROOK][PositionInitial][BACK][PositionFinal][BACK]",1500),
    MOVE_ROOK_BACK_LEFT("[Action][MOVE][Entity][ROOK][PositionInitial][BACK][PositionFinal][LEFT]",1500),
    MOVE_ROOK_BACK_RIGHT("[Action][MOVE][Entity][ROOK][PositionInitial][BACK][PositionFinal][RIGHT]",1500),
    MOVE_ROOK_LEFT_FRONT("[Action][MOVE][Entity][ROOK][PositionInitial][LEFT][PositionFinal][FRONT]",1500),
    MOVE_ROOK_LEFT_BACK("[Action][MOVE][Entity][ROOK][PositionInitial][LEFT][PositionFinal][BACK]",1500),
    MOVE_ROOK_LEFT_LEFT("[Action][MOVE][Entity][ROOK][PositionInitial][LEFT][PositionFinal][LEFT]",1500),
    MOVE_ROOK_LEFT_RIGHT("[Action][MOVE][Entity][ROOK][PositionInitial][LEFT][PositionFinal][RIGHT]",1500),
    MOVE_ROOK_RIGHT_FRONT("[Action][MOVE][Entity][ROOK][PositionInitial][RIGHT][PositionFinal][FRONT]",1500),
    MOVE_ROOK_RIGHT_BACK("[Action][MOVE][Entity][ROOK][PositionInitial][RIGHT][PositionFinal][BACK]",1500),
    MOVE_ROOK_RIGHT_LEFT("[Action][MOVE][Entity][ROOK][PositionInitial][RIGHT][PositionFinal][LEFT]",1500),
    MOVE_ROOK_RIGHT_RIGHT("[Action][MOVE][Entity][ROOK][PositionInitial][RIGHT][PositionFinal][RIGHT]",1500),
    MOVE_i_PAWN_FRONT_FRONT("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][FRONT][PositionFinal][FRONT]",1500),
    MOVE_1_PAWN_FRONT_FRONT("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][FRONT][PositionFinal][FRONT]",1500),
    MOVE_2_PAWN_FRONT_FRONT("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][FRONT][PositionFinal][FRONT]",1500),
    MOVE_3_PAWN_FRONT_FRONT("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][FRONT][PositionFinal][FRONT]",1500),
    MOVE_4_PAWN_FRONT_FRONT("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][FRONT][PositionFinal][FRONT]",1500),
    MOVE_i_PAWN_FRONT_BACK("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][FRONT][PositionFinal][BACK]",1500),
    MOVE_1_PAWN_FRONT_BACK("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][FRONT][PositionFinal][BACK]",1500),
    MOVE_2_PAWN_FRONT_BACK("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][FRONT][PositionFinal][BACK]",1500),
    MOVE_3_PAWN_FRONT_BACK("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][FRONT][PositionFinal][BACK]",1500),
    MOVE_4_PAWN_FRONT_BACK("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][FRONT][PositionFinal][BACK]",1500),
    MOVE_i_PAWN_FRONT_LEFT("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][FRONT][PositionFinal][LEFT]",1500),
    MOVE_1_PAWN_FRONT_LEFT("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][FRONT][PositionFinal][LEFT]",1500),
    MOVE_2_PAWN_FRONT_LEFT("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][FRONT][PositionFinal][LEFT]",1500),
    MOVE_3_PAWN_FRONT_LEFT("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][FRONT][PositionFinal][LEFT]",1500),
    MOVE_4_PAWN_FRONT_LEFT("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][FRONT][PositionFinal][LEFT]",1500),
    MOVE_i_PAWN_FRONT_RIGHT("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][FRONT][PositionFinal][RIGHT]",1500),
    MOVE_1_PAWN_FRONT_RIGHT("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][FRONT][PositionFinal][RIGHT]",1500),
    MOVE_2_PAWN_FRONT_RIGHT("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][FRONT][PositionFinal][RIGHT]",1500),
    MOVE_3_PAWN_FRONT_RIGHT("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][FRONT][PositionFinal][RIGHT]",1500),
    MOVE_4_PAWN_FRONT_RIGHT("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][FRONT][PositionFinal][RIGHT]",1500),
    MOVE_i_PAWN_BACK_FRONT("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][BACK][PositionFinal][FRONT]",1500),
    MOVE_1_PAWN_BACK_FRONT("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][BACK][PositionFinal][FRONT]",1500),
    MOVE_2_PAWN_BACK_FRONT("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][BACK][PositionFinal][FRONT]",1500),
    MOVE_3_PAWN_BACK_FRONT("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][BACK][PositionFinal][FRONT]",1500),
    MOVE_4_PAWN_BACK_FRONT("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][BACK][PositionFinal][FRONT]",1500),
    MOVE_i_PAWN_BACK_BACK("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][BACK][PositionFinal][BACK]",1500),
    MOVE_1_PAWN_BACK_BACK("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][BACK][PositionFinal][BACK]",1500),
    MOVE_2_PAWN_BACK_BACK("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][BACK][PositionFinal][BACK]",1500),
    MOVE_3_PAWN_BACK_BACK("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][BACK][PositionFinal][BACK]",1500),
    MOVE_4_PAWN_BACK_BACK("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][BACK][PositionFinal][BACK]",1500),
    MOVE_i_PAWN_BACK_LEFT("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][BACK][PositionFinal][LEFT]",1500),
    MOVE_1_PAWN_BACK_LEFT("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][BACK][PositionFinal][LEFT]",1500),
    MOVE_2_PAWN_BACK_LEFT("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][BACK][PositionFinal][LEFT]",1500),
    MOVE_3_PAWN_BACK_LEFT("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][BACK][PositionFinal][LEFT]",1500),
    MOVE_4_PAWN_BACK_LEFT("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][BACK][PositionFinal][LEFT]",1500),
    MOVE_i_PAWN_BACK_RIGHT("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][BACK][PositionFinal][RIGHT]",1500),
    MOVE_1_PAWN_BACK_RIGHT("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][BACK][PositionFinal][RIGHT]",1500),
    MOVE_2_PAWN_BACK_RIGHT("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][BACK][PositionFinal][RIGHT]",1500),
    MOVE_3_PAWN_BACK_RIGHT("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][BACK][PositionFinal][RIGHT]",1500),
    MOVE_4_PAWN_BACK_RIGHT("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][BACK][PositionFinal][RIGHT]",1500),
    MOVE_i_PAWN_LEFT_FRONT("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][LEFT][PositionFinal][FRONT]",1500),
    MOVE_1_PAWN_LEFT_FRONT("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][LEFT][PositionFinal][FRONT]",1500),
    MOVE_2_PAWN_LEFT_FRONT("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][LEFT][PositionFinal][FRONT]",1500),
    MOVE_3_PAWN_LEFT_FRONT("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][LEFT][PositionFinal][FRONT]",1500),
    MOVE_4_PAWN_LEFT_FRONT("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][LEFT][PositionFinal][FRONT]",1500),
    MOVE_i_PAWN_LEFT_BACK("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][LEFT][PositionFinal][BACK]",1500),
    MOVE_1_PAWN_LEFT_BACK("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][LEFT][PositionFinal][BACK]",1500),
    MOVE_2_PAWN_LEFT_BACK("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][LEFT][PositionFinal][BACK]",1500),
    MOVE_3_PAWN_LEFT_BACK("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][LEFT][PositionFinal][BACK]",1500),
    MOVE_4_PAWN_LEFT_BACK("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][LEFT][PositionFinal][BACK]",1500),
    MOVE_i_PAWN_LEFT_LEFT("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][LEFT][PositionFinal][LEFT]",1500),
    MOVE_1_PAWN_LEFT_LEFT("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][LEFT][PositionFinal][LEFT]",1500),
    MOVE_2_PAWN_LEFT_LEFT("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][LEFT][PositionFinal][LEFT]",1500),
    MOVE_3_PAWN_LEFT_LEFT("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][LEFT][PositionFinal][LEFT]",1500),
    MOVE_4_PAWN_LEFT_LEFT("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][LEFT][PositionFinal][LEFT]",1500),
    MOVE_i_PAWN_LEFT_RIGHT("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][LEFT][PositionFinal][RIGHT]",1500),
    MOVE_1_PAWN_LEFT_RIGHT("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][LEFT][PositionFinal][RIGHT]",1500),
    MOVE_2_PAWN_LEFT_RIGHT("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][LEFT][PositionFinal][RIGHT]",1500),
    MOVE_3_PAWN_LEFT_RIGHT("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][LEFT][PositionFinal][RIGHT]",1500),
    MOVE_4_PAWN_LEFT_RIGHT("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][LEFT][PositionFinal][RIGHT]",1500),
    MOVE_i_PAWN_RIGHT_FRONT("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][FRONT]",1500),
    MOVE_1_PAWN_RIGHT_FRONT("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][FRONT]",1500),
    MOVE_2_PAWN_RIGHT_FRONT("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][FRONT]",1500),
    MOVE_3_PAWN_RIGHT_FRONT("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][FRONT]",1500),
    MOVE_4_PAWN_RIGHT_FRONT("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][FRONT]",1500),
    MOVE_i_PAWN_RIGHT_BACK("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][BACK]",1500),
    MOVE_1_PAWN_RIGHT_BACK("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][BACK]",1500),
    MOVE_2_PAWN_RIGHT_BACK("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][BACK]",1500),
    MOVE_3_PAWN_RIGHT_BACK("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][BACK]",1500),
    MOVE_4_PAWN_RIGHT_BACK("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][BACK]",1500),
    MOVE_i_PAWN_RIGHT_LEFT("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][LEFT]",1500),
    MOVE_1_PAWN_RIGHT_LEFT("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][LEFT]",1500),
    MOVE_2_PAWN_RIGHT_LEFT("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][LEFT]",1500),
    MOVE_3_PAWN_RIGHT_LEFT("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][LEFT]",1500),
    MOVE_4_PAWN_RIGHT_LEFT("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][LEFT]",1500),
    MOVE_i_PAWN_RIGHT_RIGHT("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][RIGHT]",1500),
    MOVE_1_PAWN_RIGHT_RIGHT("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][RIGHT]",1500),
    MOVE_2_PAWN_RIGHT_RIGHT("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][RIGHT]",1500),
    MOVE_3_PAWN_RIGHT_RIGHT("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][RIGHT]",1500),
    MOVE_4_PAWN_RIGHT_RIGHT("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][RIGHT][PositionFinal][RIGHT]",1500),
    MOVE_QUEEN_FRONT_FRONT("[Action][MOVE][Entity][QUEEN][PositionInitial][FRONT][PositionFinal][FRONT]",1500),
    MOVE_QUEEN_FRONT_BACK("[Action][MOVE][Entity][QUEEN][PositionInitial][FRONT][PositionFinal][BACK]",1500),
    MOVE_QUEEN_FRONT_LEFT("[Action][MOVE][Entity][QUEEN][PositionInitial][FRONT][PositionFinal][LEFT]",1500),
    MOVE_QUEEN_FRONT_RIGHT("[Action][MOVE][Entity][QUEEN][PositionInitial][FRONT][PositionFinal][RIGHT]",1500),
    MOVE_QUEEN_BACK_FRONT("[Action][MOVE][Entity][QUEEN][PositionInitial][BACK][PositionFinal][FRONT]",1500),
    MOVE_QUEEN_BACK_BACK("[Action][MOVE][Entity][QUEEN][PositionInitial][BACK][PositionFinal][BACK]",1500),
    MOVE_QUEEN_BACK_LEFT("[Action][MOVE][Entity][QUEEN][PositionInitial][BACK][PositionFinal][LEFT]",1500),
    MOVE_QUEEN_BACK_RIGHT("[Action][MOVE][Entity][QUEEN][PositionInitial][BACK][PositionFinal][RIGHT]",1500),
    MOVE_QUEEN_LEFT_FRONT("[Action][MOVE][Entity][QUEEN][PositionInitial][LEFT][PositionFinal][FRONT]",1500),
    MOVE_QUEEN_LEFT_BACK("[Action][MOVE][Entity][QUEEN][PositionInitial][LEFT][PositionFinal][BACK]",1500),
    MOVE_QUEEN_LEFT_LEFT("[Action][MOVE][Entity][QUEEN][PositionInitial][LEFT][PositionFinal][LEFT]",1500),
    MOVE_QUEEN_LEFT_RIGHT("[Action][MOVE][Entity][QUEEN][PositionInitial][LEFT][PositionFinal][RIGHT]",1500),
    MOVE_QUEEN_RIGHT_FRONT("[Action][MOVE][Entity][QUEEN][PositionInitial][RIGHT][PositionFinal][FRONT]",1500),
    MOVE_QUEEN_RIGHT_BACK("[Action][MOVE][Entity][QUEEN][PositionInitial][RIGHT][PositionFinal][BACK]",1500),
    MOVE_QUEEN_RIGHT_LEFT("[Action][MOVE][Entity][QUEEN][PositionInitial][RIGHT][PositionFinal][LEFT]",1500),
    MOVE_QUEEN_RIGHT_RIGHT("[Action][MOVE][Entity][QUEEN][PositionInitial][RIGHT][PositionFinal][RIGHT]",1500),
    MOVE_KING_FRONT_FRONT("[Action][MOVE][Entity][KING][PositionInitial][FRONT][PositionFinal][FRONT]",1500),
    MOVE_KING_FRONT_BACK("[Action][MOVE][Entity][KING][PositionInitial][FRONT][PositionFinal][BACK]",1500),
    MOVE_KING_FRONT_LEFT("[Action][MOVE][Entity][KING][PositionInitial][FRONT][PositionFinal][LEFT]",1500),
    MOVE_KING_FRONT_RIGHT("[Action][MOVE][Entity][KING][PositionInitial][FRONT][PositionFinal][RIGHT]",1500),
    MOVE_KING_BACK_FRONT("[Action][MOVE][Entity][KING][PositionInitial][BACK][PositionFinal][FRONT]",1500),
    MOVE_KING_BACK_BACK("[Action][MOVE][Entity][KING][PositionInitial][BACK][PositionFinal][BACK]",1500),
    MOVE_KING_BACK_LEFT("[Action][MOVE][Entity][KING][PositionInitial][BACK][PositionFinal][LEFT]",1500),
    MOVE_KING_BACK_RIGHT("[Action][MOVE][Entity][KING][PositionInitial][BACK][PositionFinal][RIGHT]",1500),
    MOVE_KING_LEFT_FRONT("[Action][MOVE][Entity][KING][PositionInitial][LEFT][PositionFinal][FRONT]",1500),
    MOVE_KING_LEFT_BACK("[Action][MOVE][Entity][KING][PositionInitial][LEFT][PositionFinal][BACK]",1500),
    MOVE_KING_LEFT_LEFT("[Action][MOVE][Entity][KING][PositionInitial][LEFT][PositionFinal][LEFT]",1500),
    MOVE_KING_LEFT_RIGHT("[Action][MOVE][Entity][KING][PositionInitial][LEFT][PositionFinal][RIGHT]",1500),
    MOVE_KING_RIGHT_FRONT("[Action][MOVE][Entity][KING][PositionInitial][RIGHT][PositionFinal][FRONT]",1500),
    MOVE_KING_RIGHT_BACK("[Action][MOVE][Entity][KING][PositionInitial][RIGHT][PositionFinal][BACK]",1500),
    MOVE_KING_RIGHT_LEFT("[Action][MOVE][Entity][KING][PositionInitial][RIGHT][PositionFinal][LEFT]",1500),
    MOVE_KING_RIGHT_RIGHT("[Action][MOVE][Entity][KING][PositionInitial][RIGHT][PositionFinal][RIGHT]",1500)


    // // Sequence Movement

    // MOVE_KNIGHT_FRONT("[Action][MOVE][Entity][KNIGHT][PositionInitial][FRONT]",1500),
    // MOVE_KNIGHT_BACK("[Action][MOVE][Entity][KNIGHT][PositionInitial][BACK]",1500),
    // MOVE_KNIGHT_LEFT("[Action][MOVE][Entity][KNIGHT][PositionInitial][LEFT]",1500),
    // MOVE_KNIGHT_RIGHT("[Action][MOVE][Entity][KNIGHT][PositionInitial][RIGHT]",1500),
    // MOVE_BISHOP_FRONT("[Action][MOVE][Entity][BISHOP][PositionInitial][FRONT]",1500),
    // MOVE_BISHOP_BACK("[Action][MOVE][Entity][BISHOP][PositionInitial][BACK]",1500),
    // MOVE_BISHOP_LEFT("[Action][MOVE][Entity][BISHOP][PositionInitial][LEFT]",1500),
    // MOVE_BISHOP_RIGHT("[Action][MOVE][Entity][BISHOP][PositionInitial][RIGHT]",1500),
    // MOVE_ROOK_FRONT("[Action][MOVE][Entity][ROOK][PositionInitial][FRONT]",1500),
    // MOVE_ROOK_BACK("[Action][MOVE][Entity][ROOK][PositionInitial][BACK]",1500),
    // MOVE_ROOK_LEFT("[Action][MOVE][Entity][ROOK][PositionInitial][LEFT]",1500),
    // MOVE_ROOK_RIGHT("[Action][MOVE][Entity][ROOK][PositionInitial][RIGHT]",1500),
    // MOVE_i_PAWN_FRONT("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][FRONT]",1500),
    // MOVE_1_PAWN_FRONT("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][FRONT]",1500),
    // MOVE_2_PAWN_FRONT("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][FRONT]",1500),
    // MOVE_3_PAWN_FRONT("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][FRONT]",1500),
    // MOVE_4_PAWN_FRONT("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][FRONT]",1500),
    // MOVE_i_PAWN_BACK("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][BACK]",1500),
    // MOVE_1_PAWN_BACK("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][BACK]",1500),
    // MOVE_2_PAWN_BACK("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][BACK]",1500),
    // MOVE_3_PAWN_BACK("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][BACK]",1500),
    // MOVE_4_PAWN_BACK("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][BACK]",1500),
    // MOVE_i_PAWN_LEFT("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][LEFT]",1500),
    // MOVE_1_PAWN_LEFT("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][LEFT]",1500),
    // MOVE_2_PAWN_LEFT("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][LEFT]",1500),
    // MOVE_3_PAWN_LEFT("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][LEFT]",1500),
    // MOVE_4_PAWN_LEFT("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][LEFT]",1500),
    // MOVE_i_PAWN_RIGHT("[Action][MOVE][NumberInitial][i][Entity][PAWN][PositionInitial][RIGHT]",1500),
    // MOVE_1_PAWN_RIGHT("[Action][MOVE][NumberInitial][1][Entity][PAWN][PositionInitial][RIGHT]",1500),
    // MOVE_2_PAWN_RIGHT("[Action][MOVE][NumberInitial][2][Entity][PAWN][PositionInitial][RIGHT]",1500),
    // MOVE_3_PAWN_RIGHT("[Action][MOVE][NumberInitial][3][Entity][PAWN][PositionInitial][RIGHT]",1500),
    // MOVE_4_PAWN_RIGHT("[Action][MOVE][NumberInitial][4][Entity][PAWN][PositionInitial][RIGHT]",1500),
    // MOVE_QUEEN_FRONT("[Action][MOVE][Entity][QUEEN][PositionInitial][FRONT]",1500),
    // MOVE_QUEEN_BACK("[Action][MOVE][Entity][QUEEN][PositionInitial][BACK]",1500),
    // MOVE_QUEEN_LEFT("[Action][MOVE][Entity][QUEEN][PositionInitial][LEFT]",1500),
    // MOVE_QUEEN_RIGHT("[Action][MOVE][Entity][QUEEN][PositionInitial][RIGHT]",1500),
    // MOVE_KING_FRONT("[Action][MOVE][Entity][KING][PositionInitial][FRONT]",1500),
    // MOVE_KING_BACK("[Action][MOVE][Entity][KING][PositionInitial][BACK]",1500),
    // MOVE_KING_LEFT("[Action][MOVE][Entity][KING][PositionInitial][LEFT]",1500),
    // MOVE_KING_RIGHT("[Action][MOVE][Entity][KING][PositionInitial][RIGHT]",1500);

    ;


private String event; 
private int timeout;
Speech(String m, int time) {
	event=m;
	timeout=time;
}
@Override
public int getTimeOut(){
	return timeout;
}
@Override
public String getEventName(){
	return event;
}
@Override
public String getEvName(){
	return getModalityName().toLowerCase() +event.toLowerCase();
}

}
