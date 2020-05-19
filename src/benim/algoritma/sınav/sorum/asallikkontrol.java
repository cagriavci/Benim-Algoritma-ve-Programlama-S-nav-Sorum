 
package benim.algoritma.sınav.sorum;
 
public class asallikkontrol extends HesapMakinesi {
        
    
    
    public int asallikbul(int p,int q) {
         int asal = 0;
    if(super.p<super.q){
            for(int i=super.p; i<super.q; i++){
                for(int j=super.p; j<=super.q; j++){
                    asal=0;
                    for(int k=2; k<=super.q; k++){
                        if(i%k==0 && j%k==0){
                            asal++;
                            
                        }
                    }
                    if(asal==0){
                        System.out.println(i+" ve "+j);
                     }
                }
            }
        }
 
        else {
            for(int i=super.q; i<super.p; i++){
                for(int j=super.q; j<=super.p; j++){
                    asal=0;
                    for(int k=2; k<=super.p; k++){
                        if(i%k==0 && j%k==0){
                            asal++;
                        }
                    }
                    if(asal==0){
                        System.out.println(i+" ve "+j);
                    }
                }
            }
        }
        return asal;
    }

     
}

        
        
    

