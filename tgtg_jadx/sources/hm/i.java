package hm;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import com.app.tgtg.feature.main.MainActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import pg.u1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements h7.w, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f22120a;

    public /* synthetic */ i(MainActivity mainActivity) {
        this.f22120a = mainActivity;
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        boolean z11 = MainActivity.f9078v;
        x6.d dVarX = j4.s.x(view, windowInsetsCompat);
        MainActivity mainActivity = this.f22120a;
        u1 u1Var = mainActivity.f9089q;
        u1Var.getClass();
        u1Var.f35191z.setPadding(0, dVarX.f43874b, 0, 0);
        if (mainActivity.f0().getVisibility() == 0) {
            mainActivity.f0().setPadding(0, 0, 0, dVarX.f43876d);
            return windowInsetsCompat;
        }
        u1 u1Var2 = mainActivity.f9089q;
        u1Var2.getClass();
        u1Var2.f986f.setPadding(0, 0, 0, dVarX.f43876d);
        return windowInsetsCompat;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean z11 = MainActivity.f9078v;
        task.getClass();
        if (task.isSuccessful()) {
            this.f22120a.f9091s = (f30.a) task.getResult();
        }
    }
}
