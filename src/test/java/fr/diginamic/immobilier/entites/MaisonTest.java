package fr.diginamic.immobilier.entites;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaisonTest {
    @Test
    void ajouterPieceTest(Piece nvPiece){

        Piece[] pieces = new Piece[10];
        int nbPieces = pieces.length;
        // On est obligé d'agrandir le tableau initial de 1 à chaque ajout
        // d'une nouvelle pièce

        // On commence donc par créer un tableau temporaire appelé newTab
        // qui a une taille égale à la tableau du tableau pieces+1
        Piece[] newTab = new Piece[pieces.length+1];

        // On déverse toutes les pièces du tableau pieces dans newTab
        for (int i=0; i<pieces.length; i++){
            newTab[i]=pieces[i];
        }

        // On place en dernière position dans le nouveau tableau la nouvelle
        // pièce
        newTab[newTab.length-1]=nvPiece;
            int newNbPieces = newTab.length;
        // Enfin on affecte newTab à pieces
        //this.pieces=newTab;

          // assertFalse(nbPieces>newNbPieces);

    }

    }

