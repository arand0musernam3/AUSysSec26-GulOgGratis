package b0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5400k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f5401m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r2(i80.n nVar, x70.c cVar, z1.r rVar) {
        super(1, cVar);
        this.f5399j = 8;
        this.l = rVar;
        this.f5401m = (z70.i) nVar;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [i80.n, z70.i] */
    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        switch (this.f5399j) {
            case 0:
                return new r2((x2) this.f5401m, cVar, 0);
            case 1:
                return new r2((d8.y) this.f5401m, cVar, 1);
            case 2:
                return new r2((d8.a0) this.f5401m, cVar, 2);
            case 3:
                return new r2((y9.v) this.l, (Function1) this.f5401m, cVar, 3);
            case 4:
                return new r2((gt.j) this.l, (List) this.f5401m, cVar, 4);
            case 5:
                return new r2((r2.f) this.l, (t2.d) this.f5401m, cVar, 5);
            case 6:
                return new r2((t2.c) this.l, (t2.b) this.f5401m, cVar, 6);
            case 7:
                return new r2((v1.u) this.l, (a3.c2) this.f5401m, cVar, 7);
            default:
                return new r2((i80.n) this.f5401m, cVar, (z1.r) this.l);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        x70.c cVar = (x70.c) obj;
        switch (this.f5399j) {
        }
        return ((r2) create(cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:343:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v15, types: [i80.n, z70.i] */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.r2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2(Object obj, Object obj2, x70.c cVar, int i11) {
        super(1, cVar);
        this.f5399j = i11;
        this.l = obj;
        this.f5401m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2(Object obj, x70.c cVar, int i11) {
        super(1, cVar);
        this.f5399j = i11;
        this.f5401m = obj;
    }
}
