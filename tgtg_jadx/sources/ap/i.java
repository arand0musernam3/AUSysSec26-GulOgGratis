package ap;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import o00.x0;
import y80.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f4539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f4540c;

    public /* synthetic */ i(n nVar, Activity activity, int i11) {
        this.f4538a = i11;
        this.f4539b = nVar;
        this.f4540c = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4538a) {
            case 0:
                n nVar = this.f4539b;
                a2 a2Var = nVar.f4568j;
                Boolean bool = Boolean.TRUE;
                a2Var.getClass();
                a2Var.k(null, bool);
                Activity activity = this.f4540c;
                x0.i(nVar, activity);
                if (activity != null) {
                    activity.finish();
                }
                break;
            default:
                n nVar2 = this.f4539b;
                a2 a2Var2 = nVar2.f4568j;
                Boolean bool2 = Boolean.TRUE;
                a2Var2.getClass();
                a2Var2.k(null, bool2);
                Activity activity2 = this.f4540c;
                x0.i(nVar2, activity2);
                if (activity2 != null) {
                    activity2.finish();
                }
                break;
        }
        return Unit.f26487a;
    }
}
