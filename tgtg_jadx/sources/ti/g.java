package ti;

import android.content.Context;
import g3.g7;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ List f40227k;
    public final /* synthetic */ boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Context f40228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g7 f40229n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(List list, boolean z11, Context context, g7 g7Var, x70.c cVar) {
        super(2, cVar);
        this.f40227k = list;
        this.l = z11;
        this.f40228m = context;
        this.f40229n = g7Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new g(this.f40227k, this.l, this.f40228m, this.f40229n, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c2, code lost:
    
        if (v80.f0.o(5000, r10) == r0) goto L33;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ti.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
