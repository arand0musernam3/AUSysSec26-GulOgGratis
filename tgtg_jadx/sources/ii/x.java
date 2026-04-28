package ii;

import android.app.Activity;
import com.app.tgtg.model.remote.item.response.CharityItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class x implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23997a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b4.t f23998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f23999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f24000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f24001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f24002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f24003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function0 f24004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24005i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f24006j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f24007k;

    public /* synthetic */ x(b4.t tVar, Activity activity, j0 j0Var, Function1 function1, Function0 function0, Function1 function12, Function0 function02, Function0 function03, Function1 function13, int i11) {
        this.f23998b = tVar;
        this.f24006j = activity;
        this.f24007k = j0Var;
        this.f23999c = function1;
        this.f24002f = function0;
        this.f24000d = function12;
        this.f24003g = function02;
        this.f24004h = function03;
        this.f24001e = function13;
        this.f24005i = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f23997a) {
            case 0:
                ((Integer) obj2).getClass();
                l.h(this.f23998b, (Activity) this.f24006j, (j0) this.f24007k, this.f23999c, this.f24002f, this.f24000d, this.f24003g, this.f24004h, this.f24001e, (m3.n) obj, m3.i.F(this.f24005i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ki.j.a(this.f23998b, (CharityItem) this.f24006j, this.f23999c, this.f24000d, this.f24001e, this.f24002f, (Function1) this.f24007k, this.f24003g, this.f24004h, (m3.n) obj, m3.i.F(this.f24005i | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ x(b4.t tVar, CharityItem charityItem, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Function1 function14, Function0 function02, Function0 function03, int i11) {
        this.f23998b = tVar;
        this.f24006j = charityItem;
        this.f23999c = function1;
        this.f24000d = function12;
        this.f24001e = function13;
        this.f24002f = function0;
        this.f24007k = function14;
        this.f24003g = function02;
        this.f24004h = function03;
        this.f24005i = i11;
    }
}
