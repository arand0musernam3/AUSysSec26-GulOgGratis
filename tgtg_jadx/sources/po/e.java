package po;

import g3.w6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w6 f35588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f35589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f35590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f35591e;

    public /* synthetic */ e(w6 w6Var, Function0 function0, Function0 function02, float f11, int i11, int i12) {
        this.f35587a = i12;
        this.f35588b = w6Var;
        this.f35589c = function0;
        this.f35590d = function02;
        this.f35591e = f11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35587a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = i.F(385);
                c.h(this.f35588b, this.f35589c, this.f35590d, this.f35591e, (n) obj, iF);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF2 = i.F(385);
                c.k(this.f35588b, this.f35589c, this.f35590d, this.f35591e, (n) obj, iF2);
                break;
        }
        return Unit.f26487a;
    }
}
