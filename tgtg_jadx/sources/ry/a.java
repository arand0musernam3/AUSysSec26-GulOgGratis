package ry;

import android.app.Activity;
import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.braze.h2;
import m3.i;
import m3.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f38268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f38269c = i.w(a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActivityResultLauncher f38270d;

    public a(Context context, Activity activity) {
        this.f38267a = context;
        this.f38268b = activity;
    }

    public final f a() {
        return androidx.core.app.e.a(this.f38267a, "android.permission.POST_NOTIFICATIONS") == 0 ? e.f38275a : new d(androidx.core.app.e.l(this.f38268b, "android.permission.POST_NOTIFICATIONS"));
    }

    @Override // ry.c
    public final f c() {
        return (f) this.f38269c.getValue();
    }

    @Override // ry.c
    public final void h() {
        ActivityResultLauncher activityResultLauncher = this.f38270d;
        if (activityResultLauncher != null) {
            activityResultLauncher.a("android.permission.POST_NOTIFICATIONS", null);
        } else {
            h2.b("ActivityResultLauncher cannot be null");
        }
    }
}
