package org.bouncycastle.pqc.crypto.lms;

import i4.a;
import j4.s;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes3.dex */
class LMSSignature implements Encodable {
    private final LMOtsSignature otsSignature;
    private final LMSigParameters parameter;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f33530q;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final byte[][] f33531y;

    public LMSSignature(int i11, LMOtsSignature lMOtsSignature, LMSigParameters lMSigParameters, byte[][] bArr) {
        this.f33530q = i11;
        this.otsSignature = lMOtsSignature;
        this.parameter = lMSigParameters;
        this.f33531y = bArr;
    }

    public static LMSSignature getInstance(Object obj) throws Throwable {
        if (obj instanceof LMSSignature) {
            return (LMSSignature) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            int i11 = dataInputStream.readInt();
            LMOtsSignature lMOtsSignature = LMOtsSignature.getInstance(obj);
            LMSigParameters parametersForType = LMSigParameters.getParametersForType(dataInputStream.readInt());
            int h11 = parametersForType.getH();
            byte[][] bArr = new byte[h11][];
            for (int i12 = 0; i12 < h11; i12++) {
                byte[] bArr2 = new byte[parametersForType.getM()];
                bArr[i12] = bArr2;
                dataInputStream.readFully(bArr2);
            }
            return new LMSSignature(i11, lMOtsSignature, parametersForType, bArr);
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            a.f(s.j(obj, "cannot parse "));
            return null;
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                LMSSignature lMSSignature = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMSSignature;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LMSSignature lMSSignature = (LMSSignature) obj;
        if (this.f33530q != lMSSignature.f33530q) {
            return false;
        }
        LMOtsSignature lMOtsSignature = this.otsSignature;
        LMOtsSignature lMOtsSignature2 = lMSSignature.otsSignature;
        if (lMOtsSignature == null ? lMOtsSignature2 != null : !lMOtsSignature.equals(lMOtsSignature2)) {
            return false;
        }
        LMSigParameters lMSigParameters = this.parameter;
        LMSigParameters lMSigParameters2 = lMSSignature.parameter;
        if (lMSigParameters == null ? lMSigParameters2 == null : lMSigParameters.equals(lMSigParameters2)) {
            return Arrays.deepEquals(this.f33531y, lMSSignature.f33531y);
        }
        return false;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return Composer.compose().u32str(this.f33530q).bytes(this.otsSignature.getEncoded()).u32str(this.parameter.getType()).bytes(this.f33531y).build();
    }

    public LMOtsSignature getOtsSignature() {
        return this.otsSignature;
    }

    public LMSigParameters getParameter() {
        return this.parameter;
    }

    public int getQ() {
        return this.f33530q;
    }

    public byte[][] getY() {
        return this.f33531y;
    }

    public int hashCode() {
        int i11 = this.f33530q * 31;
        LMOtsSignature lMOtsSignature = this.otsSignature;
        int iHashCode = (i11 + (lMOtsSignature != null ? lMOtsSignature.hashCode() : 0)) * 31;
        LMSigParameters lMSigParameters = this.parameter;
        return Arrays.deepHashCode(this.f33531y) + ((iHashCode + (lMSigParameters != null ? lMSigParameters.hashCode() : 0)) * 31);
    }
}
