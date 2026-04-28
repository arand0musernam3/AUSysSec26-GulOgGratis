package org.bouncycastle.pqc.crypto.mlkem;

import org.bouncycastle.pqc.crypto.KEMParameters;

/* JADX INFO: loaded from: classes3.dex */
public class MLKEMParameters implements KEMParameters {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f33551k;
    private final String name;
    private final int sessionKeySize;
    public static final MLKEMParameters ml_kem_512 = new MLKEMParameters("ML-KEM-512", 2, 256);
    public static final MLKEMParameters ml_kem_768 = new MLKEMParameters("ML-KEM-768", 3, 256);
    public static final MLKEMParameters ml_kem_1024 = new MLKEMParameters("ML-KEM-1024", 4, 256);

    private MLKEMParameters(String str, int i11, int i12) {
        this.name = str;
        this.f33551k = i11;
        this.sessionKeySize = i12;
    }

    public MLKEMEngine getEngine() {
        return new MLKEMEngine(this.f33551k);
    }

    public String getName() {
        return this.name;
    }

    public int getSessionKeySize() {
        return this.sessionKeySize;
    }
}
