package x80;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f extends FunctionReferenceImpl implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f44038a = new f(3, i.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        i iVar = (i) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = i.f44043d;
        iVar.getClass();
        if (obj3 == k.l) {
            obj3 = new n(iVar.s());
        }
        return new p(obj3);
    }
}
