package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class DERBitString extends ASN1BitString {
    public DERBitString(ASN1Encodable aSN1Encodable) throws IOException {
        super(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER), 0);
    }

    public static DERBitString convert(ASN1BitString aSN1BitString) {
        return (DERBitString) aSN1BitString.toDERObject();
    }

    public static DERBitString fromOctetString(ASN1OctetString aSN1OctetString) {
        return new DERBitString(aSN1OctetString.getOctets(), true);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        byte[] bArr = this.contents;
        int i11 = bArr[0] & 255;
        int length = bArr.length - 1;
        byte b8 = bArr[length];
        byte b11 = (byte) ((255 << i11) & b8);
        if (b8 == b11) {
            aSN1OutputStream.writeEncodingDL(z11, 3, bArr);
        } else {
            aSN1OutputStream.writeEncodingDL(z11, 3, bArr, 0, length, b11);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z11) {
        return ASN1OutputStream.getLengthOfEncodingDL(z11, this.contents.length);
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }

    public DERBitString(int i11) {
        super(ASN1BitString.getBytes(i11), ASN1BitString.getPadBits(i11));
    }

    public DERBitString(byte b8, int i11) {
        super(b8, i11);
    }

    public DERBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DERBitString(byte[] bArr, int i11) {
        super(bArr, i11);
    }

    public DERBitString(byte[] bArr, boolean z11) {
        super(bArr, z11);
    }
}
