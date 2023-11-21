package org.example;

import lombok.*;
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Complex {
    private double x;
    private double y;

    // Метод str возвращает комплексное число в качестве строки (“5+3i”)
    public String str() {
        return x + "+" + y + "i";
    }


    // Метод «+» add возвращающий сумму текущего комплексного числа и  другого комплексного числа
    public Complex add(Complex complex) {
        return new Complex(this.x + complex.getX(), this.y + complex.getY());
    }

    // Метод sub «-» возвращающий разность текущего комплексного числа и другого комплексного числа
    public Complex sub(Complex complex) {
        return new Complex(this.x - complex.getX(), this.y - complex.getY());
    }

    // Метод "*" mul возвращающий произведение текущего комплексного числа на другое комплексное число
    public Complex mul(Complex complex) {
        double newX = this.x * complex.getX() - this.y * complex.getY();
        double newY = this.x * complex.getY() + complex.getX() * this.y;
        return new Complex(newX, newY);
    }

    // Метод "/" div возвращающий частное текущего комплексного числа на другое комплексное число
    public Complex div(Complex complex) {
        double newX = (this.x * complex.getX() + this.y * complex.getY()) / (Math.pow(complex.getX(), 2) + Math.pow(complex.getY(), 2));
        double newY = (this.y * complex.getX() - this.x * complex.getY()) / (Math.pow(complex.getX(), 2) + Math.pow(complex.getY(), 2));
        return new Complex(newX,
                newY);
    }

    // Метод для нахождения модуля комплексного числа
    public double modulus() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    // Метод сравнивающий два комплексных числа и возвращающий true  если они равны и false  в противном случае
    public boolean is_equal(Complex complex) {
        return (this.x == complex.getX()) && (this.y == complex.getY());
    }
}
