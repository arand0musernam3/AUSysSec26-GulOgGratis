package hm;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f22134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22135k;
    public final /* synthetic */ v l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(v vVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f22134j = i11;
        this.l = vVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f22134j) {
            case 0:
                return new q(this.l, cVar, 0);
            case 1:
                return new q(this.l, cVar, 1);
            case 2:
                return new q(this.l, cVar, 2);
            case 3:
                return new q(this.l, cVar, 3);
            case 4:
                return new q(this.l, cVar, 4);
            case 5:
                return new q(this.l, cVar, 5);
            case 6:
                return new q(this.l, cVar, 6);
            default:
                return new q(this.l, cVar, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f22134j) {
        }
        return ((q) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x018b, code lost:
    
        if (r1.c(r8, r7) == r0) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hm.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
