package org.bouncycastle.asn1;

import c50.w;
import com.braze.h2;
import e0.f;
import i4.a;
import j4.s;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ASN1BitString extends ASN1Primitive implements ASN1String, ASN1BitStringParser {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1BitString.class, 3) { // from class: org.bouncycastle.asn1.ASN1BitString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitConstructed(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.toASN1BitString();
        }

        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1BitString.createPrimitive(dEROctetString.getOctets());
        }
    };
    private static final char[] table = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final byte[] contents;

    public ASN1BitString(byte[] bArr, boolean z11) {
        if (z11) {
            if (bArr == null) {
                w.l("'contents' cannot be null");
                throw null;
            }
            if (bArr.length < 1) {
                a.f("'contents' cannot be empty");
                throw null;
            }
            int i11 = bArr[0] & 255;
            if (i11 > 0) {
                if (bArr.length < 2) {
                    a.f("zero length data with non-zero pad bits");
                    throw null;
                }
                if (i11 > 7) {
                    a.f("pad bits cannot be greater than 7 or less than 0");
                    throw null;
                }
            }
        }
        this.contents = bArr;
    }

    public static ASN1BitString createPrimitive(byte[] bArr) {
        String str;
        int length = bArr.length;
        if (length >= 1) {
            int i11 = bArr[0] & 255;
            if (i11 > 0) {
                if (i11 > 7 || length < 2) {
                    str = "invalid pad bits detected";
                } else {
                    byte b8 = bArr[length - 1];
                    if (b8 != ((byte) ((255 << i11) & b8))) {
                        return new DLBitString(bArr, false);
                    }
                }
            }
            return new DERBitString(bArr, false);
        }
        str = "truncated BIT STRING detected";
        a.f(str);
        return null;
    }

    public static byte[] getBytes(int i11) {
        if (i11 == 0) {
            return new byte[0];
        }
        int i12 = 4;
        for (int i13 = 3; i13 >= 1 && ((255 << (i13 * 8)) & i11) == 0; i13--) {
            i12--;
        }
        byte[] bArr = new byte[i12];
        for (int i14 = 0; i14 < i12; i14++) {
            bArr[i14] = (byte) ((i11 >> (i14 * 8)) & 255);
        }
        return bArr;
    }

    public static ASN1BitString getInstance(Object obj) {
        String strG;
        if (obj == null || (obj instanceof ASN1BitString)) {
            return (ASN1BitString) obj;
        }
        if (!(obj instanceof ASN1Encodable)) {
            if (obj instanceof byte[]) {
                try {
                    return (ASN1BitString) TYPE.fromByteArray((byte[]) obj);
                } catch (IOException e5) {
                    strG = s.g(e5, new StringBuilder("failed to construct BIT STRING from byte[]: "));
                }
            }
            a.f(strG);
            return null;
        }
        ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
        if (aSN1Primitive instanceof ASN1BitString) {
            return (ASN1BitString) aSN1Primitive;
        }
        strG = f.j(obj, "illegal object in getInstance: ");
        a.f(strG);
        return null;
    }

    public static int getPadBits(int i11) {
        int i12;
        int i13 = 3;
        while (true) {
            if (i13 < 0) {
                i12 = 0;
                break;
            }
            if (i13 != 0) {
                int i14 = i11 >> (i13 * 8);
                if (i14 != 0) {
                    i12 = i14 & 255;
                    break;
                }
                i13--;
            } else {
                if (i11 != 0) {
                    i12 = i11 & 255;
                    break;
                }
                i13--;
            }
        }
        if (i12 == 0) {
            return 0;
        }
        int i15 = 1;
        while (true) {
            i12 <<= 1;
            if ((i12 & 255) == 0) {
                return 8 - i15;
            }
            i15++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1BitString)) {
            return false;
        }
        byte[] bArr = this.contents;
        byte[] bArr2 = ((ASN1BitString) aSN1Primitive).contents;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i11 = length - 1;
        for (int i12 = 0; i12 < i11; i12++) {
            if (bArr[i12] != bArr2[i12]) {
                return false;
            }
        }
        int i13 = 255 << (bArr[0] & 255);
        return ((byte) (bArr[i11] & i13)) == ((byte) (bArr2[i11] & i13));
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getBitStream() throws IOException {
        byte[] bArr = this.contents;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    public int getBytesLength() {
        return this.contents.length - 1;
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getOctetStream() throws IOException {
        int i11 = this.contents[0] & 255;
        if (i11 == 0) {
            return getBitStream();
        }
        a.k(s.f(i11, "expected octet-aligned bitstring, but found padBits: "));
        return null;
    }

    public byte[] getOctets() {
        byte[] bArr = this.contents;
        if (bArr[0] == 0) {
            return Arrays.copyOfRange(bArr, 1, bArr.length);
        }
        h2.b("attempt to get non-octet aligned data from BIT STRING");
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        try {
            byte[] encoded = getEncoded();
            StringBuffer stringBuffer = new StringBuffer((encoded.length * 2) + 1);
            stringBuffer.append('#');
            for (int i11 = 0; i11 != encoded.length; i11++) {
                byte b8 = encoded[i11];
                char[] cArr = table;
                stringBuffer.append(cArr[(b8 >>> 4) & 15]);
                stringBuffer.append(cArr[b8 & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e5) {
            throw new ASN1ParsingException(s.g(e5, new StringBuilder("Internal error encoding BitString: ")), e5);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        byte[] bArr = this.contents;
        if (bArr.length < 2) {
            return 1;
        }
        int i11 = bArr[0] & 255;
        int length = bArr.length - 1;
        return (Arrays.hashCode(bArr, 0, length) * 257) ^ ((byte) ((255 << i11) & bArr[length]));
    }

    public int intValue() {
        int iMin = Math.min(5, this.contents.length - 1);
        int i11 = 0;
        for (int i12 = 1; i12 < iMin; i12++) {
            i11 |= (255 & this.contents[i12]) << ((i12 - 1) * 8);
        }
        if (1 > iMin || iMin >= 5) {
            return i11;
        }
        byte[] bArr = this.contents;
        return ((((byte) (bArr[iMin] & (255 << (bArr[0] & 255)))) & 255) << ((iMin - 1) * 8)) | i11;
    }

    public boolean isOctetAligned() {
        return getPadBits() == 0;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERBitString(this.contents, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLBitString(this.contents, false);
    }

    public String toString() {
        return getString();
    }

    public ASN1BitStringParser parser() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public int getPadBits() {
        return this.contents[0] & 255;
    }

    public byte[] getBytes() {
        byte[] bArr = this.contents;
        if (bArr.length == 1) {
            return ASN1OctetString.EMPTY_OCTETS;
        }
        int i11 = bArr[0] & 255;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 1, bArr.length);
        int length = bArrCopyOfRange.length - 1;
        bArrCopyOfRange[length] = (byte) (((byte) (255 << i11)) & bArrCopyOfRange[length]);
        return bArrCopyOfRange;
    }

    public ASN1BitString(byte[] bArr, int i11) {
        if (bArr == null) {
            w.l("'data' cannot be null");
            throw null;
        }
        if (bArr.length == 0 && i11 != 0) {
            a.f("zero length data with non-zero pad bits");
            throw null;
        }
        if (i11 > 7 || i11 < 0) {
            a.f("pad bits cannot be greater than 7 or less than 0");
            throw null;
        }
        this.contents = Arrays.prepend(bArr, (byte) i11);
    }

    public ASN1BitString(byte b8, int i11) {
        if (i11 > 7 || i11 < 0) {
            a.f("pad bits cannot be greater than 7 or less than 0");
            throw null;
        }
        this.contents = new byte[]{(byte) i11, b8};
    }

    public static ASN1BitString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return (ASN1BitString) TYPE.getContextInstance(aSN1TaggedObject, z11);
    }
}
