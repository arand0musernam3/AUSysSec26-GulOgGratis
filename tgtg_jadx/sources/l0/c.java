package l0;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import m0.h1;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f26739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f26740k;
    public final /* synthetic */ h1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Ref.ObjectRef objectRef, h1 h1Var, x70.c cVar) {
        super(2, cVar);
        this.f26740k = objectRef;
        this.l = h1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        c cVar2 = new c(this.f26740k, this.l, cVar);
        cVar2.f26739j = obj;
        return cVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((Pair) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [T, l1.b] */
    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        ?? r42 = (l1.b) ((Pair) this.f26739j).f26485a;
        Ref.ObjectRef objectRef = this.f26740k;
        T t9 = objectRef.element;
        boolean z11 = (t9 == 0 || r42 == t9) ? false : true;
        if (z11) {
            h1 h1Var = this.l;
            h1Var.c();
            h1Var.f28522i.b(null);
        } else {
            objectRef.element = r42;
        }
        return Boolean.valueOf(!z11);
    }
}
