package d60;

import b4.t;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.AverageItemRating;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import com.tgtg.componentlibrary.component.avatar.model.AvatarSize;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarTextKt;
import g3.k6;
import g3.la;
import g3.p0;
import g3.t2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lx.u;
import m3.b1;
import m3.i;
import m3.n;
import rk.e;
import u00.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14547a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f14551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f14553g;

    public /* synthetic */ b(int i11, int i12, int i13, BasketManager basketManager, BasketItem basketItem, Function1 function1, b1 b1Var) {
        this.f14550d = basketItem;
        this.f14551e = basketManager;
        this.f14548b = i11;
        this.f14549c = i12;
        this.f14552f = b1Var;
        this.f14553g = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14547a) {
            case 0:
                ((Integer) obj2).intValue();
                PantryAvatarTextKt.PantryAvatarText((String) this.f14550d, (t) this.f14552f, (String) this.f14551e, (AvatarSize) this.f14553g, (n) obj, i.F(this.f14548b | 1), this.f14549c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                t2.b((p0) this.f14550d, (k6) this.f14551e, (la) this.f14552f, (Function2) this.f14553g, (n) obj, i.F(this.f14548b | 1), this.f14549c);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iF = i.F(1);
                d.f(this.f14548b, this.f14549c, (gj.a) this.f14550d, (Function1) this.f14551e, (Function1) this.f14552f, (Function1) this.f14553g, (n) obj, iF);
                break;
            case 3:
                ((Integer) obj2).getClass();
                e.J((String) this.f14550d, (Double) this.f14552f, (AverageItemRating) this.f14553g, (String) this.f14551e, this.f14548b, (n) obj, i.F(this.f14549c | 1));
                break;
            default:
                BasketItem basketItem = (BasketItem) this.f14550d;
                BasketManager basketManager = (BasketManager) this.f14551e;
                b1 b1Var = (b1) this.f14552f;
                ((Integer) obj2).getClass();
                int iF2 = i.F(221185);
                u.c(this.f14548b, this.f14549c, iF2, basketManager, basketItem, (Function1) this.f14553g, (n) obj, b1Var);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b(int i11, int i12, gj.a aVar, Function1 function1, Function1 function12, Function1 function13, int i13) {
        this.f14548b = i11;
        this.f14549c = i12;
        this.f14550d = aVar;
        this.f14551e = function1;
        this.f14552f = function12;
        this.f14553g = function13;
    }

    public /* synthetic */ b(p0 p0Var, k6 k6Var, la laVar, Function2 function2, int i11, int i12) {
        this.f14550d = p0Var;
        this.f14551e = k6Var;
        this.f14552f = laVar;
        this.f14553g = function2;
        this.f14548b = i11;
        this.f14549c = i12;
    }

    public /* synthetic */ b(String str, t tVar, String str2, AvatarSize avatarSize, int i11, int i12) {
        this.f14550d = str;
        this.f14552f = tVar;
        this.f14551e = str2;
        this.f14553g = avatarSize;
        this.f14548b = i11;
        this.f14549c = i12;
    }

    public /* synthetic */ b(String str, Double d3, AverageItemRating averageItemRating, String str2, int i11, int i12) {
        this.f14550d = str;
        this.f14552f = d3;
        this.f14553g = averageItemRating;
        this.f14551e = str2;
        this.f14548b = i11;
        this.f14549c = i12;
    }
}
