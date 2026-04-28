package org.bouncycastle.asn1;

import i4.a;
import java.io.IOException;
import java.io.InputStream;
import m0.i1;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes3.dex */
class DefiniteLengthInputStream extends LimitedInputStream {
    private static final byte[] EMPTY_BYTES = new byte[0];
    private final int _originalLength;
    private int _remaining;

    public DefiniteLengthInputStream(InputStream inputStream, int i11, int i12) {
        super(inputStream, i12);
        if (i11 <= 0) {
            if (i11 < 0) {
                a.f("negative lengths not allowed");
                throw null;
            }
            setParentEofDetect(true);
        }
        this._originalLength = i11;
        this._remaining = i11;
    }

    public int getRemaining() {
        return this._remaining;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = this._remaining;
        if (i13 == 0) {
            return -1;
        }
        int i14 = this._in.read(bArr, i11, Math.min(i12, i13));
        if (i14 < 0) {
            i1.d(this._originalLength, this._remaining);
            return 0;
        }
        int i15 = this._remaining - i14;
        this._remaining = i15;
        if (i15 == 0) {
            setParentEofDetect(true);
        }
        return i14;
    }

    public void readAllIntoByteArray(byte[] bArr) throws IOException {
        int i11 = this._remaining;
        if (i11 != bArr.length) {
            a.f("buffer length not right for data");
            return;
        }
        if (i11 == 0) {
            return;
        }
        int limit = getLimit();
        int i12 = this._remaining;
        if (i12 >= limit) {
            throw new IOException("corrupted stream - out of bounds length found: " + this._remaining + " >= " + limit);
        }
        int fully = i12 - Streams.readFully(this._in, bArr, 0, bArr.length);
        this._remaining = fully;
        if (fully == 0) {
            setParentEofDetect(true);
        } else {
            i1.d(this._originalLength, this._remaining);
        }
    }

    public byte[] toByteArray() throws IOException {
        if (this._remaining == 0) {
            return EMPTY_BYTES;
        }
        int limit = getLimit();
        int i11 = this._remaining;
        if (i11 >= limit) {
            throw new IOException("corrupted stream - out of bounds length found: " + this._remaining + " >= " + limit);
        }
        byte[] bArr = new byte[i11];
        int fully = i11 - Streams.readFully(this._in, bArr, 0, i11);
        this._remaining = fully;
        if (fully == 0) {
            setParentEofDetect(true);
            return bArr;
        }
        i1.d(this._originalLength, this._remaining);
        return null;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this._remaining == 0) {
            return -1;
        }
        int i11 = this._in.read();
        if (i11 < 0) {
            i1.d(this._originalLength, this._remaining);
            return 0;
        }
        int i12 = this._remaining - 1;
        this._remaining = i12;
        if (i12 == 0) {
            setParentEofDetect(true);
        }
        return i11;
    }
}
