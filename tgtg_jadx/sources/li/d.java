package li;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.b1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f27855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ry.c f27856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b1 f27857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b1 f27858e;

    public /* synthetic */ d(Context context, ry.c cVar, b1 b1Var, b1 b1Var2, int i11) {
        this.f27854a = i11;
        this.f27855b = context;
        this.f27856c = cVar;
        this.f27857d = b1Var;
        this.f27858e = b1Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f27854a;
        ((Boolean) obj).getClass();
        switch (i11) {
            case 0:
                int iA = androidx.core.app.e.a(this.f27855b, "android.permission.POST_NOTIFICATIONS");
                b1 b1Var = this.f27857d;
                if (iA == 0 || ((Boolean) this.f27858e.getValue()).booleanValue()) {
                    b1Var.setValue(Boolean.TRUE);
                } else {
                    this.f27856c.h();
                }
                break;
            default:
                int iA2 = androidx.core.app.e.a(this.f27855b, "android.permission.POST_NOTIFICATIONS");
                b1 b1Var2 = this.f27857d;
                if (iA2 == 0 || ((Boolean) this.f27858e.getValue()).booleanValue()) {
                    b1Var2.setValue(Boolean.TRUE);
                } else {
                    this.f27856c.h();
                }
                break;
        }
        return Unit.f26487a;
    }
}
