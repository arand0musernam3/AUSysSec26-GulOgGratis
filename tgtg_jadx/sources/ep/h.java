package ep;

import android.content.Context;
import g9.f0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.b1;
import m3.c3;
import mv.r0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f16284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f16285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f16286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c3 f16287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1 f16288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b1 f16289g;

    public /* synthetic */ h(f0 f0Var, d0 d0Var, Context context, c3 c3Var, b1 b1Var, b1 b1Var2, int i11) {
        this.f16283a = i11;
        this.f16284b = f0Var;
        this.f16285c = d0Var;
        this.f16286d = context;
        this.f16287e = c3Var;
        this.f16288f = b1Var;
        this.f16289g = b1Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        switch (this.f16283a) {
            case 0:
                list.getClass();
                if (((Boolean) this.f16287e.getValue()).booleanValue()) {
                    g9.p.f(this.f16284b, hp.s.INSTANCE.f22335a);
                    this.f16285c.x(list, r0.u(this.f16286d), hp.d.FROM_CAMERA);
                } else {
                    this.f16288f.setValue(new hp.c(list, hp.d.FROM_CAMERA));
                    this.f16289g.setValue(Boolean.TRUE);
                }
                break;
            default:
                if (((Boolean) this.f16287e.getValue()).booleanValue()) {
                    g9.p.f(this.f16284b, hp.s.INSTANCE.f22335a);
                    this.f16285c.x(list, r0.u(this.f16286d), hp.d.FROM_GALLERY);
                } else {
                    this.f16288f.setValue(new hp.c(list, hp.d.FROM_GALLERY));
                    this.f16289g.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.f26487a;
    }
}
