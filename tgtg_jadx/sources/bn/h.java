package bn;

import com.app.tgtg.model.local.LatestInteractionOrigin;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import d6.i0;
import g3.ba;
import g3.ea;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m5.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6460a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.t f6461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f6462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6468i;

    public /* synthetic */ h(b4.t tVar, BaseItemMnuV2 baseItemMnuV2, int i11, boolean z11, LatestInteractionOrigin latestInteractionOrigin, Function1 function1, ym.z zVar, int i12) {
        this.f6461b = tVar;
        this.f6465f = baseItemMnuV2;
        this.f6463d = i11;
        this.f6462c = z11;
        this.f6466g = latestInteractionOrigin;
        this.f6467h = function1;
        this.f6468i = zVar;
        this.f6464e = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6460a) {
            case 0:
                ((Integer) obj2).getClass();
                jb.u.i(this.f6461b, (BaseItemMnuV2) this.f6465f, this.f6463d, this.f6462c, (LatestInteractionOrigin) this.f6466g, (Function1) this.f6467h, (ym.z) this.f6468i, (m3.n) obj, m3.i.F(this.f6464e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ba.b((i0) this.f6465f, (u3.d) this.f6466g, (ea) this.f6467h, this.f6461b, this.f6462c, (Function2) this.f6468i, (m3.n) obj, m3.i.F(this.f6463d | 1), this.f6464e);
                break;
            default:
                ((Integer) obj2).getClass();
                h0.g.g(this.f6461b, (String) this.f6465f, (String) this.f6466g, this.f6462c, (u0) this.f6467h, (u0) this.f6468i, (m3.n) obj, m3.i.F(this.f6463d | 1), this.f6464e);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ h(b4.t tVar, String str, String str2, boolean z11, u0 u0Var, u0 u0Var2, int i11, int i12) {
        this.f6461b = tVar;
        this.f6465f = str;
        this.f6466g = str2;
        this.f6462c = z11;
        this.f6467h = u0Var;
        this.f6468i = u0Var2;
        this.f6463d = i11;
        this.f6464e = i12;
    }

    public /* synthetic */ h(i0 i0Var, u3.d dVar, ea eaVar, b4.t tVar, boolean z11, Function2 function2, int i11, int i12) {
        this.f6465f = i0Var;
        this.f6466g = dVar;
        this.f6467h = eaVar;
        this.f6461b = tVar;
        this.f6462c = z11;
        this.f6468i = function2;
        this.f6463d = i11;
        this.f6464e = i12;
    }
}
