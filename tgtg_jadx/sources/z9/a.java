package z9;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import y00.c0;
import y9.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f47409c = new c0(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f47410d = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f47411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f47412b;

    public a(String str, boolean z11) {
        ReentrantLock reentrantLock;
        h hVar;
        synchronized (f47409c) {
            try {
                LinkedHashMap linkedHashMap = f47410d;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f47411a = reentrantLock;
        if (z11) {
            hVar = new h();
            hVar.f45666a = str.concat(".lck");
        } else {
            hVar = null;
        }
        this.f47412b = hVar;
    }
}
