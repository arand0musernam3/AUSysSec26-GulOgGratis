package j1;

import b4.t;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lx.u;
import m3.b1;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24384a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f24387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f24388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f24390g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f24391h;

    public /* synthetic */ f(int i11, int i12, int i13, BasketManager basketManager, BasketItem basketItem, Function1 function1, b1 b1Var) {
        this.f24389f = b1Var;
        this.f24385b = i11;
        this.f24390g = basketItem;
        this.f24391h = basketManager;
        this.f24386c = i12;
        this.f24387d = function1;
        this.f24388e = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24384a) {
            case 0:
                ((Integer) obj2).getClass();
                dx.f.f(this.f24385b, this.f24386c, (l1.c) this.f24389f, (l1.b) this.f24390g, (t) this.f24391h, this.f24387d, (n) obj, i.F(this.f24388e | 1));
                break;
            default:
                b1 b1Var = (b1) this.f24389f;
                BasketItem basketItem = (BasketItem) this.f24390g;
                ((Integer) obj2).getClass();
                int iF = i.F(this.f24388e | 1);
                u.b(this.f24385b, this.f24386c, iF, (BasketManager) this.f24391h, basketItem, this.f24387d, (n) obj, b1Var);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ f(int i11, int i12, l1.c cVar, l1.b bVar, t tVar, Function1 function1, int i13) {
        this.f24385b = i11;
        this.f24386c = i12;
        this.f24389f = cVar;
        this.f24390g = bVar;
        this.f24391h = tVar;
        this.f24387d = function1;
        this.f24388e = i13;
    }
}
