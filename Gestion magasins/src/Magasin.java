public class Magasin {
    String adress;
    int id;
    int Capasitee;
    Produit[] products;
    Magasin(String adress,int id,int capasitee,Produit[] p){
        this.adress=adress;
        this.id=id;
        this.Capasitee=capasitee;

        this.products=p;
    }
    void AfficherMagasin(){
        System.out.println("id of the Market: "+id + " located in "+adress +" that supports "+Capasitee+" product");
        for (int i=0;i<products.length;i++){
            if (products[i] != null) {
            products[i].afficherProduit();
             }
        }
    }
}
