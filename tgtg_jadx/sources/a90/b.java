package a90;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f1008a = new v("CLOSED", 0);

    public static final Object a(t tVar, long j9, Function2 function2) {
        while (true) {
            if (tVar.f1048c >= j9 && !tVar.d()) {
                return tVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f1013a;
            Object obj = atomicReferenceFieldUpdater.get(tVar);
            v vVar = f1008a;
            if (obj == vVar) {
                return vVar;
            }
            t tVar2 = (t) ((c) obj);
            if (tVar2 == null) {
                tVar2 = (t) function2.invoke(Long.valueOf(tVar.f1048c + 1), tVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(tVar, null, tVar2)) {
                    if (atomicReferenceFieldUpdater.get(tVar) != null) {
                        break;
                    }
                }
                if (tVar.d()) {
                    tVar.e();
                }
            }
            tVar = tVar2;
        }
    }
}
