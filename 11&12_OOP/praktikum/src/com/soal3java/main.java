package com.soal3java;

import com.soal1java.car;

public class main {
    public static void main(String[] args) {
        vehicles ve = new vehicles();
        ve.setName("Gerobak");
        ve.setWith_engine("No engine");
        ve.identity_myself();

        bikes bk = new bikes();
        bk.setName("pedal bikes");
        bk.setWith_engine("no engine");
        bk.setWheel_count(2);
        bk.identity_myself();

        bk.setName("motor bikes");
        bk.setWith_engine("with engine");
        bk.setWheel_count(2);
        bk.identity_myself();

        cars ca = new cars();
        ca.setName("sports cars");
        ca.setWith_engine("with engine");
        ca.setWheel_count(4);
        ca.setEngine_type("V8");
        ca.identity_myself();

        ca.setName("pickup cars");
        ca.setWith_engine("with engine");
        ca.setWheel_count(4);
        ca.setEngine_type("solar");
        ca.identity_myself();

        buses bu = new buses();
        bu.setPrivate_bus("public bus");
        bu.setName("Trans Jakarta");
        bu.setWith_engine("with_engine");
        bu.setWheel_count(4);
        bu.identity_myself();

        bu.setPrivate_bus("private bus");
        bu.setName("School Bus");
        bu.setWith_engine("with engine");
        bu.setWheel_count(4);
        bu.identity_myself();
    }
}
