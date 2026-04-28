package com.braze.lrucache;

import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f9904a;

    public a(f fVar) {
        this.f9904a = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f9904a) {
            try {
                f fVar = this.f9904a;
                if (fVar.f9922i == null) {
                    return null;
                }
                while (fVar.f9921h > fVar.f9919f) {
                    fVar.d((String) ((Map.Entry) fVar.f9923j.entrySet().iterator().next()).getKey());
                }
                if (this.f9904a.a()) {
                    this.f9904a.d();
                    this.f9904a.f9924k = 0;
                }
                return null;
            } finally {
            }
        }
    }
}
