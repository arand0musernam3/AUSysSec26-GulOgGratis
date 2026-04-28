package z1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f46396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f46397k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f46398m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f46396j = i11;
        this.l = obj;
        this.f46398m = obj2;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f46396j) {
            case 0:
                a2 a2Var = new a2((x80.m) this.f46398m, cVar, 0);
                a2Var.l = obj;
                return a2Var;
            case 1:
                a2 a2Var2 = new a2((g2) this.f46398m, cVar, 1);
                a2Var2.l = obj;
                return a2Var2;
            case 2:
                return new a2((l3) this.l, (Function2) this.f46398m, cVar, 2);
            case 3:
                return new a2((p0) this.l, (g3) this.f46398m, cVar, 3);
            case 4:
                return new a2((v80.i1) this.l, (k2) this.f46398m, cVar, 4);
            case 5:
                a2 a2Var3 = new a2((z80.d) this.f46398m, cVar, 5);
                a2Var3.l = obj;
                return a2Var3;
            case 6:
                a2 a2Var4 = new a2((z80.g) this.f46398m, cVar, 6);
                a2Var4.l = obj;
                return a2Var4;
            case 7:
                return new a2((y80.i) this.l, (z80.w) this.f46398m, cVar, 7);
            case 8:
                a2 a2Var5 = new a2((y80.j) this.f46398m, cVar, 8);
                a2Var5.l = obj;
                return a2Var5;
            default:
                return new a2((zl.g) this.l, (Function1) this.f46398m, cVar, 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f46396j) {
            case 0:
                return ((a2) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((a2) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 2:
                return ((a2) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 3:
                return ((a2) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 4:
                return ((a2) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 5:
                return ((a2) create((x80.u) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 6:
                return ((a2) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 7:
                return ((a2) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 8:
                return ((a2) create(obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((a2) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [v80.i1] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v4, types: [v80.i1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x01ff -> B:151:0x01c5). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.a2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f46396j = i11;
        this.f46398m = obj;
    }
}
