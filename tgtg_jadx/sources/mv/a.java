package mv;

import android.app.Activity;
import android.app.ActivityOptions;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f30135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f30136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f30137c;

    public static final void a(int i11, View view, TextView textView) {
        int i12 = f30136b;
        view.setAlpha((i11 - i12) / (f30135a - i12));
        int i13 = f30136b;
        textView.setAlpha((i11 - i13) / (f30135a - i13));
    }

    public static Bundle b(Activity activity) {
        activity.getClass();
        Bundle bundle = ActivityOptions.makeCustomAnimation(activity, R.anim.slide_in_from_right_to_left, R.anim.slide_out_from_right_to_left).toBundle();
        bundle.getClass();
        return bundle;
    }
}
