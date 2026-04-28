package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class BERSet extends ASN1Set {
    public BERSet(ASN1EncodableVector aSN1EncodableVector) {
        super(aSN1EncodableVector, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        aSN1OutputStream.writeEncodingIL(z11, 49, this.elements);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z11) throws IOException {
        int iEncodedLength = z11 ? 4 : 3;
        int length = this.elements.length;
        for (int i11 = 0; i11 < length; i11++) {
            iEncodedLength += this.elements[i11].toASN1Primitive().encodedLength(true);
        }
        return iEncodedLength;
    }

    public BERSet(ASN1Encodable aSN1Encodable) {
        super(aSN1Encodable);
    }

    public BERSet() {
    }

    public BERSet(boolean z11, ASN1Encodable[] aSN1EncodableArr) {
        super(z11, aSN1EncodableArr);
    }

    public BERSet(ASN1Encodable[] aSN1EncodableArr) {
        super(aSN1EncodableArr, false);
    }
}
