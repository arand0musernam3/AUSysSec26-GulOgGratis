package b1;

import android.util.Size;
import com.app.tgtg.model.local.AppConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Size f5535a = new Size(0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Size f5536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Size f5537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Size f5538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Size f5539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Size f5540f;

    static {
        new Size(320, 240);
        f5536b = new Size(640, 480);
        f5537c = new Size(AppConstants.REQUEST_CODE_HELP_CENTER, 480);
        f5538d = new Size(1280, AppConstants.REQUEST_CODE_HELP_CENTER);
        f5539e = new Size(1920, 1080);
        f5540f = new Size(1920, 1440);
        new Size(2560, 1440);
        new Size(3840, 2160);
    }

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
