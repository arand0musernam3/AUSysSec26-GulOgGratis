package org.bouncycastle.jcajce.spec;

import i4.a;
import j4.d;
import java.security.spec.EncodedKeySpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes3.dex */
public class OpenSSHPublicKeySpec extends EncodedKeySpec {
    private static final String[] allowedTypes = {"ssh-rsa", "ssh-ed25519", "ssh-dss"};
    private final String type;

    public OpenSSHPublicKeySpec(byte[] bArr) {
        super(bArr);
        int i11 = 0;
        int i12 = (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) + 4;
        if (i12 >= bArr.length) {
            a.f("invalid public key blob: type field longer than blob");
            throw null;
        }
        String strFromByteArray = Strings.fromByteArray(Arrays.copyOfRange(bArr, 4, i12));
        this.type = strFromByteArray;
        if (strFromByteArray.startsWith("ecdsa")) {
            return;
        }
        while (true) {
            String[] strArr = allowedTypes;
            if (i11 >= strArr.length) {
                d.t(this.type, "unrecognised public key type ");
                throw null;
            }
            if (strArr[i11].equals(this.type)) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return "OpenSSH";
    }

    public String getType() {
        return this.type;
    }
}
