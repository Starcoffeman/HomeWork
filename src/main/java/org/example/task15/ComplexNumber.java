package org.example.task15;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ComplexNumber {
    private double real, imaginary;

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denom = other.real * other.real + other.imaginary * other.imaginary;
        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denom;
        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denom;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
