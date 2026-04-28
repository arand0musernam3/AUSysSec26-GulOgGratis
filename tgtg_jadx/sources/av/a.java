package av;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f4840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f4841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4842c;

    public a(Class cls, Bundle bundle, int i11) {
        bundle = (i11 & 2) != 0 ? null : bundle;
        boolean z11 = (i11 & 4) == 0;
        this.f4840a = cls;
        this.f4841b = bundle;
        this.f4842c = z11;
    }

    public final Intent a(Activity activity) {
        activity.getClass();
        Intent intent = new Intent(activity, (Class<?>) this.f4840a);
        Bundle bundle = this.f4841b;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return intent;
    }
}
