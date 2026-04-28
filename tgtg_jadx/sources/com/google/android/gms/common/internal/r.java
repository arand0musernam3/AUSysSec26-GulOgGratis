package com.google.android.gms.common.internal;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class r implements d, b, c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static r f11179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f11180c = new s(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f11181a;

    public r(f fVar) {
        Objects.requireNonNull(fVar);
        this.f11181a = fVar;
    }

    public static synchronized r e() {
        try {
            if (f11179b == null) {
                f11179b = new r();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f11179b;
    }

    @Override // com.google.android.gms.common.internal.c
    public void a(pz.b bVar) {
        ((qz.n) this.f11181a).a(bVar);
    }

    @Override // com.google.android.gms.common.internal.b
    public void b(int i11) {
        ((qz.f) this.f11181a).b(i11);
    }

    @Override // com.google.android.gms.common.internal.d
    public void c(pz.b bVar) {
        boolean z11 = bVar.f35644b == 0;
        f fVar = (f) this.f11181a;
        if (z11) {
            fVar.getRemoteService(null, fVar.getScopes());
        } else if (fVar.zzl() != null) {
            fVar.zzl().a(bVar);
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public void d(Bundle bundle) {
        ((qz.f) this.f11181a).C();
    }

    public /* synthetic */ r(Object obj) {
        this.f11181a = obj;
    }
}
