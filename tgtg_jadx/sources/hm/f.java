package hm;

import android.widget.Toast;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.m1;
import com.app.tgtg.R;
import com.app.tgtg.feature.login.LoginActivity;
import com.app.tgtg.feature.main.MainActivity;
import h2.a0;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import pg.u1;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f22115b;

    public /* synthetic */ f(MainActivity mainActivity, int i11) {
        this.f22114a = i11;
        this.f22115b = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        int i11 = this.f22114a;
        MainActivity mainActivity = this.f22115b;
        switch (i11) {
            case 0:
                boolean z11 = MainActivity.f9078v;
                mainActivity.g0().f22163q.f25316a.a(new f70.b(LoginActivity.class, null, true, false, false, null, d0.h(32768, 268435456, 67108864), Integer.valueOf(R.anim.rotate_in), Integer.valueOf(R.anim.rotate_out), false, 570));
                return Unit.f26487a;
            case 1:
                boolean z12 = MainActivity.f9078v;
                f0.E(kotlin.coroutines.g.f26549a, new q(mainActivity.g0(), null, 6));
                return Unit.f26487a;
            case 2:
                boolean z13 = MainActivity.f9078v;
                MainActivity mainActivity2 = this.f22115b;
                v vVarG0 = mainActivity2.g0();
                f0.B(m1.d(vVarG0), null, null, new a0(vVarG0, mainActivity2, new f(mainActivity2, 3), null, 4), 3);
                return Unit.f26487a;
            case 3:
                boolean z14 = MainActivity.f9078v;
                Toast.makeText(mainActivity, R.string.generic_err_undefined_error, 0).show();
                return Unit.f26487a;
            case 4:
                boolean z15 = MainActivity.f9078v;
                return wd.a.o(mainActivity);
            case 5:
                boolean z16 = MainActivity.f9078v;
                u1 u1Var = mainActivity.f9089q;
                u1Var.getClass();
                CoordinatorLayout coordinatorLayout = u1Var.f35186u;
                coordinatorLayout.getClass();
                return new yn.s(mainActivity, coordinatorLayout);
            default:
                boolean z17 = MainActivity.f9078v;
                return v0.n.v(mainActivity);
        }
    }
}
