package c5;

import androidx.compose.ui.node.Owner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7358d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(y yVar, f1 f1Var, Function2 function2) {
        super(2);
        this.f7355a = 0;
        this.f7358d = yVar;
        this.f7356b = f1Var;
        this.f7357c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7355a) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Number) obj2).intValue();
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1.a((y) this.f7358d, (f1) this.f7356b, (Function2) this.f7357c, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                x1.a((Owner) this.f7358d, (f1) this.f7356b, (Function2) this.f7357c, (m3.n) obj, m3.i.F(1));
                break;
            default:
                ((Number) obj2).intValue();
                z4.c0.a((b4.t) this.f7358d, (u3.d) this.f7356b, (z4.u0) this.f7357c, (m3.n) obj, m3.i.F(49));
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(Object obj, Object obj2, Object obj3, int i11, int i12) {
        super(2);
        this.f7355a = i12;
        this.f7358d = obj;
        this.f7356b = obj2;
        this.f7357c = obj3;
    }
}
