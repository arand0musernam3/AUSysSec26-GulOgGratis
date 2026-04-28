package org.bouncycastle.jcajce.spec;

import i4.a;
import java.security.spec.EncodedKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public class OpenSSHPrivateKeySpec extends EncodedKeySpec {
    private final String format;

    public OpenSSHPrivateKeySpec(byte[] bArr) {
        String str;
        super(bArr);
        byte b8 = bArr[0];
        if (b8 == 48) {
            str = "ASN.1";
        } else {
            if (b8 != 111) {
                a.f("unknown byte encoding");
                throw null;
            }
            str = "OpenSSH";
        }
        this.format = str;
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return this.format;
    }
}
