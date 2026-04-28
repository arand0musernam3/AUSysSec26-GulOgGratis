package a3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f350a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.t f351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f354e;

    public /* synthetic */ g(b4.t tVar, Function0 function0, boolean z11, int i11) {
        this.f351b = tVar;
        this.f353d = function0;
        this.f352c = z11;
        this.f354e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m3.n nVar = (m3.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f350a) {
            case 0:
                num.getClass();
                bx.k.j(m3.i.F(this.f354e | 1), this.f351b, this.f353d, nVar, this.f352c);
                break;
            default:
                num.intValue();
                vi.c.h(m3.i.F(this.f354e | 1), this.f351b, this.f353d, nVar, this.f352c);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ g(b4.t tVar, boolean z11, Function0 function0, int i11) {
        this.f351b = tVar;
        this.f352c = z11;
        this.f353d = function0;
        this.f354e = i11;
    }
}
