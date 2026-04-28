package v80;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p1 extends FunctionReferenceImpl implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1 f42146a = new p1(3, s1.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s1 s1Var = (s1) obj;
        d90.e eVar = (d90.e) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s1.f42157a;
        s1Var.getClass();
        while (true) {
            Object objJ = s1.f42157a.get(s1Var);
            if (!(objJ instanceof e1)) {
                if (!(objJ instanceof t)) {
                    objJ = f0.J(objJ);
                }
                eVar.f14785e = objJ;
            } else if (s1Var.c0(objJ) >= 0) {
                eVar.f14783c = f0.w(s1Var, new o1(s1Var, eVar, 0));
                break;
            }
        }
        return Unit.f26487a;
    }
}
