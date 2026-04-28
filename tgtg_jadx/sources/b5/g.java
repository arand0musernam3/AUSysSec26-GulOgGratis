package b5;

import c5.u3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import m3.d3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Lambda implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f5827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f5828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f5829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f5830e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5831a;

    static {
        int i11 = 2;
        f5827b = new g(i11, 0);
        f5828c = new g(i11, 1);
        f5829d = new g(i11, 2);
        f5830e = new g(i11, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i11, int i12) {
        super(i11);
        this.f5831a = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5831a) {
            case 0:
                ((Number) obj2).intValue();
                ((j) obj).getClass();
                break;
            case 1:
                ((m0) ((j) obj)).f0((z4.u0) obj2);
                break;
            case 2:
                ((m0) ((j) obj)).g0((b4.t) obj2);
                break;
            default:
                m3.c0 c0Var = (m3.c0) obj2;
                m0 m0Var = (m0) ((j) obj);
                m0Var.C = c0Var;
                l1 l1Var = m0Var.G;
                d3 d3Var = c5.x1.f7416h;
                u3.i iVar = (u3.i) c0Var;
                iVar.getClass();
                m0Var.c0((z5.c) m3.i.y(iVar, d3Var));
                z5.m mVar = (z5.m) m3.i.y(iVar, c5.x1.f7421n);
                if (m0Var.A != mVar) {
                    m0Var.A = mVar;
                    m0Var.F();
                    m0 m0VarW = m0Var.w();
                    if (m0VarW != null) {
                        m0VarW.D();
                    }
                    m0Var.E();
                    for (b4.s child$ui = l1Var.f5860f; child$ui != null; child$ui = child$ui.getChild$ui()) {
                        child$ui.onLayoutDirectionChange();
                    }
                }
                m0Var.h0((u3) m3.i.y(iVar, c5.x1.f7426s));
                if ((l1Var.f5860f.getAggregateChildKindSet$ui() & 32768) != 0) {
                    for (b4.s child$ui2 = l1Var.f5860f; child$ui2 != null; child$ui2 = child$ui2.getChild$ui()) {
                        if ((child$ui2.getKindSet$ui() & 32768) != 0) {
                            ?? B = child$ui2;
                            ?? eVar = 0;
                            while (B != 0) {
                                if (B instanceof k) {
                                    b4.s node = ((b4.s) ((k) B)).getNode();
                                    if (node.isAttached()) {
                                        t1.d(node);
                                    } else {
                                        node.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
                                    }
                                } else if ((B.getKindSet$ui() & 32768) != 0 && (B instanceof n)) {
                                    b4.s child$ui3 = ((n) B).f5892p;
                                    int i11 = 0;
                                    B = B;
                                    eVar = eVar;
                                    while (child$ui3 != null) {
                                        if ((child$ui3.getKindSet$ui() & 32768) != 0) {
                                            i11++;
                                            eVar = eVar;
                                            if (i11 == 1) {
                                                B = child$ui3;
                                            } else {
                                                if (eVar == 0) {
                                                    eVar = new o3.e(new b4.s[16], 0);
                                                }
                                                if (B != 0) {
                                                    eVar.b(B);
                                                    B = 0;
                                                }
                                                eVar.b(child$ui3);
                                            }
                                        }
                                        child$ui3 = child$ui3.getChild$ui();
                                        B = B;
                                        eVar = eVar;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                B = m.b(eVar);
                            }
                        }
                        if ((child$ui2.getAggregateChildKindSet$ui() & 32768) != 0) {
                        }
                    }
                }
                break;
        }
        return Unit.f26487a;
    }
}
