package androidx.core.app;

import android.app.Notification;
import android.graphics.drawable.Icon;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {
    public static void a(Notification.ProgressStyle progressStyle, int i11) {
        progressStyle.setProgress(i11);
    }

    public static void b(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressEndIcon(icon);
    }

    public static void c(Notification.ProgressStyle progressStyle, boolean z11) {
        progressStyle.setProgressIndeterminate(z11);
    }

    public static void d(Notification.ProgressStyle progressStyle, List<i0> list) {
        for (i0 i0Var : list) {
            progressStyle.addProgressPoint(new Notification.ProgressStyle.Point(i0Var.f2603a).setColor(i0Var.f2605c).setId(i0Var.f2604b));
        }
    }

    public static void e(Notification.ProgressStyle progressStyle, List<j0> list) {
        for (j0 j0Var : list) {
            progressStyle.addProgressSegment(new Notification.ProgressStyle.Segment(j0Var.f2606a).setColor(j0Var.f2608c).setId(j0Var.f2607b));
        }
    }

    public static void f(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressStartIcon(icon);
    }

    public static void g(Notification.ProgressStyle progressStyle, Icon icon) {
        progressStyle.setProgressTrackerIcon(icon);
    }

    public static void h(Notification.ProgressStyle progressStyle, boolean z11) {
        progressStyle.setStyledByProgress(z11);
    }
}
