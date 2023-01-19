/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genfusionscxml;

import java.io.IOException;
import scxmlgen.Fusion.FusionGenerator;
import scxmlgen.Modalities.Output;
import scxmlgen.Modalities.Speech;
import scxmlgen.Modalities.SecondMod;

/**
 *
 * @author nunof
 */
public class GenFusionSCXML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

    FusionGenerator fg = new FusionGenerator();
  
    
    // fg.Sequence(Speech.SQUARE, SecondMod.RED, Output.SQUARE_RED);
    // fg.Sequence(Speech.SQUARE, SecondMod.BLUE, Output.SQUARE_BLUE);
    // fg.Sequence(Speech.SQUARE, SecondMod.YELLOW, Output.SQUARE_YELLOW);
    // fg.Complementary(Speech.TRIANGLE, SecondMod.RED, Output.TRIANGLE_RED);
    // fg.Complementary(Speech.TRIANGLE, SecondMod.BLUE, Output.TRIANGLE_BLUE);
    // fg.Complementary(Speech.TRIANGLE, SecondMod.YELLOW, Output.TRIANGLE_YELLOW);
    // fg.Complementary(Speech.CIRCLE, SecondMod.RED, Output.CIRCLE_RED);
    // fg.Complementary(Speech.CIRCLE, SecondMod.BLUE, Output.CIRCLE_BLUE);
    // fg.Complementary(Speech.CIRCLE, SecondMod.YELLOW, Output.CIRCLE_YELLOW);
    
    //fg.Single(Speech.CIRCLE, Output.CIRCLE);  //EXAMPLE
    //fg.Redundancy(Speech.CIRCLE, SecondMod.CIRCLE, Output.CIRCLE);  //EXAMPLE

    // fg.Single(SecondMod.INIT, Output.INIT);
    fg.Redundancy(Speech.INIT, SecondMod.INIT, Output.INIT);
    // fg.Single(Speech.INIT, Output.INIT);




    // Movement

    fg.Single(Speech.MOVE_KNIGHT_FRONT_FRONT, Output.MOVE_KNIGHT_FRONT_FRONT);
    fg.Single(Speech.MOVE_KNIGHT_FRONT_BACK, Output.MOVE_KNIGHT_FRONT_BACK);
    fg.Single(Speech.MOVE_KNIGHT_FRONT_LEFT, Output.MOVE_KNIGHT_FRONT_LEFT);
    fg.Single(Speech.MOVE_KNIGHT_FRONT_RIGHT, Output.MOVE_KNIGHT_FRONT_RIGHT);
    fg.Single(Speech.MOVE_KNIGHT_BACK_FRONT, Output.MOVE_KNIGHT_BACK_FRONT);
    fg.Single(Speech.MOVE_KNIGHT_BACK_BACK, Output.MOVE_KNIGHT_BACK_BACK);
    fg.Single(Speech.MOVE_KNIGHT_BACK_LEFT, Output.MOVE_KNIGHT_BACK_LEFT);
    fg.Single(Speech.MOVE_KNIGHT_BACK_RIGHT, Output.MOVE_KNIGHT_BACK_RIGHT);
    fg.Single(Speech.MOVE_KNIGHT_LEFT_FRONT, Output.MOVE_KNIGHT_LEFT_FRONT);
    fg.Single(Speech.MOVE_KNIGHT_LEFT_BACK, Output.MOVE_KNIGHT_LEFT_BACK);
    fg.Single(Speech.MOVE_KNIGHT_LEFT_LEFT, Output.MOVE_KNIGHT_LEFT_LEFT);
    fg.Single(Speech.MOVE_KNIGHT_LEFT_RIGHT, Output.MOVE_KNIGHT_LEFT_RIGHT);
    fg.Single(Speech.MOVE_KNIGHT_RIGHT_FRONT, Output.MOVE_KNIGHT_RIGHT_FRONT);
    fg.Single(Speech.MOVE_KNIGHT_RIGHT_BACK, Output.MOVE_KNIGHT_RIGHT_BACK);
    fg.Single(Speech.MOVE_KNIGHT_RIGHT_LEFT, Output.MOVE_KNIGHT_RIGHT_LEFT);
    fg.Single(Speech.MOVE_KNIGHT_RIGHT_RIGHT, Output.MOVE_KNIGHT_RIGHT_RIGHT);
    fg.Single(Speech.MOVE_BISHOP_FRONT_FRONT, Output.MOVE_BISHOP_FRONT_FRONT);
    fg.Single(Speech.MOVE_BISHOP_FRONT_BACK, Output.MOVE_BISHOP_FRONT_BACK);
    fg.Single(Speech.MOVE_BISHOP_FRONT_LEFT, Output.MOVE_BISHOP_FRONT_LEFT);
    fg.Single(Speech.MOVE_BISHOP_FRONT_RIGHT, Output.MOVE_BISHOP_FRONT_RIGHT);
    fg.Single(Speech.MOVE_BISHOP_BACK_FRONT, Output.MOVE_BISHOP_BACK_FRONT);
    fg.Single(Speech.MOVE_BISHOP_BACK_BACK, Output.MOVE_BISHOP_BACK_BACK);
    fg.Single(Speech.MOVE_BISHOP_BACK_LEFT, Output.MOVE_BISHOP_BACK_LEFT);
    fg.Single(Speech.MOVE_BISHOP_BACK_RIGHT, Output.MOVE_BISHOP_BACK_RIGHT);
    fg.Single(Speech.MOVE_BISHOP_LEFT_FRONT, Output.MOVE_BISHOP_LEFT_FRONT);
    fg.Single(Speech.MOVE_BISHOP_LEFT_BACK, Output.MOVE_BISHOP_LEFT_BACK);
    fg.Single(Speech.MOVE_BISHOP_LEFT_LEFT, Output.MOVE_BISHOP_LEFT_LEFT);
    fg.Single(Speech.MOVE_BISHOP_LEFT_RIGHT, Output.MOVE_BISHOP_LEFT_RIGHT);
    fg.Single(Speech.MOVE_BISHOP_RIGHT_FRONT, Output.MOVE_BISHOP_RIGHT_FRONT);
    fg.Single(Speech.MOVE_BISHOP_RIGHT_BACK, Output.MOVE_BISHOP_RIGHT_BACK);
    fg.Single(Speech.MOVE_BISHOP_RIGHT_LEFT, Output.MOVE_BISHOP_RIGHT_LEFT);
    fg.Single(Speech.MOVE_BISHOP_RIGHT_RIGHT, Output.MOVE_BISHOP_RIGHT_RIGHT);
    fg.Single(Speech.MOVE_ROOK_FRONT_FRONT, Output.MOVE_ROOK_FRONT_FRONT);
    fg.Single(Speech.MOVE_ROOK_FRONT_BACK, Output.MOVE_ROOK_FRONT_BACK);
    fg.Single(Speech.MOVE_ROOK_FRONT_LEFT, Output.MOVE_ROOK_FRONT_LEFT);
    fg.Single(Speech.MOVE_ROOK_FRONT_RIGHT, Output.MOVE_ROOK_FRONT_RIGHT);
    fg.Single(Speech.MOVE_ROOK_BACK_FRONT, Output.MOVE_ROOK_BACK_FRONT);
    fg.Single(Speech.MOVE_ROOK_BACK_BACK, Output.MOVE_ROOK_BACK_BACK);
    fg.Single(Speech.MOVE_ROOK_BACK_LEFT, Output.MOVE_ROOK_BACK_LEFT);
    fg.Single(Speech.MOVE_ROOK_BACK_RIGHT, Output.MOVE_ROOK_BACK_RIGHT);
    fg.Single(Speech.MOVE_ROOK_LEFT_FRONT, Output.MOVE_ROOK_LEFT_FRONT);
    fg.Single(Speech.MOVE_ROOK_LEFT_BACK, Output.MOVE_ROOK_LEFT_BACK);
    fg.Single(Speech.MOVE_ROOK_LEFT_LEFT, Output.MOVE_ROOK_LEFT_LEFT);
    fg.Single(Speech.MOVE_ROOK_LEFT_RIGHT, Output.MOVE_ROOK_LEFT_RIGHT);
    fg.Single(Speech.MOVE_ROOK_RIGHT_FRONT, Output.MOVE_ROOK_RIGHT_FRONT);
    fg.Single(Speech.MOVE_ROOK_RIGHT_BACK, Output.MOVE_ROOK_RIGHT_BACK);
    fg.Single(Speech.MOVE_ROOK_RIGHT_LEFT, Output.MOVE_ROOK_RIGHT_LEFT);
    fg.Single(Speech.MOVE_ROOK_RIGHT_RIGHT, Output.MOVE_ROOK_RIGHT_RIGHT);
    fg.Single(Speech.MOVE_i_PAWN_FRONT_FRONT, Output.MOVE_PAWN_FRONT_i_FRONT);
    fg.Single(Speech.MOVE_1_PAWN_FRONT_FRONT, Output.MOVE_PAWN_FRONT_1_FRONT);
    fg.Single(Speech.MOVE_2_PAWN_FRONT_FRONT, Output.MOVE_PAWN_FRONT_2_FRONT);
    fg.Single(Speech.MOVE_3_PAWN_FRONT_FRONT, Output.MOVE_PAWN_FRONT_3_FRONT);
    fg.Single(Speech.MOVE_4_PAWN_FRONT_FRONT, Output.MOVE_PAWN_FRONT_4_FRONT);
    fg.Single(Speech.MOVE_i_PAWN_FRONT_BACK, Output.MOVE_PAWN_FRONT_i_BACK);
    fg.Single(Speech.MOVE_1_PAWN_FRONT_BACK, Output.MOVE_PAWN_FRONT_1_BACK);
    fg.Single(Speech.MOVE_2_PAWN_FRONT_BACK, Output.MOVE_PAWN_FRONT_2_BACK);
    fg.Single(Speech.MOVE_3_PAWN_FRONT_BACK, Output.MOVE_PAWN_FRONT_3_BACK);
    fg.Single(Speech.MOVE_4_PAWN_FRONT_BACK, Output.MOVE_PAWN_FRONT_4_BACK);
    fg.Single(Speech.MOVE_i_PAWN_FRONT_LEFT, Output.MOVE_PAWN_FRONT_i_LEFT);
    fg.Single(Speech.MOVE_1_PAWN_FRONT_LEFT, Output.MOVE_PAWN_FRONT_1_LEFT);
    fg.Single(Speech.MOVE_2_PAWN_FRONT_LEFT, Output.MOVE_PAWN_FRONT_2_LEFT);
    fg.Single(Speech.MOVE_3_PAWN_FRONT_LEFT, Output.MOVE_PAWN_FRONT_3_LEFT);
    fg.Single(Speech.MOVE_4_PAWN_FRONT_LEFT, Output.MOVE_PAWN_FRONT_4_LEFT);
    fg.Single(Speech.MOVE_i_PAWN_FRONT_RIGHT, Output.MOVE_PAWN_FRONT_i_RIGHT);
    fg.Single(Speech.MOVE_1_PAWN_FRONT_RIGHT, Output.MOVE_PAWN_FRONT_1_RIGHT);
    fg.Single(Speech.MOVE_2_PAWN_FRONT_RIGHT, Output.MOVE_PAWN_FRONT_2_RIGHT);
    fg.Single(Speech.MOVE_3_PAWN_FRONT_RIGHT, Output.MOVE_PAWN_FRONT_3_RIGHT);
    fg.Single(Speech.MOVE_4_PAWN_FRONT_RIGHT, Output.MOVE_PAWN_FRONT_4_RIGHT);
    fg.Single(Speech.MOVE_i_PAWN_BACK_FRONT, Output.MOVE_PAWN_BACK_i_FRONT);
    fg.Single(Speech.MOVE_1_PAWN_BACK_FRONT, Output.MOVE_PAWN_BACK_1_FRONT);
    fg.Single(Speech.MOVE_2_PAWN_BACK_FRONT, Output.MOVE_PAWN_BACK_2_FRONT);
    fg.Single(Speech.MOVE_3_PAWN_BACK_FRONT, Output.MOVE_PAWN_BACK_3_FRONT);
    fg.Single(Speech.MOVE_4_PAWN_BACK_FRONT, Output.MOVE_PAWN_BACK_4_FRONT);
    fg.Single(Speech.MOVE_i_PAWN_BACK_BACK, Output.MOVE_PAWN_BACK_i_BACK);
    fg.Single(Speech.MOVE_1_PAWN_BACK_BACK, Output.MOVE_PAWN_BACK_1_BACK);
    fg.Single(Speech.MOVE_2_PAWN_BACK_BACK, Output.MOVE_PAWN_BACK_2_BACK);
    fg.Single(Speech.MOVE_3_PAWN_BACK_BACK, Output.MOVE_PAWN_BACK_3_BACK);
    fg.Single(Speech.MOVE_4_PAWN_BACK_BACK, Output.MOVE_PAWN_BACK_4_BACK);
    fg.Single(Speech.MOVE_i_PAWN_BACK_LEFT, Output.MOVE_PAWN_BACK_i_LEFT);
    fg.Single(Speech.MOVE_1_PAWN_BACK_LEFT, Output.MOVE_PAWN_BACK_1_LEFT);
    fg.Single(Speech.MOVE_2_PAWN_BACK_LEFT, Output.MOVE_PAWN_BACK_2_LEFT);
    fg.Single(Speech.MOVE_3_PAWN_BACK_LEFT, Output.MOVE_PAWN_BACK_3_LEFT);
    fg.Single(Speech.MOVE_4_PAWN_BACK_LEFT, Output.MOVE_PAWN_BACK_4_LEFT);
    fg.Single(Speech.MOVE_i_PAWN_BACK_RIGHT, Output.MOVE_PAWN_BACK_i_RIGHT);
    fg.Single(Speech.MOVE_1_PAWN_BACK_RIGHT, Output.MOVE_PAWN_BACK_1_RIGHT);
    fg.Single(Speech.MOVE_2_PAWN_BACK_RIGHT, Output.MOVE_PAWN_BACK_2_RIGHT);
    fg.Single(Speech.MOVE_3_PAWN_BACK_RIGHT, Output.MOVE_PAWN_BACK_3_RIGHT);
    fg.Single(Speech.MOVE_4_PAWN_BACK_RIGHT, Output.MOVE_PAWN_BACK_4_RIGHT);
    fg.Single(Speech.MOVE_i_PAWN_LEFT_FRONT, Output.MOVE_PAWN_LEFT_i_FRONT);
    fg.Single(Speech.MOVE_1_PAWN_LEFT_FRONT, Output.MOVE_PAWN_LEFT_1_FRONT);
    fg.Single(Speech.MOVE_2_PAWN_LEFT_FRONT, Output.MOVE_PAWN_LEFT_2_FRONT);
    fg.Single(Speech.MOVE_3_PAWN_LEFT_FRONT, Output.MOVE_PAWN_LEFT_3_FRONT);
    fg.Single(Speech.MOVE_4_PAWN_LEFT_FRONT, Output.MOVE_PAWN_LEFT_4_FRONT);
    fg.Single(Speech.MOVE_i_PAWN_LEFT_BACK, Output.MOVE_PAWN_LEFT_i_BACK);
    fg.Single(Speech.MOVE_1_PAWN_LEFT_BACK, Output.MOVE_PAWN_LEFT_1_BACK);
    fg.Single(Speech.MOVE_2_PAWN_LEFT_BACK, Output.MOVE_PAWN_LEFT_2_BACK);
    fg.Single(Speech.MOVE_3_PAWN_LEFT_BACK, Output.MOVE_PAWN_LEFT_3_BACK);
    fg.Single(Speech.MOVE_4_PAWN_LEFT_BACK, Output.MOVE_PAWN_LEFT_4_BACK);
    fg.Single(Speech.MOVE_i_PAWN_LEFT_LEFT, Output.MOVE_PAWN_LEFT_i_LEFT);
    fg.Single(Speech.MOVE_1_PAWN_LEFT_LEFT, Output.MOVE_PAWN_LEFT_1_LEFT);
    fg.Single(Speech.MOVE_2_PAWN_LEFT_LEFT, Output.MOVE_PAWN_LEFT_2_LEFT);
    fg.Single(Speech.MOVE_3_PAWN_LEFT_LEFT, Output.MOVE_PAWN_LEFT_3_LEFT);
    fg.Single(Speech.MOVE_4_PAWN_LEFT_LEFT, Output.MOVE_PAWN_LEFT_4_LEFT);
    fg.Single(Speech.MOVE_i_PAWN_LEFT_RIGHT, Output.MOVE_PAWN_LEFT_i_RIGHT);
    fg.Single(Speech.MOVE_1_PAWN_LEFT_RIGHT, Output.MOVE_PAWN_LEFT_1_RIGHT);
    fg.Single(Speech.MOVE_2_PAWN_LEFT_RIGHT, Output.MOVE_PAWN_LEFT_2_RIGHT);
    fg.Single(Speech.MOVE_3_PAWN_LEFT_RIGHT, Output.MOVE_PAWN_LEFT_3_RIGHT);
    fg.Single(Speech.MOVE_4_PAWN_LEFT_RIGHT, Output.MOVE_PAWN_LEFT_4_RIGHT);
    fg.Single(Speech.MOVE_i_PAWN_RIGHT_FRONT, Output.MOVE_PAWN_RIGHT_i_FRONT);
    fg.Single(Speech.MOVE_1_PAWN_RIGHT_FRONT, Output.MOVE_PAWN_RIGHT_1_FRONT);
    fg.Single(Speech.MOVE_2_PAWN_RIGHT_FRONT, Output.MOVE_PAWN_RIGHT_2_FRONT);
    fg.Single(Speech.MOVE_3_PAWN_RIGHT_FRONT, Output.MOVE_PAWN_RIGHT_3_FRONT);
    fg.Single(Speech.MOVE_4_PAWN_RIGHT_FRONT, Output.MOVE_PAWN_RIGHT_4_FRONT);
    fg.Single(Speech.MOVE_i_PAWN_RIGHT_BACK, Output.MOVE_PAWN_RIGHT_i_BACK);
    fg.Single(Speech.MOVE_1_PAWN_RIGHT_BACK, Output.MOVE_PAWN_RIGHT_1_BACK);
    fg.Single(Speech.MOVE_2_PAWN_RIGHT_BACK, Output.MOVE_PAWN_RIGHT_2_BACK);
    fg.Single(Speech.MOVE_3_PAWN_RIGHT_BACK, Output.MOVE_PAWN_RIGHT_3_BACK);
    fg.Single(Speech.MOVE_4_PAWN_RIGHT_BACK, Output.MOVE_PAWN_RIGHT_4_BACK);
    fg.Single(Speech.MOVE_i_PAWN_RIGHT_LEFT, Output.MOVE_PAWN_RIGHT_i_LEFT);
    fg.Single(Speech.MOVE_1_PAWN_RIGHT_LEFT, Output.MOVE_PAWN_RIGHT_1_LEFT);
    fg.Single(Speech.MOVE_2_PAWN_RIGHT_LEFT, Output.MOVE_PAWN_RIGHT_2_LEFT);
    fg.Single(Speech.MOVE_3_PAWN_RIGHT_LEFT, Output.MOVE_PAWN_RIGHT_3_LEFT);
    fg.Single(Speech.MOVE_4_PAWN_RIGHT_LEFT, Output.MOVE_PAWN_RIGHT_4_LEFT);
    fg.Single(Speech.MOVE_i_PAWN_RIGHT_RIGHT, Output.MOVE_PAWN_RIGHT_i_RIGHT);
    fg.Single(Speech.MOVE_1_PAWN_RIGHT_RIGHT, Output.MOVE_PAWN_RIGHT_1_RIGHT);
    fg.Single(Speech.MOVE_2_PAWN_RIGHT_RIGHT, Output.MOVE_PAWN_RIGHT_2_RIGHT);
    fg.Single(Speech.MOVE_3_PAWN_RIGHT_RIGHT, Output.MOVE_PAWN_RIGHT_3_RIGHT);
    fg.Single(Speech.MOVE_4_PAWN_RIGHT_RIGHT, Output.MOVE_PAWN_RIGHT_4_RIGHT);
    fg.Single(Speech.MOVE_QUEEN_FRONT_FRONT, Output.MOVE_QUEEN_FRONT_FRONT);
    fg.Single(Speech.MOVE_QUEEN_FRONT_BACK, Output.MOVE_QUEEN_FRONT_BACK);
    fg.Single(Speech.MOVE_QUEEN_FRONT_LEFT, Output.MOVE_QUEEN_FRONT_LEFT);
    fg.Single(Speech.MOVE_QUEEN_FRONT_RIGHT, Output.MOVE_QUEEN_FRONT_RIGHT);
    fg.Single(Speech.MOVE_QUEEN_BACK_FRONT, Output.MOVE_QUEEN_BACK_FRONT);
    fg.Single(Speech.MOVE_QUEEN_BACK_BACK, Output.MOVE_QUEEN_BACK_BACK);
    fg.Single(Speech.MOVE_QUEEN_BACK_LEFT, Output.MOVE_QUEEN_BACK_LEFT);
    fg.Single(Speech.MOVE_QUEEN_BACK_RIGHT, Output.MOVE_QUEEN_BACK_RIGHT);
    fg.Single(Speech.MOVE_QUEEN_LEFT_FRONT, Output.MOVE_QUEEN_LEFT_FRONT);
    fg.Single(Speech.MOVE_QUEEN_LEFT_BACK, Output.MOVE_QUEEN_LEFT_BACK);
    fg.Single(Speech.MOVE_QUEEN_LEFT_LEFT, Output.MOVE_QUEEN_LEFT_LEFT);
    fg.Single(Speech.MOVE_QUEEN_LEFT_RIGHT, Output.MOVE_QUEEN_LEFT_RIGHT);
    fg.Single(Speech.MOVE_QUEEN_RIGHT_FRONT, Output.MOVE_QUEEN_RIGHT_FRONT);
    fg.Single(Speech.MOVE_QUEEN_RIGHT_BACK, Output.MOVE_QUEEN_RIGHT_BACK);
    fg.Single(Speech.MOVE_QUEEN_RIGHT_LEFT, Output.MOVE_QUEEN_RIGHT_LEFT);
    fg.Single(Speech.MOVE_QUEEN_RIGHT_RIGHT, Output.MOVE_QUEEN_RIGHT_RIGHT);
    fg.Single(Speech.MOVE_KING_FRONT_FRONT, Output.MOVE_KING_FRONT_FRONT);
    fg.Single(Speech.MOVE_KING_FRONT_BACK, Output.MOVE_KING_FRONT_BACK);
    fg.Single(Speech.MOVE_KING_FRONT_LEFT, Output.MOVE_KING_FRONT_LEFT);
    fg.Single(Speech.MOVE_KING_FRONT_RIGHT, Output.MOVE_KING_FRONT_RIGHT);
    fg.Single(Speech.MOVE_KING_BACK_FRONT, Output.MOVE_KING_BACK_FRONT);
    fg.Single(Speech.MOVE_KING_BACK_BACK, Output.MOVE_KING_BACK_BACK);
    fg.Single(Speech.MOVE_KING_BACK_LEFT, Output.MOVE_KING_BACK_LEFT);
    fg.Single(Speech.MOVE_KING_BACK_RIGHT, Output.MOVE_KING_BACK_RIGHT);
    fg.Single(Speech.MOVE_KING_LEFT_FRONT, Output.MOVE_KING_LEFT_FRONT);
    fg.Single(Speech.MOVE_KING_LEFT_BACK, Output.MOVE_KING_LEFT_BACK);
    fg.Single(Speech.MOVE_KING_LEFT_LEFT, Output.MOVE_KING_LEFT_LEFT);
    fg.Single(Speech.MOVE_KING_LEFT_RIGHT, Output.MOVE_KING_LEFT_RIGHT);
    fg.Single(Speech.MOVE_KING_RIGHT_FRONT, Output.MOVE_KING_RIGHT_FRONT);
    fg.Single(Speech.MOVE_KING_RIGHT_BACK, Output.MOVE_KING_RIGHT_BACK);
    fg.Single(Speech.MOVE_KING_RIGHT_LEFT, Output.MOVE_KING_RIGHT_LEFT);
    fg.Single(Speech.MOVE_KING_RIGHT_RIGHT, Output.MOVE_KING_RIGHT_RIGHT);




    fg.Build("fusion.scxml");
    System.out.println("Fusion SCXML generated");


        
        
    }
    
}
