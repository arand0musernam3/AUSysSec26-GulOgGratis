package com.google.android.gms.internal.measurement;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class td extends ge {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11891b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11892a;

    public td(OutputStream outputStream, ArrayList arrayList) {
        super(outputStream);
        this.f11892a = arrayList;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Iterator it = this.f11892a.iterator();
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

    @Override // com.google.android.gms.internal.measurement.ge, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        ((FilterOutputStream) this).out.write(bArr);
        Iterator it = this.f11892a.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                org.bouncycastle.jce.provider.a.c();
            } else {
                int length = bArr.length;
                throw null;
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i11) throws IOException {
        ((FilterOutputStream) this).out.write(i11);
        Iterator it = this.f11892a.iterator();
        if (it.hasNext()) {
            throw e0.f.e(it);
        }
    }

    @Override // com.google.android.gms.internal.measurement.ge, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i11, int i12) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i11, i12);
        Iterator it = this.f11892a.iterator();
        if (it.hasNext()) {
            throw e0.f.e(it);
        }
    }
}
