package no;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f31174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public m0 f31175k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f31176m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f31177n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m0 f31178o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(m0 m0Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f31174j = i11;
        this.f31178o = m0Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f31174j) {
            case 0:
                return new b0(this.f31178o, cVar, 0);
            case 1:
                return new b0(this.f31178o, cVar, 1);
            default:
                return new b0(this.f31178o, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f31174j) {
        }
        return ((b0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a4  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: no.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
