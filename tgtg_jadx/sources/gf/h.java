package gf;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import m3.n;
import v80.f0;
import z1.e3;
import z1.g3;
import z5.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h extends AdaptedFunctionReference implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20417a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i11, Object obj, Class cls, String str, String str2, int i12, int i13) {
        super(i11, obj, cls, str, str2, i12);
        this.f20417a = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20417a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ye.b.k((ye.b) this.receiver, str, (Map) obj2, 4);
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                ye.b.k((ye.b) this.receiver, str2, (Map) obj2, 4);
                break;
            case 2:
                int iIntValue = ((Number) obj2).intValue();
                ((u3.d) this.receiver).e((n) obj, iIntValue);
                break;
            default:
                long j9 = ((q) obj).f47292a;
                g3 g3Var = (g3) this.receiver;
                f0.B(g3Var.K.c(), null, null, new e3(g3Var, j9, null, 1), 3);
                break;
        }
        return Unit.f26487a;
    }
}
