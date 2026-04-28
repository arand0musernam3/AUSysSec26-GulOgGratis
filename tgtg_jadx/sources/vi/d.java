package vi;

import cj.e0;
import cj.q;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f42349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f42350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UserAddress f42351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f42352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f42353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f42354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function0 f42355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function0 f42356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function2 f42357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f42358k;

    public /* synthetic */ d(q qVar, e0 e0Var, UserAddress userAddress, String str, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function2 function2, int i11, int i12) {
        this.f42348a = i12;
        this.f42349b = qVar;
        this.f42350c = e0Var;
        this.f42351d = userAddress;
        this.f42352e = str;
        this.f42353f = function0;
        this.f42354g = function02;
        this.f42355h = function03;
        this.f42356i = function04;
        this.f42357j = function2;
        this.f42358k = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f42348a) {
            case 0:
                ((Integer) obj2).intValue();
                c.c(this.f42349b, this.f42350c, this.f42351d, this.f42352e, this.f42353f, this.f42354g, this.f42355h, this.f42356i, this.f42357j, (m3.n) obj, m3.i.F(this.f42358k | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                wi.m.c(this.f42349b, this.f42350c, this.f42351d, this.f42352e, this.f42353f, this.f42354g, this.f42355h, this.f42356i, this.f42357j, (m3.n) obj, m3.i.F(this.f42358k | 1));
                break;
        }
        return Unit.f26487a;
    }
}
