package by.itacademy.brest.class21.cw.builder;

// Шаг 1: Создаем класс, представляющий сложный объект
class Product {
    private String name;
    private String id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product [part1=" + name + ", part2=" + id + "]";
    }

    // Внутренний класс Builder
    static class Builder {
        private Product product = new Product();

        public Builder name(String part1) {
            product.setName(part1);
            return this;
        }

        public Builder id(String part2) {
            product.setId(part2);
            return this;
        }

        public Product build() {
            return product;
        }
    }
}


