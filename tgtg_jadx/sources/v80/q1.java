package v80;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q1 extends FunctionReferenceImpl implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1 f42148a = new q1(3, s1.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s1.f42157a;
        ((s1) obj).getClass();
        if (obj3 instanceof t) {
            throw ((t) obj3).f42160a;
        }
        return obj3;
    }
}
