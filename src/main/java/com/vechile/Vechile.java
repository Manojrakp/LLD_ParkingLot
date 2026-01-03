package com.vechile;
public abstract class Vechile {
    private final String licenceNumber;
    private final VechileSize size;

    public Vechile(String licenceNumber, VechileSize size) {
        this.licenceNumber = licenceNumber;
        this.size = size;
    }

    public String getLicenseNumber() { return licenceNumber; }

    public VechileSize getSize() {
        return size;
    }
}
