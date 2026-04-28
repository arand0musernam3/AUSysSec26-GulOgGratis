package bn;

import com.app.tgtg.model.remote.item.response.ModularFeedAction;
import g3.b9;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6450a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f6452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f6453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6457h;

    public /* synthetic */ f0(int i11, b4.t tVar, long j9, long j11, u3.d dVar, Function2 function2, u3.d dVar2, int i12) {
        this.f6451b = i11;
        this.f6454e = tVar;
        this.f6452c = j9;
        this.f6453d = j11;
        this.f6455f = dVar;
        this.f6456g = function2;
        this.f6457h = dVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6450a) {
            case 0:
                ((Integer) obj2).intValue();
                m0.c.J((String) this.f6454e, (String) this.f6455f, (ModularFeedAction) this.f6456g, this.f6452c, this.f6453d, (ym.y) this.f6457h, (m3.n) obj, m3.i.F(this.f6451b | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(1600897);
                b9.d(this.f6451b, (b4.t) this.f6454e, this.f6452c, this.f6453d, (u3.d) this.f6455f, (Function2) this.f6456g, (u3.d) this.f6457h, (m3.n) obj, iF);
                break;
            default:
                ((Integer) obj2).intValue();
                b9.f((b4.t) this.f6454e, this.f6452c, this.f6453d, (i80.n) this.f6455f, (Function2) this.f6456g, (Function2) this.f6457h, (m3.n) obj, m3.i.F(this.f6451b | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ f0(b4.t tVar, long j9, long j11, i80.n nVar, Function2 function2, Function2 function22, int i11) {
        this.f6454e = tVar;
        this.f6452c = j9;
        this.f6453d = j11;
        this.f6455f = nVar;
        this.f6456g = function2;
        this.f6457h = function22;
        this.f6451b = i11;
    }

    public /* synthetic */ f0(String str, String str2, ModularFeedAction modularFeedAction, long j9, long j11, ym.y yVar, int i11) {
        this.f6454e = str;
        this.f6455f = str2;
        this.f6456g = modularFeedAction;
        this.f6452c = j9;
        this.f6453d = j11;
        this.f6457h = yVar;
        this.f6451b = i11;
    }
}
