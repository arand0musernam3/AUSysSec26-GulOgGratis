package com.braze.lrucache;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import wy.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f9906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f9907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f9909d;

    public d(f fVar, g gVar) {
        this.f9909d = fVar;
        this.f9906a = gVar;
        this.f9907b = gVar.f9929c ? null : new boolean[fVar.f9920g];
    }

    public final OutputStream a() {
        FileOutputStream fileOutputStream;
        c cVar;
        f fVar = this.f9909d;
        if (fVar.f9920g <= 0) {
            o.l(this.f9909d.f9920g, "Expected index 0 to be greater than 0 and less than the maximum value count of ");
            return null;
        }
        synchronized (fVar) {
            try {
                g gVar = this.f9906a;
                if (gVar.f9930d != this) {
                    throw new IllegalStateException();
                }
                if (!gVar.f9929c) {
                    this.f9907b[0] = true;
                }
                File fileA = gVar.a(0);
                try {
                    fileOutputStream = new FileOutputStream(fileA);
                } catch (FileNotFoundException unused) {
                    this.f9909d.f9914a.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileA);
                    } catch (FileNotFoundException unused2) {
                        return f.f9913q;
                    }
                }
                cVar = new c(this, fileOutputStream);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
