package lp;

import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.user.requests.UserAddress;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28056a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f28059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f28061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u70.f f28062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u70.f f28063h;

    public /* synthetic */ l(int i11, int i12, com.google.firebase.messaging.a0 a0Var, tm.e eVar, boolean z11, Function2 function2, u3.d dVar, int i13) {
        this.f28057b = i11;
        this.f28058c = i12;
        this.f28060e = a0Var;
        this.f28061f = eVar;
        this.f28059d = z11;
        this.f28062g = function2;
        this.f28063h = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f28056a) {
            case 0:
                ((Integer) obj2).getClass();
                d.s((b4.t) this.f28060e, (DiscoverBucket) this.f28061f, (Function0) this.f28062g, (Function0) this.f28063h, this.f28059d, (m3.n) obj, m3.i.F(this.f28057b | 1), this.f28058c);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(1769473);
                pm.a.a(this.f28057b, this.f28058c, (com.google.firebase.messaging.a0) this.f28060e, (tm.e) this.f28061f, this.f28059d, (Function2) this.f28062g, (u3.d) this.f28063h, (m3.n) obj, iF);
                break;
            default:
                ((Integer) obj2).getClass();
                wi.a.c((jg.c) this.f28060e, (UserAddress) this.f28061f, (Function0) this.f28062g, this.f28059d, (Function0) this.f28063h, (m3.n) obj, m3.i.F(this.f28057b | 1), this.f28058c);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ l(b4.t tVar, DiscoverBucket discoverBucket, Function0 function0, Function0 function02, boolean z11, int i11, int i12) {
        this.f28060e = tVar;
        this.f28061f = discoverBucket;
        this.f28062g = function0;
        this.f28063h = function02;
        this.f28059d = z11;
        this.f28057b = i11;
        this.f28058c = i12;
    }

    public /* synthetic */ l(jg.c cVar, UserAddress userAddress, Function0 function0, boolean z11, Function0 function02, int i11, int i12) {
        this.f28060e = cVar;
        this.f28061f = userAddress;
        this.f28062g = function0;
        this.f28059d = z11;
        this.f28063h = function02;
        this.f28057b = i11;
        this.f28058c = i12;
    }
}
