package org.bouncycastle.asn1;

import c50.w;
import e0.f;
import i4.a;
import j4.s;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.internal.ByteCompanionObject;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Properties;
import r8.k;
import w.a0;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1RelativeOID extends ASN1Primitive {
    private static final long LONG_LIMIT = 72057594037927808L;
    private static final int MAX_CONTENTS_LENGTH = 4096;
    private static final int MAX_IDENTIFIER_LENGTH = 16383;
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1RelativeOID.class, 13) { // from class: org.bouncycastle.asn1.ASN1RelativeOID.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1RelativeOID.createPrimitive(dEROctetString.getOctets(), false);
        }
    };
    private static final ConcurrentMap<ASN1ObjectIdentifier.OidHandle, ASN1RelativeOID> pool = new ConcurrentHashMap();
    private final byte[] contents;
    private String identifier;

    public ASN1RelativeOID(String str) {
        checkIdentifier(str);
        byte[] identifier = parseIdentifier(str);
        checkContentsLength(identifier.length);
        this.contents = identifier;
        this.identifier = str;
    }

    public static void checkContentsLength(int i11) {
        if (i11 <= MAX_CONTENTS_LENGTH) {
            return;
        }
        a.f("exceeded relative OID contents length limit");
    }

    public static void checkIdentifier(String str) {
        if (str == null) {
            w.l("'identifier' cannot be null");
        } else if (str.length() > MAX_IDENTIFIER_LENGTH) {
            a.f("exceeded relative OID contents length limit");
        } else {
            if (isValidIdentifier(str, 0)) {
                return;
            }
            a.f(a0.p("string ", str, " not a valid relative OID"));
        }
    }

    public static ASN1RelativeOID createPrimitive(byte[] bArr, boolean z11) {
        checkContentsLength(bArr.length);
        ASN1RelativeOID aSN1RelativeOID = pool.get(new ASN1ObjectIdentifier.OidHandle(bArr));
        if (aSN1RelativeOID != null) {
            return aSN1RelativeOID;
        }
        if (!isValidContents(bArr)) {
            a.f("invalid relative OID contents");
            return null;
        }
        if (z11) {
            bArr = Arrays.clone(bArr);
        }
        return new ASN1RelativeOID(bArr, null);
    }

    public static ASN1RelativeOID fromContents(byte[] bArr) {
        if (bArr != null) {
            return createPrimitive(bArr, true);
        }
        w.l("'contents' cannot be null");
        return null;
    }

    public static ASN1RelativeOID getInstance(Object obj) {
        String strG;
        if (obj == null || (obj instanceof ASN1RelativeOID)) {
            return (ASN1RelativeOID) obj;
        }
        if (!(obj instanceof ASN1Encodable)) {
            if (obj instanceof byte[]) {
                try {
                    return (ASN1RelativeOID) TYPE.fromByteArray((byte[]) obj);
                } catch (IOException e5) {
                    strG = s.g(e5, new StringBuilder("failed to construct relative OID from byte[]: "));
                }
            }
            a.f(strG);
            return null;
        }
        ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
        if (aSN1Primitive instanceof ASN1RelativeOID) {
            return (ASN1RelativeOID) aSN1Primitive;
        }
        strG = f.j(obj, "illegal object in getInstance: ");
        a.f(strG);
        return null;
    }

    public static boolean isValidContents(byte[] bArr) {
        if (Properties.isOverrideSet("org.bouncycastle.asn1.allow_wrong_oid_enc")) {
            return true;
        }
        if (bArr.length < 1) {
            return false;
        }
        boolean z11 = true;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (z11 && (bArr[i11] & 255) == 128) {
                return false;
            }
            z11 = (bArr[i11] & ByteCompanionObject.MIN_VALUE) == 0;
        }
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isValidIdentifier(java.lang.String r8, int r9) {
        /*
            int r0 = r8.length()
            r1 = 0
            r2 = r1
        L6:
            int r3 = r0 + (-1)
            r4 = 48
            r5 = 1
            if (r3 < r9) goto L2e
            char r6 = r8.charAt(r3)
            r7 = 46
            if (r6 != r7) goto L23
            if (r2 == 0) goto L22
            if (r2 <= r5) goto L20
            char r0 = r8.charAt(r0)
            if (r0 != r4) goto L20
            goto L22
        L20:
            r2 = r1
            goto L2b
        L22:
            return r1
        L23:
            if (r4 > r6) goto L2d
            r0 = 57
            if (r6 > r0) goto L2d
            int r2 = r2 + 1
        L2b:
            r0 = r3
            goto L6
        L2d:
            return r1
        L2e:
            if (r2 == 0) goto L3a
            if (r2 <= r5) goto L39
            char r8 = r8.charAt(r0)
            if (r8 != r4) goto L39
            goto L3a
        L39:
            return r5
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.ASN1RelativeOID.isValidIdentifier(java.lang.String, int):boolean");
    }

    public static String parseContents(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = true;
        BigInteger bigIntegerShiftLeft = null;
        long j9 = 0;
        for (int i11 = 0; i11 != bArr.length; i11++) {
            byte b8 = bArr[i11];
            if (j9 <= LONG_LIMIT) {
                long j11 = j9 + ((long) (b8 & ByteCompanionObject.MAX_VALUE));
                if ((b8 & ByteCompanionObject.MIN_VALUE) == 0) {
                    if (z11) {
                        z11 = false;
                    } else {
                        sb2.append('.');
                    }
                    sb2.append(j11);
                    j9 = 0;
                } else {
                    j9 = j11 << 7;
                }
            } else {
                if (bigIntegerShiftLeft == null) {
                    bigIntegerShiftLeft = BigInteger.valueOf(j9);
                }
                BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(b8 & ByteCompanionObject.MAX_VALUE));
                if ((b8 & ByteCompanionObject.MIN_VALUE) == 0) {
                    if (z11) {
                        z11 = false;
                    } else {
                        sb2.append('.');
                    }
                    sb2.append(bigIntegerOr);
                    bigIntegerShiftLeft = null;
                    j9 = 0;
                } else {
                    bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                }
            }
        }
        return sb2.toString();
    }

    public static byte[] parseIdentifier(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OIDTokenizer oIDTokenizer = new OIDTokenizer(str);
        while (oIDTokenizer.hasMoreTokens()) {
            String strNextToken = oIDTokenizer.nextToken();
            if (strNextToken.length() <= 18) {
                writeField(byteArrayOutputStream, Long.parseLong(strNextToken));
            } else {
                writeField(byteArrayOutputStream, new BigInteger(strNextToken));
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static ASN1RelativeOID tryFromID(String str) {
        if (str == null) {
            w.l("'identifier' cannot be null");
            return null;
        }
        if (str.length() > MAX_IDENTIFIER_LENGTH || !isValidIdentifier(str, 0)) {
            return null;
        }
        byte[] identifier = parseIdentifier(str);
        if (identifier.length <= MAX_CONTENTS_LENGTH) {
            return new ASN1RelativeOID(identifier, str);
        }
        return null;
    }

    public static void writeField(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int iBitLength = (bigInteger.bitLength() + 6) / 7;
        if (iBitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[iBitLength];
        int i11 = iBitLength - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            bArr[i12] = (byte) (bigInteger.intValue() | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i11] = (byte) (bArr[i11] & ByteCompanionObject.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, iBitLength);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (this == aSN1Primitive) {
            return true;
        }
        if (aSN1Primitive instanceof ASN1RelativeOID) {
            return Arrays.areEqual(this.contents, ((ASN1RelativeOID) aSN1Primitive).contents);
        }
        return false;
    }

    public ASN1RelativeOID branch(String str) {
        byte[] bArrConcatenate;
        checkIdentifier(str);
        if (str.length() <= 2) {
            checkContentsLength(this.contents.length + 1);
            int iCharAt = str.charAt(0) - '0';
            if (str.length() == 2) {
                iCharAt = (iCharAt * 10) + (str.charAt(1) - '0');
            }
            bArrConcatenate = Arrays.append(this.contents, (byte) iCharAt);
        } else {
            byte[] identifier = parseIdentifier(str);
            checkContentsLength(this.contents.length + identifier.length);
            bArrConcatenate = Arrays.concatenate(this.contents, identifier);
        }
        return new ASN1RelativeOID(bArrConcatenate, k.m(getId(), ".", str));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z11) throws IOException {
        aSN1OutputStream.writeEncodingDL(z11, 13, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z11) {
        return ASN1OutputStream.getLengthOfEncodingDL(z11, this.contents.length);
    }

    public synchronized String getId() {
        try {
            if (this.identifier == null) {
                this.identifier = parseContents(this.contents);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.identifier;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public String toString() {
        return getId();
    }

    private ASN1RelativeOID(byte[] bArr, String str) {
        this.contents = bArr;
        this.identifier = str;
    }

    public static void writeField(ByteArrayOutputStream byteArrayOutputStream, long j9) {
        byte[] bArr = new byte[9];
        int i11 = 8;
        bArr[8] = (byte) (((int) j9) & 127);
        while (j9 >= 128) {
            j9 >>= 7;
            i11--;
            bArr[i11] = (byte) (((int) j9) | 128);
        }
        byteArrayOutputStream.write(bArr, i11, 9 - i11);
    }

    public static ASN1RelativeOID getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return (ASN1RelativeOID) TYPE.getContextInstance(aSN1TaggedObject, z11);
    }
}
