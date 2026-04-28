package pi;

import com.google.android.gms.internal.measurement.cg;
import g3.w6;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35374a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f35375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f35376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f35377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f35378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f35379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f35380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f35381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f35382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f35383j;

    public /* synthetic */ g(w6 w6Var, String str, String str2, String str3, String str4, String str5, boolean z11, Function0 function0, Function0 function02, int i11) {
        this.f35379f = w6Var;
        this.f35377d = str;
        this.f35380g = str2;
        this.f35381h = str3;
        this.f35382i = str4;
        this.f35383j = str5;
        this.f35378e = z11;
        this.f35375b = function0;
        this.f35376c = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35374a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(100663297);
                z20.b.b((w6) this.f35379f, this.f35377d, (String) this.f35380g, (String) this.f35381h, (String) this.f35382i, (String) this.f35383j, this.f35378e, this.f35375b, this.f35376c, (m3.n) obj, iF);
                break;
            default:
                ((Integer) obj2).getClass();
                int iF2 = m3.i.F(100663297);
                cg.h((yk.h) this.f35379f, (np.b) this.f35380g, this.f35375b, this.f35376c, (Function0) this.f35381h, (i80.n) this.f35382i, this.f35377d, this.f35378e, (Function0) this.f35383j, (m3.n) obj, iF2);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ g(yk.h hVar, np.b bVar, Function0 function0, Function0 function02, Function0 function03, i80.n nVar, String str, boolean z11, Function0 function04, int i11) {
        this.f35379f = hVar;
        this.f35380g = bVar;
        this.f35375b = function0;
        this.f35376c = function02;
        this.f35381h = function03;
        this.f35382i = nVar;
        this.f35377d = str;
        this.f35378e = z11;
        this.f35383j = function04;
    }
}
