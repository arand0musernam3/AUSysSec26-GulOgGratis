package org.brotli.dec;

import j4.s;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class BrotliInputStream extends InputStream {
    public static final int DEFAULT_INTERNAL_BUFFER_SIZE = 16384;
    private byte[] buffer;
    private int bufferOffset;
    private int remainingBufferBytes;
    private final State state;

    public BrotliInputStream(InputStream inputStream, int i11, byte[] bArr) throws IOException {
        State state = new State();
        this.state = state;
        if (i11 <= 0) {
            i4.a.f(s.f(i11, "Bad buffer size:"));
            throw null;
        }
        if (inputStream == null) {
            i4.a.f("source is null");
            throw null;
        }
        this.buffer = new byte[i11];
        this.remainingBufferBytes = 0;
        this.bufferOffset = 0;
        try {
            State.setInput(state, inputStream);
            if (bArr != null) {
                Decode.setCustomDictionary(state, bArr);
            }
        } catch (BrotliRuntimeException e5) {
            throw new IOException("Brotli decoder initialization failed", e5);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        State.close(this.state);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        if (i11 < 0) {
            i4.a.f(s.f(i11, "Bad offset: "));
            return 0;
        }
        if (i12 < 0) {
            i4.a.f(s.f(i12, "Bad length: "));
            return 0;
        }
        int i13 = i11 + i12;
        if (i13 > bArr.length) {
            StringBuilder sbK = org.bouncycastle.jcajce.provider.asymmetric.a.k(i13, "Buffer overflow: ", " > ");
            sbK.append(bArr.length);
            throw new IllegalArgumentException(sbK.toString());
        }
        if (i12 == 0) {
            return 0;
        }
        int iMax = Math.max(this.remainingBufferBytes - this.bufferOffset, 0);
        if (iMax != 0) {
            iMax = Math.min(iMax, i12);
            System.arraycopy(this.buffer, this.bufferOffset, bArr, i11, iMax);
            this.bufferOffset += iMax;
            i11 += iMax;
            i12 -= iMax;
            if (i12 == 0) {
                return iMax;
            }
        }
        try {
            State state = this.state;
            state.output = bArr;
            state.outputOffset = i11;
            state.outputLength = i12;
            state.outputUsed = 0;
            Decode.decompress(state);
            int i14 = this.state.outputUsed;
            if (i14 == 0) {
                return -1;
            }
            return i14 + iMax;
        } catch (BrotliRuntimeException e5) {
            throw new IOException("Brotli stream decoding failed", e5);
        }
    }

    public BrotliInputStream(InputStream inputStream, int i11) throws IOException {
        this(inputStream, i11, null);
    }

    public BrotliInputStream(InputStream inputStream) throws IOException {
        this(inputStream, DEFAULT_INTERNAL_BUFFER_SIZE, null);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.bufferOffset >= this.remainingBufferBytes) {
            byte[] bArr = this.buffer;
            int i11 = read(bArr, 0, bArr.length);
            this.remainingBufferBytes = i11;
            this.bufferOffset = 0;
            if (i11 == -1) {
                return -1;
            }
        }
        byte[] bArr2 = this.buffer;
        int i12 = this.bufferOffset;
        this.bufferOffset = i12 + 1;
        return bArr2[i12] & 255;
    }
}
