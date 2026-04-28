package f30;

import a90.v;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewException;
import d10.o;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f17276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f17277b = new Handler(Looper.getMainLooper());

    public d(g gVar) {
        this.f17276a = gVar;
    }

    public final void a(Activity activity, a aVar) {
        b bVar = (b) aVar;
        if (bVar.f17274b) {
            Tasks.d(null);
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", bVar.f17273a);
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        intent.putExtra("result_receiver", new c(this.f17277b, new d10.g()));
        activity.startActivity(intent);
    }

    public final o b() {
        String str;
        g gVar = this.f17276a;
        String str2 = gVar.f17286b;
        v vVar = g.f17284c;
        vVar.b("requestInAppReview (%s)", str2);
        g30.h hVar = gVar.f17285a;
        if (hVar != null) {
            d10.g gVar2 = new d10.g();
            hVar.a().post(new g30.f(hVar, gVar2, gVar2, new e(gVar, gVar2, gVar2)));
            return gVar2.f13697a;
        }
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", v.d(vVar.f1051b, "Play Store app is either not installed or not the official version", objArr));
        }
        Locale locale = Locale.getDefault();
        HashMap map = h30.a.f21371a;
        if (map.containsKey(-1)) {
            str = ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) h30.a.f21372b.get(-1)) + ")";
        } else {
            str = "";
        }
        return Tasks.c(new ReviewException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str), null, null)));
    }
}
