package i9;

import b0.z;
import com.tgtg.componentlibrary.component.pageheader.model.PageHeaderState;
import com.tgtg.componentlibrary.component.pageheader.variant.PagePantryPageHeaderKt;
import g9.f0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b4.t f23550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u70.f f23553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u70.f f23554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u70.f f23555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u70.f f23556i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f23557j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f23558k;
    public final /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f23559m;

    public /* synthetic */ t(String str, PageHeaderState pageHeaderState, Function0 function0, b4.t tVar, String str2, String str3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, int i11, int i12) {
        this.f23548a = 2;
        this.f23549b = str;
        this.l = pageHeaderState;
        this.f23551d = function0;
        this.f23550c = tVar;
        this.f23559m = str2;
        this.f23552e = str3;
        this.f23553f = function2;
        this.f23554g = function22;
        this.f23555h = function23;
        this.f23556i = function24;
        this.f23557j = i11;
        this.f23558k = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23548a) {
            case 0:
                ((Integer) obj2).getClass();
                z.g((f0) this.f23549b, this.l, this.f23550c, (b4.f) this.f23551d, (Map) this.f23559m, (Function1) this.f23552e, (Function1) this.f23553f, (Function1) this.f23554g, (Function1) this.f23555h, (Function1) this.f23556i, (m3.n) obj, m3.i.F(this.f23557j | 1), this.f23558k);
                break;
            case 1:
                ((Integer) obj2).getClass();
                z.h((f0) this.f23549b, (String) this.l, this.f23550c, (b4.f) this.f23551d, (String) this.f23559m, (Function1) this.f23552e, (Function1) this.f23553f, (Function1) this.f23554g, (Function1) this.f23555h, (Function1) this.f23556i, (m3.n) obj, m3.i.F(this.f23557j | 1), this.f23558k);
                break;
            default:
                ((Integer) obj2).intValue();
                PagePantryPageHeaderKt.PagePantryPageHeader((String) this.f23549b, (PageHeaderState) this.l, (Function0) this.f23551d, this.f23550c, (String) this.f23559m, (String) this.f23552e, (Function2) this.f23553f, (Function2) this.f23554g, (Function2) this.f23555h, (Function2) this.f23556i, (m3.n) obj, m3.i.F(this.f23557j | 1), this.f23558k);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ t(f0 f0Var, Object obj, b4.t tVar, b4.f fVar, Object obj2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i11, int i12, int i13) {
        this.f23548a = i13;
        this.f23549b = f0Var;
        this.l = obj;
        this.f23550c = tVar;
        this.f23551d = fVar;
        this.f23559m = obj2;
        this.f23552e = function1;
        this.f23553f = function12;
        this.f23554g = function13;
        this.f23555h = function14;
        this.f23556i = function15;
        this.f23557j = i11;
        this.f23558k = i12;
    }
}
