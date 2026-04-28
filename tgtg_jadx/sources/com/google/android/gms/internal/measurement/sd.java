package com.google.android.gms.internal.measurement;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class sd extends fe {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11849b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11850a;

    public sd(InputStream inputStream, ArrayList arrayList) {
        super(inputStream);
        this.f11850a = arrayList;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.f11850a.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                org.bouncycastle.jce.provider.a.c();
                return;
            }
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i11 = ((FilterInputStream) this).in.read();
        if (i11 != -1) {
            Iterator it = this.f11850a.iterator();
            if (it.hasNext()) {
                throw e0.f.e(it);
            }
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.measurement.fe, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i11 = ((FilterInputStream) this).in.read(bArr);
        if (i11 != -1) {
            Iterator it = this.f11850a.iterator();
            if (it.hasNext()) {
                throw e0.f.e(it);
            }
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13 = ((FilterInputStream) this).in.read(bArr, i11, i12);
        if (i13 != -1) {
            Iterator it = this.f11850a.iterator();
            if (it.hasNext()) {
                throw e0.f.e(it);
            }
        }
        return i13;
    }
}
