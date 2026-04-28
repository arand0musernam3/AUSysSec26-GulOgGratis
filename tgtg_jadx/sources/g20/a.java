package g20;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathInterpolator f18274a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f18275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.activity.b f18279f;

    public a(View view) {
        this.f18275b = view;
        Context context = view.getContext();
        this.f18276c = ox.h.P(context, R.attr.motionDurationMedium2, 300);
        this.f18277d = ox.h.P(context, R.attr.motionDurationShort3, 150);
        this.f18278e = ox.h.P(context, R.attr.motionDurationShort2, 100);
    }

    public final androidx.activity.b a() {
        if (this.f18279f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        androidx.activity.b bVar = this.f18279f;
        this.f18279f = null;
        return bVar;
    }
}
