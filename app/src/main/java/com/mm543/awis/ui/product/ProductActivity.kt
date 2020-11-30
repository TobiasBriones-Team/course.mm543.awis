/*
 * AWIS: Adventure Works Information Systems, Android App
 * Created for the MM543-0900-3-2020 course.
 * Team: Tobias Briones, Juan Varela
 *
 * Copyright (c) 2020 Tobias Briones.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.mm543.awis.ui.product

import android.os.Bundle
import android.text.Editable
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.mm543.awis.R
import com.mm543.awis.domain.model.Product
import kotlinx.android.synthetic.main.content_product.*

class ProductActivity : AppCompatActivity(), View.OnClickListener {
    private var product: Product? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val extras = intent.extras
        product = extras?.getSerializable("product") as Product?

        setContentView(R.layout.activity_product)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        initView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_product, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> navigateBack()
            R.id.action_shopping_cart -> startShoppingCartActivity()
        }
        return true
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

    private fun initView() {
        product_name_text.text = product?.name
        product_color_text.text = product?.color.toString()
        product_price_text.text = product?.listPrice.toString()

        product_size_text.text = "Grande"
        product_weight_text.text = "100lb"
        add_to_cart_button.setOnClickListener(this)
    }

    private fun startShoppingCartActivity() {
        TODO("Not yet implemented")
    }

    private fun navigateBack() {
        onBackPressed()
    }
}