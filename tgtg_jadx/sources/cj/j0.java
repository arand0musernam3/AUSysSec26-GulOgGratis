package cj;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import z1.b4;
import z1.k2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j0 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8270j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8271k;
    public final /* synthetic */ long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f8272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f8273n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f8274o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f8275p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(AtomicBoolean atomicBoolean, s0 s0Var, String str, String str2, long j9, x70.c cVar) {
        super(2, cVar);
        this.f8272m = atomicBoolean;
        this.f8273n = s0Var;
        this.f8274o = str;
        this.f8275p = str2;
        this.l = j9;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f8270j) {
            case 0:
                return new j0((AtomicBoolean) this.f8272m, (s0) this.f8273n, (String) this.f8274o, (String) this.f8275p, this.l, cVar);
            case 1:
                j0 j0Var = new j0((k2) this.f8273n, (x2.w) this.f8274o, this.l, (b2.l) this.f8275p, cVar);
                j0Var.f8272m = obj;
                return j0Var;
            default:
                j0 j0Var2 = new j0((z1.z) this.f8273n, (b4) this.f8274o, (z1.u) this.f8275p, this.l, cVar);
                j0Var2.f8272m = obj;
                return j0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v80.b0 b0Var = (v80.b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f8270j) {
        }
        return ((j0) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        if (r7.b(r4, r18) == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0120, code lost:
    
        if (r4 != r13) goto L62;
     */
    /* JADX WARN: Path cross not found for [B:64:0x012e, B:82:0x01ea], limit reached: 104 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f4 A[Catch: ClassCastException -> 0x024e, TryCatch #1 {ClassCastException -> 0x024e, blocks: (B:49:0x00ee, B:62:0x0125, B:64:0x012e, B:66:0x0139, B:69:0x0145, B:71:0x014d, B:72:0x015b, B:74:0x0163, B:77:0x016e, B:79:0x017b, B:83:0x01ec, B:85:0x01f4, B:87:0x01fc, B:90:0x0202, B:59:0x0115, B:80:0x01c4, B:81:0x01d5), top: B:100:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0120 -> B:62:0x0125). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(z1.z zVar, b4 b4Var, z1.u uVar, long j9, x70.c cVar) {
        super(2, cVar);
        this.f8273n = zVar;
        this.f8274o = b4Var;
        this.f8275p = uVar;
        this.l = j9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k2 k2Var, x2.w wVar, long j9, b2.l lVar, x70.c cVar) {
        super(2, cVar);
        this.f8273n = k2Var;
        this.f8274o = wVar;
        this.l = j9;
        this.f8275p = lVar;
    }
}
