package al;

import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import com.app.tgtg.R;
import com.app.tgtg.feature.login.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f1514b;

    public /* synthetic */ a(LoginActivity loginActivity, int i11) {
        this.f1513a = i11;
        this.f1514b = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f1513a;
        boolean z11 = false;
        LoginActivity loginActivity = this.f1514b;
        switch (i11) {
            case 0:
                f70.h hVar = (f70.h) obj;
                f70.b bVar = LoginActivity.f9032j;
                hVar.getClass();
                if (hVar instanceof el.a) {
                    el.a aVar = (el.a) hVar;
                    boolean z12 = aVar.f16076a;
                    boolean z13 = aVar.f16077b;
                    FragmentManager supportFragmentManager = loginActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("IS_FROM_APP_START", true);
                    bundle.putBoolean("IS_FROM_DEEPLINK", z12);
                    bundle.putBoolean("IS_LOGGED_IN", z13);
                    bl.d dVar = new bl.d();
                    dVar.setArguments(bundle);
                    dVar.show(supportFragmentManager, "Cookies Fragment");
                } else if (Intrinsics.areEqual(hVar, el.c.f16079a)) {
                    new pl.f().show(loginActivity.getSupportFragmentManager(), "TERMS");
                } else if (Intrinsics.areEqual(hVar, el.b.f16078a)) {
                    new ng.d().show(loginActivity.getSupportFragmentManager(), "ServerSelector");
                }
                z11 = true;
                break;
            case 1:
                String str = (String) obj;
                f70.b bVar2 = LoginActivity.f9032j;
                str.getClass();
                loginActivity.b0(str);
                break;
            default:
                cl.g gVar = (cl.g) obj;
                f70.b bVar3 = LoginActivity.f9032j;
                gVar.getClass();
                if (gVar.f8448a == 6) {
                    Toast.makeText(loginActivity, loginActivity.getResources().getText(R.string.generic_err_undefined_error), 0).show();
                }
                break;
        }
        return Unit.f26487a;
    }
}
