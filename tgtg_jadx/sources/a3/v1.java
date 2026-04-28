package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f599k;
    public final /* synthetic */ long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f600m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(long j9, Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f598j = i11;
        this.l = j9;
        this.f600m = obj;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f598j) {
            case 0:
                return new v1((t1.b) this.f600m, this.l, cVar, 0);
            case 1:
                return new v1((v80.q) this.f600m, this.l, cVar, 1);
            case 2:
                return new v1((c6.j) this.f600m, this.l, cVar, 2);
            case 3:
                return new v1(this.l, (Function0) this.f600m, cVar, 3);
            case 4:
                return new v1(this.l, (f0.p0) this.f600m, cVar, 4);
            case 5:
                return new v1((androidx.lifecycle.n1) this.f600m, this.l, cVar, 5);
            case 6:
                return new v1(this.l, (w4.k0) this.f600m, cVar, 6);
            default:
                return new v1((x2.i) this.f600m, this.l, cVar, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f598j) {
        }
        return ((v1) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (v80.f0.o(8, r12) == r0) goto L26;
     */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.v1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(Object obj, long j9, x70.c cVar, int i11) {
        super(2, cVar);
        this.f598j = i11;
        this.f600m = obj;
        this.l = j9;
    }
}
