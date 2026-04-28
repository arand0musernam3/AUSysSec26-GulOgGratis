package b5;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f5853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f5854b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m0 m0Var, Ref.ObjectRef objectRef) {
        super(0);
        this.f5853a = m0Var;
        this.f5854b = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [b4.s] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [o3.e] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v7, types: [T, j5.n] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        l1 l1Var = this.f5853a.G;
        if ((l1Var.f5860f.getAggregateChildKindSet$ui() & 8) != 0) {
            for (b4.s parent$ui = l1Var.f5859e; parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
                if ((parent$ui.getKindSet$ui() & 8) != 0) {
                    ?? B = parent$ui;
                    ?? eVar = 0;
                    while (B != 0) {
                        if (B instanceof l2) {
                            l2 l2Var = (l2) B;
                            boolean zG = l2Var.G();
                            Ref.ObjectRef objectRef = this.f5854b;
                            if (zG) {
                                ?? nVar = new j5.n();
                                objectRef.element = nVar;
                                nVar.f24685d = true;
                            }
                            if (l2Var.F0()) {
                                ((j5.n) objectRef.element).f24684c = true;
                            }
                            l2Var.h0((j5.b0) objectRef.element);
                        } else if ((B.getKindSet$ui() & 8) != 0 && (B instanceof n)) {
                            b4.s child$ui = ((n) B).f5892p;
                            int i11 = 0;
                            B = B;
                            eVar = eVar;
                            while (child$ui != null) {
                                if ((child$ui.getKindSet$ui() & 8) != 0) {
                                    i11++;
                                    eVar = eVar;
                                    if (i11 == 1) {
                                        B = child$ui;
                                    } else {
                                        if (eVar == 0) {
                                            eVar = new o3.e(new b4.s[16], 0);
                                        }
                                        if (B != 0) {
                                            eVar.b(B);
                                            B = 0;
                                        }
                                        eVar.b(child$ui);
                                    }
                                }
                                child$ui = child$ui.getChild$ui();
                                B = B;
                                eVar = eVar;
                            }
                            if (i11 == 1) {
                            }
                        }
                        B = m.b(eVar);
                    }
                }
            }
        }
        return Unit.f26487a;
    }
}
