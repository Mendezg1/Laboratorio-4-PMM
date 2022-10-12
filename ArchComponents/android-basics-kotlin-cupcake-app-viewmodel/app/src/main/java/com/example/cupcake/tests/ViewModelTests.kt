package com.example.cupcake.tests

import com.example.cupcake.model.OrderViewModel
import junit.framework.Assert.assertEquals
import org.junit.Test

class ViewModelTests {

    @Test
    fun price_twelve_cupcakes() {
        val viewModel = OrderViewModel()
        viewModel.price.observeForever {}
        viewModel.setQuantity(12)
        assertEquals("$27.00", viewModel.price.value)
    }
}