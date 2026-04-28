package h0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f extends FunctionReferenceImpl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f20966a = new f(2, g.class, "lockWithoutOwner", "lockWithoutOwner(Lkotlinx/coroutines/sync/Mutex;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object objG = ((e90.a) obj).g((x70.c) obj2);
        return objG == y70.a.COROUTINE_SUSPENDED ? objG : Unit.f26487a;
    }
}
