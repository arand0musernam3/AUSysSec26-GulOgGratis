package a3;

import g3.ea;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends z70.h implements Function2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f271k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f273n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f274o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f275p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(j jVar, o oVar, m2.l1 l1Var, x70.c cVar) {
        super(2, cVar);
        this.f271k = 0;
        this.f273n = jVar;
        this.f274o = oVar;
        this.f275p = l1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f271k) {
            case 0:
                b1 b1Var = new b1((j) this.f273n, (o) this.f274o, (m2.l1) this.f275p, cVar);
                b1Var.f272m = obj;
                return b1Var;
            case 1:
                b1 b1Var2 = new b1((i2.e0) this.f275p, cVar, 1);
                b1Var2.f272m = obj;
                return b1Var2;
            case 2:
                b1 b1Var3 = new b1((v80.b0) this.f274o, (ea) this.f275p, cVar, 2);
                b1Var3.f272m = obj;
                return b1Var3;
            case 3:
                b1 b1Var4 = new b1((u2.c) this.f275p, cVar, 3);
                b1Var4.f272m = obj;
                return b1Var4;
            case 4:
                b1 b1Var5 = new b1((v80.s1) this.f275p, cVar, 4);
                b1Var5.f272m = obj;
                return b1Var5;
            default:
                b1 b1Var6 = new b1((c40.i) this.f274o, (m2.g) this.f275p, cVar, 5);
                b1Var6.f272m = obj;
                return b1Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f271k) {
            case 0:
                return ((b1) create((w4.k0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 1:
                return ((b1) create((w4.k0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 2:
                return ((b1) create((w4.k0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 3:
                return ((b1) create((w4.k0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            case 4:
                return ((b1) create((o80.k) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
            default:
                return ((b1) create((w4.k0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:232:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x04ed A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:201:0x03b6 -> B:203:0x03b9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:228:0x0430 -> B:230:0x0433). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0099 -> B:26:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:251:0x04cf -> B:253:0x04d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0132 -> B:60:0x0148). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0145 -> B:60:0x0148). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x021c -> B:100:0x0220). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.b1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(Object obj, Object obj2, x70.c cVar, int i11) {
        super(2, cVar);
        this.f271k = i11;
        this.f274o = obj;
        this.f275p = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(Object obj, x70.c cVar, int i11) {
        super(2, cVar);
        this.f271k = i11;
        this.f275p = obj;
    }
}
