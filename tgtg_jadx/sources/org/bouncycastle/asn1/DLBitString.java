package org.bouncycastle.asn1;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class DLBitString extends ASN1BitString {
    public DLBitString(ASN1Encodable aSN1Encodable) throws IOException {
        super(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER), 0);
    }

    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z11, byte b8, byte[] bArr, int i11, int i12) throws IOException {
        aSN1OutputStream.writeEncodingDL(z11, 3, b8, bArr, i11, i12);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z11) {
        return ASN1OutputStream.getLengthOfEncodingDL(z11, this.contents.length);
    }

    public static int encodedLength(boolean z11, int i11) {
        return ASN1OutputStream.getLengthOfEncodingDL(z11, i11);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        aSN1OutputStream.writeEncodingDL(z11, 3, this.contents);
    }

    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z11, byte[] bArr, int i11, int i12) throws IOException {
        aSN1OutputStream.writeEncodingDL(z11, 3, bArr, i11, i12);
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }

    public DLBitString(int i11) {
        super(ASN1BitString.getBytes(i11), ASN1BitString.getPadBits(i11));
    }

    public DLBitString(byte b8, int i11) {
        super(b8, i11);
    }

    public DLBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DLBitString(byte[] bArr, int i11) {
        super(bArr, i11);
    }

    public DLBitString(byte[] bArr, boolean z11) {
        super(bArr, z11);
    }
}
