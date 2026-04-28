package el;

import com.app.tgtg.R;
import com.app.tgtg.feature.login.LoginActivity;
import com.app.tgtg.feature.login.email.EmailAccessActivity;
import com.app.tgtg.feature.login.email.EmailCodeAccessActivity;
import com.app.tgtg.feature.main.MainActivity;
import f70.g;
import f70.i;
import jb.u;
import kotlin.Pair;
import mv.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16080a;

    public d(g gVar) {
        gVar.getClass();
        this.f16080a = gVar;
    }

    public final void a(boolean z11, boolean z12) {
        this.f16080a.a(new f70.b(EmailAccessActivity.class, null, false, false, z11, null, null, Integer.valueOf(z12 ? R.anim.slide_out_from_left_to_right : R.anim.slide_in_from_right_to_left), Integer.valueOf(z12 ? R.anim.slide_in_from_left_to_right : R.anim.slide_out_from_right_to_left), false, 622));
    }

    public final void b(String str, String str2, boolean z11) {
        str.getClass();
        this.f16080a.a(new f70.b(EmailCodeAccessActivity.class, u.x(new Pair("email", str), new Pair("pollingId", str2), new Pair("signUp", Boolean.valueOf(z11))), false, false, false, null, null, null, null, false, 1020));
    }

    public final void c(i iVar) {
        iVar.getClass();
        this.f16080a.a(new f70.b(LoginActivity.class, u.x(new Pair("ORIGIN", iVar)), true, false, false, null, null, null, null, false, 1016));
    }

    public final void d(z zVar) {
        zVar.getClass();
        this.f16080a.a(new f70.b(MainActivity.class, u.x(new Pair("DESTINATION", zVar)), false, true, false, null, null, null, null, false, 1012));
    }
}
