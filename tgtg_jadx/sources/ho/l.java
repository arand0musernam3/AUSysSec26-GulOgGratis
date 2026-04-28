package ho;

import b4.t;
import com.app.tgtg.model.remote.specialrewards.SpecialReward;
import com.tgtg.componentlibrary.component.checkbox.PantryCheckboxKt;
import jb.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f22235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f22239g;

    public /* synthetic */ l(l5.a aVar, Function0 function0, t tVar, boolean z11, int i11, int i12) {
        this.f22233a = 1;
        this.f22238f = aVar;
        this.f22239g = function0;
        this.f22234b = tVar;
        this.f22235c = z11;
        this.f22236d = i11;
        this.f22237e = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22233a) {
            case 0:
                ((Integer) obj2).getClass();
                u.m((t) this.f22234b, (String) this.f22238f, (String) this.f22239g, this.f22235c, (m3.n) obj, m3.i.F(this.f22236d | 1), this.f22237e);
                break;
            case 1:
                ((Integer) obj2).intValue();
                PantryCheckboxKt.PantryTristateCheckbox((l5.a) this.f22238f, (Function0) this.f22239g, (t) this.f22234b, this.f22235c, (m3.n) obj, m3.i.F(this.f22236d | 1), this.f22237e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                lp.d.d((n4.b) this.f22234b, (String) this.f22238f, (String) this.f22239g, this.f22235c, (m3.n) obj, m3.i.F(this.f22236d | 1), this.f22237e);
                break;
            case 3:
                ((Integer) obj2).getClass();
                os.a.e((t) this.f22234b, (SpecialReward) this.f22238f, this.f22235c, (Function1) this.f22239g, (m3.n) obj, m3.i.F(this.f22236d | 1), this.f22237e);
                break;
            default:
                ((Integer) obj2).getClass();
                ug.c.h((t) this.f22234b, (String) this.f22238f, this.f22235c, (Function0) this.f22239g, (m3.n) obj, m3.i.F(this.f22236d | 1), this.f22237e);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ l(Object obj, String str, String str2, boolean z11, int i11, int i12, int i13) {
        this.f22233a = i13;
        this.f22234b = obj;
        this.f22238f = str;
        this.f22239g = str2;
        this.f22235c = z11;
        this.f22236d = i11;
        this.f22237e = i12;
    }

    public /* synthetic */ l(t tVar, Object obj, boolean z11, u70.f fVar, int i11, int i12, int i13) {
        this.f22233a = i13;
        this.f22234b = tVar;
        this.f22238f = obj;
        this.f22235c = z11;
        this.f22239g = fVar;
        this.f22236d = i11;
        this.f22237e = i12;
    }
}
