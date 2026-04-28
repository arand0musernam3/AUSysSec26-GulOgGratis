package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class DEROctetString extends ASN1OctetString {
    public DEROctetString(ASN1Encodable aSN1Encodable) throws IOException {
        super(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER));
    }

    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z11, byte[] bArr, int i11, int i12) throws IOException {
        aSN1OutputStream.writeEncodingDL(z11, 4, bArr, i11, i12);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z11) {
        return ASN1OutputStream.getLengthOfEncodingDL(z11, this.string.length);
    }

    public static int encodedLength(boolean z11, int i11) {
        return ASN1OutputStream.getLengthOfEncodingDL(z11, i11);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        aSN1OutputStream.writeEncodingDL(z11, 4, this.string);
    }

    public DEROctetString(byte[] bArr) {
        super(bArr);
    }

    @Override // org.bouncycastle.asn1.ASN1OctetString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1OctetString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }
}
