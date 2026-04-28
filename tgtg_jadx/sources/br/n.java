package br;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f6651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o f6652k;
    public Throwable l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o f6654n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, x70.c cVar) {
        super(2, cVar);
        this.f6654n = oVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new n(this.f6654n, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: br.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
