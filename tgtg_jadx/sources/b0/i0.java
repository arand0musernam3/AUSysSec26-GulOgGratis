package b0;

import g3.b6;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5224j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5225k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f5226m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5227n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(List list, x70.c cVar, r0 r0Var, int i11) {
        super(2, cVar);
        this.f5224j = 0;
        this.f5226m = list;
        this.f5227n = r0Var;
        this.l = i11;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f5224j) {
            case 0:
                return new i0((List) this.f5226m, cVar, (r0) this.f5227n, this.l);
            case 1:
                return new i0((t1.b) this.f5226m, this.l, (m3.b1) this.f5227n, cVar, 1);
            case 2:
                return new i0((List) this.f5226m, this.l, (en.e) this.f5227n, cVar, 2);
            case 3:
                return new i0((t1.b) this.f5226m, this.l, (b6) this.f5227n, cVar, 3);
            case 4:
                return new i0((qf.a) this.f5227n, cVar, 4);
            case 5:
                i0 i0Var = new i0((ss.w) this.f5227n, cVar, 5);
                i0Var.f5226m = obj;
                return i0Var;
            default:
                return new i0((List) this.f5226m, this.l, (vh.d) this.f5227n, cVar, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5224j) {
            case 0:
                return ((i0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((i0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 2:
                return ((i0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 3:
                return ((i0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 4:
                return ((i0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 5:
                return ((i0) create((y80.j) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((i0) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01cb -> B:97:0x01dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x01d9 -> B:97:0x01dc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x01de -> B:97:0x01dc). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f5224j = i11;
        this.f5227n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj, int i11, Object obj2, x70.c cVar, int i12) {
        super(2, cVar);
        this.f5224j = i12;
        this.f5226m = obj;
        this.l = i11;
        this.f5227n = obj2;
    }
}
