package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f348k;
    public final /* synthetic */ boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f349m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(boolean z11, cj.q qVar, x70.c cVar) {
        super(2, cVar);
        this.f347j = 2;
        this.l = z11;
        this.f349m = qVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f347j) {
            case 0:
                return new f3((l3) this.f349m, this.l, cVar, 0);
            case 1:
                return new f3((al.c0) this.f349m, this.l, cVar, 1);
            case 2:
                return new f3(this.l, (cj.q) this.f349m, cVar);
            case 3:
                return new f3((ep.d0) this.f349m, this.l, cVar, 3);
            case 4:
                return new f3((ft.s) this.f349m, this.l, cVar, 4);
            case 5:
                return new f3((hs.h) this.f349m, this.l, cVar, 5);
            default:
                return new f3((um.t) this.f349m, this.l, cVar, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f347j) {
        }
        return ((f3) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b5, code lost:
    
        if (r10 == r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012f, code lost:
    
        if (kotlin.Unit.f26487a == r0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0140, code lost:
    
        if (kotlin.Unit.f26487a == r0) goto L70;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.f3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3(Object obj, boolean z11, x70.c cVar, int i11) {
        super(2, cVar);
        this.f347j = i11;
        this.f349m = obj;
        this.l = z11;
    }
}
