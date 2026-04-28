package org.bouncycastle.crypto.constraints;

import java.math.BigInteger;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.math.ec.ECCurve;

/* JADX INFO: loaded from: classes3.dex */
public class ConstraintUtils {
    public static int bitsOfSecurityFor(ECCurve eCCurve) {
        int fieldSize = (eCCurve.getFieldSize() + 1) / 2;
        if (fieldSize > 256) {
            return 256;
        }
        return fieldSize;
    }

    public static int bitsOfSecurityForFF(int i11) {
        if (i11 < 2048) {
            return i11 >= 1024 ? 80 : 20;
        }
        if (i11 < 3072) {
            return 112;
        }
        if (i11 < 7680) {
            return 128;
        }
        if (i11 >= 15360) {
            return 256;
        }
        return BERTags.PRIVATE;
    }

    public static int bitsOfSecurityFor(BigInteger bigInteger) {
        return bitsOfSecurityForFF(bigInteger.bitLength());
    }
}
