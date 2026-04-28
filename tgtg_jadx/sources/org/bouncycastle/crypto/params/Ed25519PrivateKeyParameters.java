package org.bouncycastle.crypto.params;

import c50.w;
import i4.a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes3.dex */
public final class Ed25519PrivateKeyParameters extends AsymmetricKeyParameter {
    public static final int KEY_SIZE = 32;
    public static final int SIGNATURE_SIZE = 64;
    private Ed25519PublicKeyParameters cachedPublicKey;
    private final byte[] data;

    public Ed25519PrivateKeyParameters(InputStream inputStream) throws IOException {
        super(true);
        byte[] bArr = new byte[32];
        this.data = bArr;
        if (32 != Streams.readFully(inputStream, bArr)) {
            throw new EOFException("EOF encountered in middle of Ed25519 private key");
        }
    }

    private static byte[] validate(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        a.f("'buf' must have length 32");
        return null;
    }

    public void encode(byte[] bArr, int i11) {
        System.arraycopy(this.data, 0, bArr, i11, 32);
    }

    public Ed25519PublicKeyParameters generatePublicKey() {
        Ed25519PublicKeyParameters ed25519PublicKeyParameters;
        synchronized (this.data) {
            try {
                if (this.cachedPublicKey == null) {
                    this.cachedPublicKey = new Ed25519PublicKeyParameters(Ed25519.generatePublicKey(this.data, 0));
                }
                ed25519PublicKeyParameters = this.cachedPublicKey;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ed25519PublicKeyParameters;
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.data);
    }

    public void sign(int i11, byte[] bArr, byte[] bArr2, int i12, int i13, byte[] bArr3, int i14) {
        byte[] bArr4 = new byte[32];
        generatePublicKey().encode(bArr4, 0);
        if (i11 == 0) {
            if (bArr == null) {
                Ed25519.sign(this.data, 0, bArr4, 0, bArr2, i12, i13, bArr3, i14);
                return;
            } else {
                a.f("ctx");
                return;
            }
        }
        if (i11 == 1) {
            if (bArr == null) {
                w.l("'ctx' cannot be null");
                return;
            } else if (bArr.length <= 255) {
                Ed25519.sign(this.data, 0, bArr4, 0, bArr, bArr2, i12, i13, bArr3, i14);
                return;
            } else {
                a.f("ctx");
                return;
            }
        }
        if (i11 != 2) {
            a.f("algorithm");
            return;
        }
        if (bArr == null) {
            w.l("'ctx' cannot be null");
            return;
        }
        if (bArr.length > 255) {
            a.f("ctx");
        } else if (64 == i13) {
            Ed25519.signPrehash(this.data, 0, bArr4, 0, bArr, bArr2, i12, bArr3, i14);
        } else {
            a.f("msgLen");
        }
    }

    public Ed25519PrivateKeyParameters(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.data = bArr;
        Ed25519.generatePrivateKey(secureRandom, bArr);
    }

    public Ed25519PrivateKeyParameters(byte[] bArr) {
        this(validate(bArr), 0);
    }

    public Ed25519PrivateKeyParameters(byte[] bArr, int i11) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.data = bArr2;
        System.arraycopy(bArr, i11, bArr2, 0, 32);
    }

    public void sign(int i11, Ed25519PublicKeyParameters ed25519PublicKeyParameters, byte[] bArr, byte[] bArr2, int i12, int i13, byte[] bArr3, int i14) {
        sign(i11, bArr, bArr2, i12, i13, bArr3, i14);
    }
}
