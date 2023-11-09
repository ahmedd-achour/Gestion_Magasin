import java.util.Date;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(2026-1900 , 4, 14); // May 14, 2026
        Produit product1 =new Produit(1021,"Lait","Delice",0,date);
        Produit product2 =new Produit(2510,"Yaourt","Vitalait",0,date);
        Produit product3 =new Produit(3250,"Tomate","Sicam",1.200,date);
        product1.afficherProduit();
        product2.afficherProduit();
        product3.afficherProduit();
        product1.setPrix(0.700);
        product1.afficherProduit();

        Scanner scan = new Scanner(System.in);
        System.out.println("donner le prix du produit "+product2+"$ :");
        double prix= scan.nextDouble();
        product2.setPrix(prix);
        product2.afficherProduit();
        product1.toString();
        product1.toString();
        product1.toString();
        LocalDateTime t= LocalDateTime.now();
        System.out.println("note that today is: "+t+" please be careful !");

        int nombreProduits=0;
       do{   System.out.println("donner le nombre des produits dans la Magasin: ");nombreProduits=scan.nextInt();}while (nombreProduits>50 || nombreProduits<0);

        Produit[] TP = new Produit[50];
        for (int i=0;i<nombreProduits;i++){
            Produit pr =new Produit();
            pr.prix=-0.1;
            while (pr.prix<=0){ System.out.println("donner le prix du Produit: ");pr.prix=scan.nextDouble();}
            System.out.println("donner Libellee du produit: ");
            pr.libelee=scan.next();
            pr.setLibelee(pr.libelee);
            System.out.println("donner mark: ");
            pr.mark=scan.next();
            pr.setMark(pr.mark);

            //l'id est incrimentée automatiquement pour éviter les fautes de l'ajout manuelle (meme id)
            pr.setId(i+1000);
            pr.setExpiration(date);
            TP[i]=pr;



        }
        Magasin mg =new Magasin("Tunis",1112545,8544,TP);
        mg.AfficherMagasin();
    }
}