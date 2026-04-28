package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12791b;

    public d(InputStream inputStream) {
        super(inputStream);
        this.f12791b = -1L;
        this.f12790a = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.f12790a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i11) {
        ((FilterInputStream) this).in.mark(i11);
        this.f12791b = this.f12790a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        long j9 = this.f12790a;
        if (j9 == 0) {
            return -1;
        }
        int i13 = ((FilterInputStream) this).in.read(bArr, i11, (int) Math.min(i12, j9));
        if (i13 != -1) {
            this.f12790a -= (long) i13;
        }
        return i13;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f12791b == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f12790a = this.f12791b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j9) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j9, this.f12790a));
        this.f12790a -= jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f12790a == 0) {
            return -1;
        }
        int i11 = ((FilterInputStream) this).in.read();
        if (i11 != -1) {
            this.f12790a--;
        }
        return i11;
    }
}
