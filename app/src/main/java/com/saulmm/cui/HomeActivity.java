package com.saulmm.cui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.saulmm.cui.databinding.ActivityHomeBinding;
import com.saulmm.cui.model.Product;
import com.saulmm.cui.recycler.ProductAdapter;
import com.saulmm.cui.recycler.ProductItemPaddingDecoration;

public class HomeActivity extends AppCompatActivity {
    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);

        initRecycler(binding.productsRecycler);
    }

    private void initRecycler(RecyclerView productsRecycler) {
        productsRecycler.setHasFixedSize(true);
        productsRecycler.setAdapter(new ProductAdapter(Product.createFakeProducts()));
        productsRecycler.addItemDecoration(new ProductItemPaddingDecoration(this));
    }
}