package org.bouncycastle.asn1;

import com.braze.h2;
import j4.s;
import java.io.IOException;
import java.io.InputStream;
import wy.o;

/* JADX INFO: loaded from: classes3.dex */
public class DLBitStringParser implements ASN1BitStringParser {
    private int padBits = 0;
    private final DefiniteLengthInputStream stream;

    public DLBitStringParser(DefiniteLengthInputStream definiteLengthInputStream) {
        this.stream = definiteLengthInputStream;
    }

    private InputStream getBitStream(boolean z11) throws IOException {
        String str;
        int remaining = this.stream.getRemaining();
        if (remaining >= 1) {
            int i11 = this.stream.read();
            this.padBits = i11;
            if (i11 > 0) {
                if (remaining < 2) {
                    str = "zero length data with non-zero pad bits";
                } else if (i11 > 7) {
                    str = "pad bits cannot be greater than 7 or less than 0";
                } else if (z11) {
                    o.e(this.padBits, "expected octet-aligned bitstring, but found padBits: ");
                    return null;
                }
            }
            return this.stream;
        }
        str = "content octets cannot be empty";
        h2.b(str);
        return null;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() throws IOException {
        return ASN1BitString.createPrimitive(this.stream.toByteArray());
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getOctetStream() throws IOException {
        return getBitStream(true);
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public int getPadBits() {
        return this.padBits;
    }

    @Override // org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        try {
            return getLoadedObject();
        } catch (IOException e5) {
            throw new ASN1ParsingException(s.g(e5, new StringBuilder("IOException converting stream to byte array: ")), e5);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getBitStream() throws IOException {
        return getBitStream(false);
    }
}
