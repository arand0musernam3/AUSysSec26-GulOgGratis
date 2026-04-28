package org.bouncycastle.jcajce.spec;

import c50.w;
import i4.a;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes3.dex */
public class MLKEMParameterSpec implements AlgorithmParameterSpec {
    public static final MLKEMParameterSpec ml_kem_1024;
    public static final MLKEMParameterSpec ml_kem_512;
    public static final MLKEMParameterSpec ml_kem_768;
    private static Map parameters;
    private final String name;

    static {
        MLKEMParameterSpec mLKEMParameterSpec = new MLKEMParameterSpec("ML-KEM-512");
        ml_kem_512 = mLKEMParameterSpec;
        MLKEMParameterSpec mLKEMParameterSpec2 = new MLKEMParameterSpec("ML-KEM-768");
        ml_kem_768 = mLKEMParameterSpec2;
        MLKEMParameterSpec mLKEMParameterSpec3 = new MLKEMParameterSpec("ML-KEM-1024");
        ml_kem_1024 = mLKEMParameterSpec3;
        HashMap map = new HashMap();
        parameters = map;
        map.put("ml-kem-512", mLKEMParameterSpec);
        parameters.put("ml-kem-768", mLKEMParameterSpec2);
        parameters.put("ml-kem-1024", mLKEMParameterSpec3);
        parameters.put("kyber512", mLKEMParameterSpec);
        parameters.put("kyber768", mLKEMParameterSpec2);
        parameters.put("kyber1024", mLKEMParameterSpec3);
    }

    private MLKEMParameterSpec(String str) {
        this.name = str;
    }

    public static MLKEMParameterSpec fromName(String str) {
        if (str == null) {
            w.l("name cannot be null");
            return null;
        }
        MLKEMParameterSpec mLKEMParameterSpec = (MLKEMParameterSpec) parameters.get(Strings.toLowerCase(str));
        if (mLKEMParameterSpec != null) {
            return mLKEMParameterSpec;
        }
        a.f("unknown parameter name: ".concat(str));
        return null;
    }

    public String getName() {
        return this.name;
    }
}
