package no;

import androidx.lifecycle.m1;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class t extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f31302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SurpriseBagOrderActivity f31303k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(SurpriseBagOrderActivity surpriseBagOrderActivity, x70.c cVar, int i11) {
        super(2, cVar);
        this.f31302j = i11;
        this.f31303k = surpriseBagOrderActivity;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f31302j) {
            case 0:
                return new t(this.f31303k, cVar, 0);
            default:
                return new t(this.f31303k, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f31302j) {
        }
        return ((t) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f31302j;
        SurpriseBagOrderActivity surpriseBagOrderActivity = this.f31303k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                m0 m0VarC = surpriseBagOrderActivity.C();
                m0VarC.getClass();
                v80.f0.B(m1.d(m0VarC), null, null, new b0(m0VarC, null, 2), 3);
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                m0 m0VarC2 = surpriseBagOrderActivity.C();
                m0VarC2.getClass();
                v80.f0.B(m1.d(m0VarC2), null, null, new b0(m0VarC2, null, 0), 3);
                break;
        }
        return Unit.f26487a;
    }
}
