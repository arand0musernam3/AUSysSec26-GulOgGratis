package cj;

import com.app.tgtg.model.remote.order.Payments;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import ui.m3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.BooleanRef f8280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8281k;
    public final /* synthetic */ s0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(s0 s0Var, x70.c cVar) {
        super(2, cVar);
        this.l = s0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new l0(this.l, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        Object obj2;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f8281k;
        boolean z11 = true;
        if (i11 == 0) {
            ba0.g.M(obj);
            booleanRef = new Ref.BooleanRef();
            s0 s0Var = this.l;
            String strG = s0Var.g();
            if (strG != null) {
                m3 m3Var = s0Var.f8386b;
                this.f8280j = booleanRef;
                this.f8281k = 1;
                Object objQ = m3Var.q(strG, this);
                if (objQ == aVar) {
                    return aVar;
                }
                booleanRef2 = booleanRef;
                obj2 = objQ;
            }
            return Boolean.valueOf(booleanRef.element);
        }
        if (i11 != 1) {
            h2.b("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        booleanRef2 = this.f8280j;
        ba0.g.M(obj);
        obj2 = ((u70.q) obj).f40851a;
        u70.o oVar = u70.q.f40850b;
        if (!(obj2 instanceof u70.p)) {
            int i12 = k0.$EnumSwitchMapping$0[((Payments) obj2).getState().ordinal()];
            if (i12 != 1 && i12 != 2) {
                z11 = false;
            }
            booleanRef2.element = z11;
        }
        if (u70.q.a(obj2) != null) {
            booleanRef2.element = false;
        }
        booleanRef = booleanRef2;
        return Boolean.valueOf(booleanRef.element);
    }
}
