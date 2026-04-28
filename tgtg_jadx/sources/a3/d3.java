package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f313k;
    public final /* synthetic */ l3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(l3 l3Var, x70.c cVar, int i11) {
        super(2, cVar);
        this.f312j = i11;
        this.l = l3Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f312j) {
            case 0:
                d3 d3Var = new d3(this.l, cVar, 0);
                long j9 = ((h4.b) obj).f21378a;
                return d3Var;
            case 1:
                return new d3(this.l, cVar, 1);
            default:
                return new d3(this.l, cVar, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f312j) {
            case 0:
                long j9 = ((h4.b) obj).f21378a;
                break;
        }
        return ((d3) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x02b8, code lost:
    
        if (r2 == r1) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0423, code lost:
    
        if (r2 == r1) goto L198;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.d3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
