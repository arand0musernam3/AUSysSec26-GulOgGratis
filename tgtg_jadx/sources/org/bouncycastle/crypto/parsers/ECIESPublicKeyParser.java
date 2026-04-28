package org.bouncycastle.crypto.parsers;

import i4.a;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.util.io.Streams;
import wy.o;

/* JADX INFO: loaded from: classes3.dex */
public class ECIESPublicKeyParser implements KeyParser {
    private ECDomainParameters ecParams;

    public ECIESPublicKeyParser(ECDomainParameters eCDomainParameters) {
        this.ecParams = eCDomainParameters;
    }

    @Override // org.bouncycastle.crypto.KeyParser
    public AsymmetricKeyParameter readKey(InputStream inputStream) throws IOException {
        boolean z11;
        int i11 = inputStream.read();
        if (i11 < 0) {
            a.b();
            return null;
        }
        if (i11 == 0) {
            a.k("Sender's public key invalid.");
            return null;
        }
        if (i11 == 2 || i11 == 3) {
            z11 = true;
        } else {
            if (i11 != 4 && i11 != 6 && i11 != 7) {
                o.o(Integer.toString(i11, 16), "Sender's public key has invalid point encoding 0x");
                return null;
            }
            z11 = false;
        }
        ECCurve curve = this.ecParams.getCurve();
        int affinePointEncodingLength = curve.getAffinePointEncodingLength(z11);
        byte[] bArr = new byte[affinePointEncodingLength];
        bArr[0] = (byte) i11;
        int i12 = affinePointEncodingLength - 1;
        if (Streams.readFully(inputStream, bArr, 1, i12) == i12) {
            return new ECPublicKeyParameters(curve.decodePoint(bArr), this.ecParams);
        }
        a.b();
        return null;
    }
}
