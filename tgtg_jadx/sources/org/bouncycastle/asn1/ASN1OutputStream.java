package org.bouncycastle.asn1;

import i4.a;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1OutputStream {

    /* JADX INFO: renamed from: os, reason: collision with root package name */
    private OutputStream f32960os;

    public ASN1OutputStream(OutputStream outputStream) {
        this.f32960os = outputStream;
    }

    public static ASN1OutputStream create(OutputStream outputStream, String str) {
        return str.equals(ASN1Encoding.DER) ? new DEROutputStream(outputStream) : str.equals(ASN1Encoding.DL) ? new DLOutputStream(outputStream) : new ASN1OutputStream(outputStream);
    }

    public static int getLengthOfDL(int i11) {
        if (i11 < 128) {
            return 1;
        }
        int i12 = 2;
        while (true) {
            i11 >>>= 8;
            if (i11 == 0) {
                return i12;
            }
            i12++;
        }
    }

    public static int getLengthOfEncodingDL(boolean z11, int i11) {
        return getLengthOfDL(i11) + (z11 ? 1 : 0) + i11;
    }

    public static int getLengthOfIdentifier(int i11) {
        if (i11 < 31) {
            return 1;
        }
        int i12 = 2;
        while (true) {
            i11 >>>= 7;
            if (i11 == 0) {
                return i12;
            }
            i12++;
        }
    }

    public void close() throws IOException {
        this.f32960os.close();
    }

    public void flush() throws IOException {
        this.f32960os.flush();
    }

    public DEROutputStream getDERSubStream() {
        return new DEROutputStream(this.f32960os);
    }

    public DLOutputStream getDLSubStream() {
        return new DLOutputStream(this.f32960os);
    }

    public final void write(int i11) throws IOException {
        this.f32960os.write(i11);
    }

    public final void writeDL(int i11) throws IOException {
        if (i11 < 128) {
            write(i11);
            return;
        }
        int i12 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i13 = i12 - 1;
            bArr[i13] = (byte) i11;
            i11 >>>= 8;
            if (i11 == 0) {
                int i14 = i12 - 2;
                bArr[i14] = (byte) ((5 - i13) | 128);
                write(bArr, i14, 6 - i13);
                return;
            }
            i12 = i13;
        }
    }

    public void writeElements(ASN1Encodable[] aSN1EncodableArr) throws IOException {
        for (ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            aSN1Encodable.toASN1Primitive().encode(this, true);
        }
    }

    public final void writeEncodingDL(boolean z11, int i11, byte b8, byte[] bArr, int i12, int i13) throws IOException {
        writeIdentifier(z11, i11);
        writeDL(i13 + 1);
        write(b8);
        write(bArr, i12, i13);
    }

    public final void writeEncodingIL(boolean z11, int i11, ASN1Encodable[] aSN1EncodableArr) throws IOException {
        writeIdentifier(z11, i11);
        write(128);
        writeElements(aSN1EncodableArr);
        write(0);
        write(0);
    }

    public final void writeIdentifier(boolean z11, int i11, int i12) throws IOException {
        if (z11) {
            if (i12 < 31) {
                write(i11 | i12);
                return;
            }
            byte[] bArr = new byte[6];
            int i13 = 5;
            bArr[5] = (byte) (i12 & 127);
            while (i12 > 127) {
                i12 >>>= 7;
                i13--;
                bArr[i13] = (byte) ((i12 & 127) | 128);
            }
            int i14 = i13 - 1;
            bArr[i14] = (byte) (31 | i11);
            write(bArr, i14, 6 - i14);
        }
    }

    public final void writeObject(ASN1Encodable aSN1Encodable) throws IOException {
        if (aSN1Encodable == null) {
            a.k("null object detected");
        } else {
            writePrimitive(aSN1Encodable.toASN1Primitive(), true);
            flushInternal();
        }
    }

    public void writePrimitive(ASN1Primitive aSN1Primitive, boolean z11) throws IOException {
        aSN1Primitive.encode(this, z11);
    }

    public void writePrimitives(ASN1Primitive[] aSN1PrimitiveArr) throws IOException {
        for (ASN1Primitive aSN1Primitive : aSN1PrimitiveArr) {
            aSN1Primitive.encode(this, true);
        }
    }

    public final void write(byte[] bArr, int i11, int i12) throws IOException {
        this.f32960os.write(bArr, i11, i12);
    }

    public void flushInternal() throws IOException {
    }

    public final void writeEncodingDL(boolean z11, int i11, byte b8) throws IOException {
        writeIdentifier(z11, i11);
        writeDL(1);
        write(b8);
    }

    public final void writeEncodingDL(boolean z11, int i11, int i12, byte[] bArr) throws IOException {
        writeIdentifier(z11, i11, i12);
        writeDL(bArr.length);
        write(bArr, 0, bArr.length);
    }

    public final void writeEncodingDL(boolean z11, int i11, byte[] bArr) throws IOException {
        writeIdentifier(z11, i11);
        writeDL(bArr.length);
        write(bArr, 0, bArr.length);
    }

    public final void writeEncodingDL(boolean z11, int i11, byte[] bArr, int i12, int i13) throws IOException {
        writeIdentifier(z11, i11);
        writeDL(i13);
        write(bArr, i12, i13);
    }

    public final void writeEncodingDL(boolean z11, int i11, byte[] bArr, int i12, int i13, byte b8) throws IOException {
        writeIdentifier(z11, i11);
        writeDL(i13 + 1);
        write(bArr, i12, i13);
        write(b8);
    }

    public final void writeObject(ASN1Primitive aSN1Primitive) throws IOException {
        if (aSN1Primitive == null) {
            a.k("null object detected");
        } else {
            writePrimitive(aSN1Primitive, true);
            flushInternal();
        }
    }

    public static ASN1OutputStream create(OutputStream outputStream) {
        return new ASN1OutputStream(outputStream);
    }

    public final void writeIdentifier(boolean z11, int i11) throws IOException {
        if (z11) {
            write(i11);
        }
    }
}
