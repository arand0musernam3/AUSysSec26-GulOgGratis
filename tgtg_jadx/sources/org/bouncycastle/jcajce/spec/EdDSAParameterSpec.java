package org.bouncycastle.jcajce.spec;

import i4.a;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.internal.asn1.edec.EdECObjectIdentifiers;

/* JADX INFO: loaded from: classes3.dex */
public class EdDSAParameterSpec implements AlgorithmParameterSpec {
    public static final String Ed25519 = "Ed25519";
    public static final String Ed448 = "Ed448";
    private final String curveName;

    public EdDSAParameterSpec(String str) {
        if (str.equalsIgnoreCase(Ed25519)) {
            this.curveName = Ed25519;
            return;
        }
        if (str.equalsIgnoreCase(Ed448)) {
            this.curveName = Ed448;
            return;
        }
        if (str.equals(EdECObjectIdentifiers.id_Ed25519.getId())) {
            this.curveName = Ed25519;
        } else if (str.equals(EdECObjectIdentifiers.id_Ed448.getId())) {
            this.curveName = Ed448;
        } else {
            a.f("unrecognized curve name: ".concat(str));
            throw null;
        }
    }

    public String getCurveName() {
        return this.curveName;
    }
}
