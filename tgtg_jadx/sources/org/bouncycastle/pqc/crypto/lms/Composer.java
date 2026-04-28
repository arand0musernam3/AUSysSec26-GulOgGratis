package org.bouncycastle.pqc.crypto.lms;

import a40.d0;
import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.util.Encodable;

/* JADX INFO: loaded from: classes3.dex */
public class Composer {
    private final ByteArrayOutputStream bos = new ByteArrayOutputStream();

    private Composer() {
    }

    public static Composer compose() {
        return new Composer();
    }

    public Composer bool(boolean z11) {
        this.bos.write(z11 ? 1 : 0);
        return this;
    }

    public byte[] build() {
        return this.bos.toByteArray();
    }

    public Composer bytes(Encodable[] encodableArr) {
        try {
            for (Encodable encodable : encodableArr) {
                this.bos.write(encodable.getEncoded());
            }
            return this;
        } catch (Exception e5) {
            d0.o(e5.getMessage(), e5);
            return null;
        }
    }

    public Composer pad(int i11, int i12) {
        while (i12 >= 0) {
            try {
                this.bos.write(i11);
                i12--;
            } catch (Exception e5) {
                d0.o(e5.getMessage(), e5);
                return null;
            }
        }
        return this;
    }

    public Composer padUntil(int i11, int i12) {
        while (this.bos.size() < i12) {
            this.bos.write(i11);
        }
        return this;
    }

    public Composer u16str(int i11) {
        int i12 = i11 & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
        this.bos.write((byte) (i12 >>> 8));
        this.bos.write((byte) i12);
        return this;
    }

    public Composer u32str(int i11) {
        this.bos.write((byte) (i11 >>> 24));
        this.bos.write((byte) (i11 >>> 16));
        this.bos.write((byte) (i11 >>> 8));
        this.bos.write((byte) i11);
        return this;
    }

    public Composer u64str(long j9) {
        u32str((int) (j9 >>> 32));
        u32str((int) j9);
        return this;
    }

    public Composer bytes(byte[] bArr) {
        try {
            this.bos.write(bArr);
            return this;
        } catch (Exception e5) {
            d0.o(e5.getMessage(), e5);
            return null;
        }
    }

    public Composer bytes(byte[] bArr, int i11, int i12) {
        try {
            this.bos.write(bArr, i11, i12);
            return this;
        } catch (Exception e5) {
            d0.o(e5.getMessage(), e5);
            return null;
        }
    }

    public Composer bytes(Encodable encodable) {
        try {
            this.bos.write(encodable.getEncoded());
            return this;
        } catch (Exception e5) {
            d0.o(e5.getMessage(), e5);
            return null;
        }
    }

    public Composer bytes(byte[][] bArr) {
        try {
            for (byte[] bArr2 : bArr) {
                this.bos.write(bArr2);
            }
            return this;
        } catch (Exception e5) {
            d0.o(e5.getMessage(), e5);
            return null;
        }
    }

    public Composer bytes(byte[][] bArr, int i11, int i12) {
        while (i11 != i12) {
            try {
                this.bos.write(bArr[i11]);
                i11++;
            } catch (Exception e5) {
                d0.o(e5.getMessage(), e5);
                return null;
            }
        }
        return this;
    }
}
