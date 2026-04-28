package com.braze.lrucache;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream[] f9910a;

    public e(InputStream[] inputStreamArr) {
        this.f9910a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.f9910a) {
            Charset charset = j.f9939a;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (RuntimeException e5) {
                    throw e5;
                } catch (Exception unused) {
                }
            }
        }
    }
}
