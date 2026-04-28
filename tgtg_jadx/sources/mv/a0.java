package mv;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.model.local.DeeplinkC2CReferralData;
import com.app.tgtg.model.local.SearchFilter;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SearchFilter f30141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f30142e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30144g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DeeplinkC2CReferralData f30148k;
    public HashMap l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f30138a = z.DISCOVER;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f70.i f30139b = f70.i.UNKNOWN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f30140c = y.NONE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30143f = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30145h = R.anim.slide_in_from_right_to_left;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f30146i = R.anim.slide_out_from_right_to_left;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public no.n0 f30147j = no.n0.NONE;

    public final void a(Object obj, String str) {
        HashMap map = this.l;
        if (map == null) {
            map = new HashMap();
        }
        map.put(str, obj);
        this.l = map;
    }

    public final f70.b b() {
        Bundle bundleX = jb.u.x(new Pair("DESTINATION", this.f30138a), new Pair("ORIGIN", this.f30139b), new Pair("ACTION", this.f30140c), new Pair("FILTER", this.f30141d), new Pair("EMAIL_VERIFICATION_TOKEN", this.f30142e), new Pair("C2C_REFERRAL_CODE", this.f30148k), new Pair("FRAGMENT_DEEPLINK_PARAMETERS", this.l));
        no.n0 n0Var = this.f30147j;
        if (n0Var != no.n0.NONE) {
            bundleX.putSerializable("POPUP_FROM_ORDER", n0Var);
        }
        kotlin.collections.d0.h(32768, 268435456);
        kotlin.collections.n0 n0Var2 = kotlin.collections.n0.f26529a;
        boolean z11 = this.f30144g;
        return new f70.b(MainActivity.class, bundleX, !z11, z11, false, null, n0Var2, Integer.valueOf(this.f30145h), Integer.valueOf(this.f30146i), false, 560);
    }

    public final void c(Activity activity) {
        activity.getClass();
        Intent intentPutExtra = new Intent(activity, (Class<?>) MainActivity.class).putExtra("DESTINATION", this.f30138a).putExtra("ORIGIN", this.f30139b).putExtra("ACTION", this.f30140c).putExtra("FILTER", this.f30141d).putExtra("EMAIL_VERIFICATION_TOKEN", this.f30142e).putExtra("C2C_REFERRAL_CODE", this.f30148k).putExtra("FRAGMENT_DEEPLINK_PARAMETERS", this.l);
        intentPutExtra.getClass();
        no.n0 n0Var = this.f30147j;
        if (n0Var != no.n0.NONE) {
            intentPutExtra.putExtra("POPUP_FROM_ORDER", n0Var);
        }
        if (this.f30143f) {
            Bundle bundle = ActivityOptions.makeCustomAnimation(activity, this.f30145h, this.f30146i).toBundle();
            bundle.getClass();
            activity.startActivity(intentPutExtra, bundle);
        } else {
            activity.startActivity(intentPutExtra);
        }
        if (this.f30144g) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }
}
