package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ie implements vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11499a;

    static {
        new AtomicInteger();
    }

    @Override // com.google.android.gms.internal.measurement.vd
    public final Object a(ud udVar) throws IOException {
        if (this.f11499a) {
            if (udVar.f11940b.isEmpty()) {
                return udVar.f11939a.c(udVar.f11942d);
            }
            throw new zzsk("Short circuit would skip transforms.");
        }
        Closeable closeableD = gg.d(udVar);
        try {
            if (!(closeableD instanceof ce)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileA = ((ce) closeableD).a();
            if (closeableD != null) {
                closeableD.close();
            }
            return fileA;
        } catch (Throwable th2) {
            if (closeableD != null) {
                try {
                    closeableD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
