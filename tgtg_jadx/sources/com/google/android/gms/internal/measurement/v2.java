package com.google.android.gms.internal.measurement;

import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11956a;

    public v2() {
        this.f11956a = new ConcurrentHashMap();
    }

    public abstract Object a();

    public abstract void b(Object obj, long j9, byte b8);

    public Object c(rg rgVar, la laVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f11956a;
        Object obj = concurrentHashMap.get(rgVar);
        if (obj != null) {
            return obj;
        }
        Object objA = a();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(rgVar, objA);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int iA = laVar.a();
        for (int i11 = 0; i11 < iA; i11++) {
            if (mg.f11644f.equals(laVar.i(i11))) {
                laVar.j(i11);
            }
        }
        return objA;
    }

    public abstract boolean d(long j9, Object obj);

    public abstract boolean e(Level level);

    public abstract void f(jg jgVar);

    public abstract void g(Object obj, long j9, boolean z11);

    public abstract float h(long j9, Object obj);

    public void i(RuntimeException runtimeException, jg jgVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    public abstract void j(Object obj, long j9, float f11);

    public abstract double k(long j9, Object obj);

    public abstract void l(Object obj, long j9, double d3);
}
