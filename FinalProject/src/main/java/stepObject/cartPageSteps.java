package stepObject;

import PajeObject.cartPage;

public class cartPageSteps extends cartPage {
    public cartPageSteps GoToCartPage(){

     cartBtn.click();



        return null;
    }

    public cartPageSteps Search(String name){

        searchInput.setValue(name);



        return null;
    }
    public cartPageSteps f(){

        faInput.click();



        return null;
    }
    public cartPageSteps A(){

        addInput.click();



        return null;
    }
    public cartPageSteps C(){

        countInput.click();



        return null;
    }


}
