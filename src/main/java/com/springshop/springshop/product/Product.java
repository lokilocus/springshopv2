package com.springshop.springshop.product;

import java.math.BigDecimal;

public record Product(long id, String name, String description, BigDecimal price) {
}
