package bn;

import com.app.tgtg.model.remote.item.response.CategoryNavigationCard;
import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import d2.z1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6404a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6411h;

    public /* synthetic */ b(int i11, List list, CategoryNavigationCard categoryNavigationCard, String str, Function2 function2, Function2 function22, int i12) {
        this.f6406c = i11;
        this.f6408e = list;
        this.f6409f = categoryNavigationCard;
        this.f6405b = str;
        this.f6410g = function2;
        this.f6411h = function22;
        this.f6407d = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6404a) {
            case 0:
                ((Integer) obj2).intValue();
                h0.g.c(this.f6406c, (List) this.f6408e, (CategoryNavigationCard) this.f6409f, (String) this.f6405b, (Function2) this.f6410g, (Function2) this.f6411h, (m3.n) obj, m3.i.F(this.f6407d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ki.j.h((b4.t) this.f6408e, (String) this.f6405b, (String) this.f6409f, (String) this.f6410g, (Function0) this.f6411h, (m3.n) obj, m3.i.F(this.f6406c | 1), this.f6407d);
                break;
            default:
                ((Integer) obj2).getClass();
                rn.a.b((ProfileFeature) this.f6408e, (z1) this.f6409f, (Function0) this.f6405b, (Function0) this.f6410g, (b1) this.f6411h, (m3.n) obj, m3.i.F(this.f6406c | 1), this.f6407d);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ b(b4.t tVar, String str, String str2, String str3, Function0 function0, int i11, int i12) {
        this.f6408e = tVar;
        this.f6405b = str;
        this.f6409f = str2;
        this.f6410g = str3;
        this.f6411h = function0;
        this.f6406c = i11;
        this.f6407d = i12;
    }

    public /* synthetic */ b(ProfileFeature profileFeature, z1 z1Var, Function0 function0, Function0 function02, b1 b1Var, int i11, int i12) {
        this.f6408e = profileFeature;
        this.f6409f = z1Var;
        this.f6405b = function0;
        this.f6410g = function02;
        this.f6411h = b1Var;
        this.f6406c = i11;
        this.f6407d = i12;
    }
}
