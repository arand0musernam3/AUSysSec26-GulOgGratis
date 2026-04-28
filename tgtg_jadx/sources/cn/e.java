package cn;

import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8496a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u70.f f8498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f8499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f8503h;

    public /* synthetic */ e(b4.t tVar, boolean z11, boolean z12, Function0 function0, u3.d dVar, int i11, int i12) {
        this.f8502g = tVar;
        this.f8497b = z11;
        this.f8499d = z12;
        this.f8503h = function0;
        this.f8498c = dVar;
        this.f8500e = i11;
        this.f8501f = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8496a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(1);
                jb.u.h((BaseItemMnuV2) this.f8502g, this.f8500e, this.f8501f, (BasketManager) this.f8503h, this.f8497b, this.f8499d, (Function1) this.f8498c, (m3.n) obj, iF);
                break;
            case 1:
                ((Integer) obj2).getClass();
                g3.g0.a(this.f8497b, (Function1) this.f8498c, (b4.t) this.f8502g, this.f8499d, (g3.z) this.f8503h, (m3.n) obj, m3.i.F(this.f8500e | 1), this.f8501f);
                break;
            default:
                ((Integer) obj2).getClass();
                hg.i.c((b4.t) this.f8502g, this.f8497b, this.f8499d, (Function0) this.f8503h, (u3.d) this.f8498c, (m3.n) obj, m3.i.F(this.f8500e | 1), this.f8501f);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ e(BaseItemMnuV2 baseItemMnuV2, int i11, int i12, BasketManager basketManager, boolean z11, boolean z12, Function1 function1, int i13) {
        this.f8502g = baseItemMnuV2;
        this.f8500e = i11;
        this.f8501f = i12;
        this.f8503h = basketManager;
        this.f8497b = z11;
        this.f8499d = z12;
        this.f8498c = function1;
    }

    public /* synthetic */ e(boolean z11, Function1 function1, b4.t tVar, boolean z12, g3.z zVar, int i11, int i12) {
        this.f8497b = z11;
        this.f8498c = function1;
        this.f8502g = tVar;
        this.f8499d = z12;
        this.f8503h = zVar;
        this.f8500e = i11;
        this.f8501f = i12;
    }
}
