package co.datadome.sdk;

import android.view.VelocityTracker;
import co.datadome.sdk.DataDomeSDK;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f8721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Date f8722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Date f8723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Date f8724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VelocityTracker f8725e = null;

    public y(DataDomeSDK.Builder builder) {
        this.f8721a = new WeakReference(builder);
    }

    public final void a(float f11, float f12) {
        DataDomeEvent event = DataDomeSDK.Events.TOUCH_DOWN.getEvent(String.format(Locale.getDefault(), "{\"x\":%.3f, \"y\":%.3f}", Float.valueOf(f11), Float.valueOf(f12)));
        WeakReference weakReference = this.f8721a;
        if (weakReference.get() != null) {
            ((DataDomeSDK.Builder) weakReference.get()).logEvent(event);
        }
    }

    public final void b(float f11, float f12) {
        DataDomeEvent event = DataDomeSDK.Events.TOUCH_UP.getEvent(String.format(Locale.getDefault(), "{\"x\":%.3f, \"y\":%.3f}", Float.valueOf(f11), Float.valueOf(f12)));
        WeakReference weakReference = this.f8721a;
        if (weakReference.get() != null) {
            ((DataDomeSDK.Builder) weakReference.get()).logEvent(event);
        }
    }
}
