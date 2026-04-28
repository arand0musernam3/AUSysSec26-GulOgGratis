package he;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;
import m2.c2;
import o00.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21911c;

    public /* synthetic */ g(Object obj, int i11, int i12) {
        this.f21909a = i12;
        this.f21911c = obj;
        this.f21910b = i11;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f21909a) {
            case 0:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f21911c;
                boolean z11 = lottieAnimationView.f8860j;
                int i11 = this.f21910b;
                if (!z11) {
                    return o.g(lottieAnimationView.getContext(), null, i11);
                }
                Context context = lottieAnimationView.getContext();
                return o.g(context, o.l(context, i11), i11);
            default:
                WorkDatabase workDatabase = (WorkDatabase) ((ky.o) this.f21911c).f26718b;
                Long lA = workDatabase.t().a("next_job_scheduler_id");
                int i12 = 0;
                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                int i13 = iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1;
                qb.d dVarT = workDatabase.t();
                x0.A(dVarT.f36792a, false, true, new c2(17, dVarT, new qb.c("next_job_scheduler_id", Long.valueOf(i13))));
                if (iLongValue < 0 || iLongValue > this.f21910b) {
                    qb.d dVarT2 = workDatabase.t();
                    x0.A(dVarT2.f36792a, false, true, new c2(17, dVarT2, new qb.c("next_job_scheduler_id", Long.valueOf(1))));
                } else {
                    i12 = iLongValue;
                }
                return Integer.valueOf(i12);
        }
    }
}
