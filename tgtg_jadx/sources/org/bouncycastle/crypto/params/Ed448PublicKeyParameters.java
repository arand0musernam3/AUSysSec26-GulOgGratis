package org.bouncycastle.crypto.params;

import c50.w;
import i4.a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.math.ec.rfc8032.Ed448;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes3.dex */
public final class Ed448PublicKeyParameters extends AsymmetricKeyParameter {
    public static final int KEY_SIZE = 57;
    private final Ed448.PublicPoint publicPoint;

    public Ed448PublicKeyParameters(InputStream inputStream) throws IOException {
        super(false);
        byte[] bArr = new byte[57];
        if (57 != Streams.readFully(inputStream, bArr)) {
            throw new EOFException("EOF encountered in middle of Ed448 public key");
        }
        this.publicPoint = parse(bArr, 0);
    }

    private static Ed448.PublicPoint parse(byte[] bArr, int i11) {
        Ed448.PublicPoint publicPointValidatePublicKeyPartialExport = Ed448.validatePublicKeyPartialExport(bArr, i11);
        if (publicPointValidatePublicKeyPartialExport != null) {
            return publicPointValidatePublicKeyPartialExport;
        }
        a.f("invalid public key");
        return null;
    }

    private static byte[] validate(byte[] bArr) {
        if (bArr.length == 57) {
            return bArr;
        }
        a.f("'buf' must have length 57");
        return null;
    }

    public void encode(byte[] bArr, int i11) {
        Ed448.encodePublicPoint(this.publicPoint, bArr, i11);
    }

    public byte[] getEncoded() {
        byte[] bArr = new byte[57];
        encode(bArr, 0);
        return bArr;
    }

    public boolean verify(int i11, byte[] bArr, byte[] bArr2, int i12, int i13, byte[] bArr3, int i14) {
        if (i11 == 0) {
            if (bArr == null) {
                w.l("'ctx' cannot be null");
                return false;
            }
            if (bArr.length <= 255) {
                return Ed448.verify(bArr3, i14, this.publicPoint, bArr, bArr2, i12, i13);
            }
            a.f("ctx");
            return false;
        }
        if (i11 != 1) {
            a.f("algorithm");
            return false;
        }
        if (bArr == null) {
            w.l("'ctx' cannot be null");
            return false;
        }
        if (bArr.length > 255) {
            a.f("ctx");
            return false;
        }
        if (64 == i13) {
            return Ed448.verifyPrehash(bArr3, i14, this.publicPoint, bArr, bArr2, i12);
        }
        a.f("msgLen");
        return false;
    }

    public Ed448PublicKeyParameters(Ed448.PublicPoint publicPoint) {
        super(false);
        if (publicPoint != null) {
            this.publicPoint = publicPoint;
        } else {
            w.l("'publicPoint' cannot be null");
            throw null;
        }
    }

    public Ed448PublicKeyParameters(byte[] bArr) {
        this(validate(bArr), 0);
    }

    public Ed448PublicKeyParameters(byte[] bArr, int i11) {
        super(false);
        this.publicPoint = parse(bArr, i11);
    }
}
