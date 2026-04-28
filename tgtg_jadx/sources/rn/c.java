package rn;

import com.app.tgtg.model.remote.profile.response.ProfileFeature;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProfileFeature f38145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f38146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f38147d;

    public /* synthetic */ c(ProfileFeature profileFeature, Function0 function0, Function1 function1, int i11, int i12) {
        this.f38144a = i12;
        this.f38145b = profileFeature;
        this.f38146c = function0;
        this.f38147d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f38144a;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.f(this.f38145b, this.f38146c, this.f38147d, nVar, i.F(1));
                break;
            default:
                a.e(this.f38145b, this.f38146c, this.f38147d, nVar, i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
