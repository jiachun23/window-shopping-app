package com.example.window_shopping.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.window_shopping.R;
import com.example.window_shopping.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {

    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts(){
        if (mutableProductList == null){
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(),"Huawei P40 Pro", 3899,true,
                "https://img01.huaweifile.com/sg/ms/sa/pms/product/6901443376827/428_428_B24B886CA96CA08EBEBBDEB31C58A6E43AF086F51056B39Emp.png"));
        productList.add(new Product(UUID.randomUUID().toString(),"Huawei Mate 40 Pro", 4299,false,
                "https://consumer.huawei.com/content/dam/huawei-cbg-site/common/mkt/pdp/phones/mate40-pro/list-img/silver.png"));
        productList.add(new Product(UUID.randomUUID().toString(),"iPhone 12 Pro", 4999,false,
                "https://imagineonline.store/rails/active_storage/representations/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaHBBZzgrIiwiZXhwIjpudWxsLCJwdXIiOiJibG9iX2lkIn1" +
                        "9--12b3113481cd074f57e83f57d0f8534b6b946480/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaDdCam9MY21WemFYcGxTU0lQTVRBd01IZ3hNREF3UGdZNkJrVlUiLCJleHAiOm51bGws" +
                        "InB1ciI6InZhcmlhdGlvbiJ9fQ==--3847b42f42b1c45c616f0212496bf183b1d8c25d/MGMT3HN_A_2.png"));
        productList.add(new Product(UUID.randomUUID().toString(),"iPhone 12", 3599,true,
                "https://pngimg.com/uploads/iphone_12/iphone_12_PNG23.png"));
        productList.add(new Product(UUID.randomUUID().toString(),"Huawei Nova 7i", 1099,true,
                "https://shop-cdn.huawei.com/my/pms/product/6901443374298/428_428_DBA25FB61C8BC374F180DA1F6226DE45928531CEDFCF6A08mp.png"));
        productList.add(new Product(UUID.randomUUID().toString(),"Samsung Note 20 Ultra", 4099,false,
                "https://images.samsung.com/is/image/samsung/my-galaxy-note20-ultra-5g-n986-sm-n986bzngxme-frontmysticbronze-319645103?$720_576_PNG$"));
        productList.add(new Product(UUID.randomUUID().toString(),"Samsung Galaxy S21 Ultra ", 4799,true,
                "https://images.samsung.com/is/image/samsung/p6pim/my/galaxy-s21/gallery/my-galaxy-s21-ultra-5g-g988-sm-g998bzshxme-368319358?$PD_SHOP_JPG$"));
        productList.add(new Product(UUID.randomUUID().toString(),"Xiaomi 11 Pro", 2999,true,
                "https://www.electrorates.com/blogimg/Xiaomi_Mi_11_Pro.png"));
        productList.add(new Product(UUID.randomUUID().toString(),"OnePlus 8T", 2699,true,
                "https://image01.oneplus.net/shop/202009/16/1-M00-19-CB-rB8LB19hd1GAbRaNAANs4AY88Fk626.png"));
        productList.add(new Product(UUID.randomUUID().toString(),"OnePlus 7T", 1499,false,
                "https://frpfiles.com/wp-content/uploads/2020/04/OnePlus-7T-PNG.png"));


        mutableProductList.setValue(productList);
    }
}
