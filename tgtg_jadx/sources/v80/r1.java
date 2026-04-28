package v80;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r1 extends FunctionReferenceImpl implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r1 f42149a = new r1(3, s1.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s1 s1Var = (s1) obj;
        d90.e eVar = (d90.e) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s1.f42157a;
        s1Var.getClass();
        while (true) {
            Object obj4 = s1.f42157a.get(s1Var);
            if (!(obj4 instanceof e1)) {
                eVar.f14785e = Unit.f26487a;
                break;
            }
            if (s1Var.c0(obj4) >= 0) {
                eVar.f14783c = f0.w(s1Var, new o1(s1Var, eVar, 1));
                break;
            }
        }
        return Unit.f26487a;
    }
}
