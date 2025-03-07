package br.dev.leo.airports.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "airport")
public class Airport {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;

 private String name;
 private String city;
 private String country;

 @Column(name = "iatacode")
 private String iataCode;

 @Column(name = "icaocode")
 private String icaoCode;

 private double latitude;
 private double longitude;
 private double altitude;

 @Column(name = "offsetutc")
 private double offsetFromUTC;

 @Column(name = "dstcode")
 private String dstCode;
 private String timezone;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getIataCode() {
        return iataCode;
    }

    public String getIcaoCode() {
        return icaoCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public double getOffsetFromUTC() {
        return offsetFromUTC;
    }

    public String getDstCode() {
        return dstCode;
    }

    public String getTimezone() {
        return timezone;
    }
 
 
} 