package d6;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Lambda implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f14440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f14441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f14442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f14443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f14444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f14445g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14446a;

    static {
        int i11 = 1;
        f14440b = new d(i11, 0);
        f14441c = new d(i11, 1);
        f14442d = new d(i11, 2);
        f14443e = new d(i11, 3);
        f14444f = new d(i11, 4);
        f14445g = new d(i11, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i11, int i12) {
        super(i11);
        this.f14446a = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14446a) {
            case 0:
                KProperty[] kPropertyArr = j5.z.f24734a;
                j5.a0 a0Var = j5.x.f24729x;
                Unit unit = Unit.f26487a;
                ((j5.b0) obj).b(a0Var, unit);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                KProperty[] kPropertyArr2 = j5.z.f24734a;
                j5.a0 a0Var2 = j5.x.f24728w;
                Unit unit2 = Unit.f26487a;
                ((j5.b0) obj).b(a0Var2, unit2);
                break;
            case 4:
                break;
            default:
                g0 g0Var = (g0) obj;
                if (g0Var.isAttachedToWindow()) {
                    g0Var.m();
                }
                break;
        }
        return Unit.f26487a;
    }
}
