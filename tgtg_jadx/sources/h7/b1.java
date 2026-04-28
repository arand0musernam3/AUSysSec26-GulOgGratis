package h7;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21517k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ View f21518m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(View view, x70.c cVar) {
        super(2, cVar);
        this.f21518m = view;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        b1 b1Var = new b1(this.f21518m, cVar);
        b1Var.l = obj;
        return b1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b1) create((o80.k) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r5 == r0) goto L20;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r4.f21517k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            ba0.g.M(r5)
            goto L5a
        L10:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L17:
            java.lang.Object r1 = r4.l
            o80.k r1 = (o80.k) r1
            ba0.g.M(r5)
            goto L34
        L1f:
            ba0.g.M(r5)
            java.lang.Object r5 = r4.l
            r1 = r5
            o80.k r1 = (o80.k) r1
            android.view.View r5 = r4.f21518m
            r4.l = r1
            r4.f21517k = r3
            y70.a r5 = r1.a(r5, r4)
            if (r5 != r0) goto L34
            goto L59
        L34:
            android.view.View r5 = r4.f21518m
            boolean r3 = r5 instanceof android.view.ViewGroup
            if (r3 == 0) goto L5a
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r3 = 0
            r4.l = r3
            r4.f21517k = r2
            r1.getClass()
            h7.h0 r2 = new h7.h0
            h7.a1 r3 = new h7.a1
            r3.<init>(r5)
            r2.<init>(r3)
            java.lang.Object r5 = r1.b(r2, r4)
            if (r5 != r0) goto L55
            goto L57
        L55:
            kotlin.Unit r5 = kotlin.Unit.f26487a
        L57:
            if (r5 != r0) goto L5a
        L59:
            return r0
        L5a:
            kotlin.Unit r5 = kotlin.Unit.f26487a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.b1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
