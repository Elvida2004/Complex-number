package org.example;

import lombok.*;
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Complex {
    private double x;
    private double y;

    public String str() {
        return x + "+" + y + "i";
    }


    public Complex add(Complex complex) {
        return new Complex(this.x + complex.getX(), this.y + complex.getY());
    }


    public Complex sub(Complex complex) {
        return new Complex(this.x - complex.getX(), this.y - complex.getY());
    }


    public Complex mul(Complex complex) {
        double newX = this.x * complex.getX() - this.y * complex.getY();
        double newY = this.x * complex.getY() + complex.getX() * this.y;
        return new Complex(newX, newY);
    }


    public Complex div(Complex complex) {
        double newX = (this.x * complex.getX() + this.y * complex.getY()) / (Math.pow(complex.getX(), 2) + Math.pow(complex.getY(), 2));
        double newY = (this.y * complex.getX() - this.x * complex.getY()) / (Math.pow(complex.getX(), 2) + Math.pow(complex.getY(), 2));
        return new Complex(newX,
                newY);
    }


    public double modulus() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }


    public boolean is_equal(Complex complex) {
        return (this.x == complex.getX()) && (this.y == complex.getY());
    }
}

