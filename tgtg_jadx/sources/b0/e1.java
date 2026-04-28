package b0;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c1 f5134g = new c1();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Size f5135h = new Size(1920, 1080);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Size f5136i = new Size(320, 240);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Size f5137j = new Size(640, 480);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile e1 f5138k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0.e f5139a = new x0.e(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u6.f f5140b = new u6.f(12);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5141c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Display[] f5142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DisplayManager f5143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Size f5144f;

    public e1(Context context) {
        d1 d1Var = new d1(this);
        Object systemService = context.getSystemService("display");
        systemService.getClass();
        DisplayManager displayManager = (DisplayManager) systemService;
        displayManager.registerDisplayListener(d1Var, new Handler(Looper.getMainLooper()));
        this.f5143e = displayManager;
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, java.util.Map] */
    public final Size a() {
        Size sizeB;
        Size size;
        Point point = new Point();
        b(false).getRealSize(point);
        Size size2 = new Size(point.x, point.y);
        if (b1.a.a(size2) < b1.a.a(f5136i)) {
            if (((SmallDisplaySizeQuirk) this.f5140b.f40820a) != null) {
                ?? r02 = SmallDisplaySizeQuirk.f2208a;
                String str = Build.MODEL;
                str.getClass();
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                Object obj = r02.get(upperCase);
                obj.getClass();
                size = (Size) obj;
            } else {
                size = null;
            }
            if (size == null) {
                size = f5137j;
            }
            size2 = size;
        }
        if (size2.getHeight() > size2.getWidth()) {
            size2 = new Size(size2.getHeight(), size2.getWidth());
        }
        Size size3 = f5135h;
        if (b1.a.a(size3) < b1.a.a(size2)) {
            size2 = size3;
        }
        x0.e eVar = this.f5139a;
        eVar.getClass();
        if (((ExtraCroppingQuirk) eVar.f43625b) != null && (sizeB = ExtraCroppingQuirk.b(s0.g2.PRIV)) != null) {
            if (sizeB.getHeight() * sizeB.getWidth() > size2.getHeight() * size2.getWidth()) {
                return sizeB;
            }
        }
        return size2;
    }

    public final Display b(boolean z11) {
        Display[] displays;
        int i11;
        synchronized (this.f5141c) {
            displays = this.f5142d;
            if (displays == null) {
                displays = this.f5143e.getDisplays();
                this.f5142d = displays;
                displays.getClass();
            }
        }
        if (displays.length == 1) {
            return displays[0];
        }
        int i12 = -1;
        Display display = null;
        Display display2 = null;
        int i13 = -1;
        for (Display display3 : displays) {
            Point point = new Point();
            display3.getRealSize(point);
            int i14 = point.x * point.y;
            if (i14 > i12) {
                display = display3;
                i12 = i14;
            }
            if (display3.getState() != 1 && (i11 = point.x * point.y) > i13) {
                display2 = display3;
                i13 = i11;
            }
        }
        if (z11 && display2 != null) {
            display = display2;
        }
        if (display != null) {
            return display;
        }
        String string = Arrays.toString(displays);
        string.getClass();
        ax.y.d(string, 33, "No displays found from ");
        return null;
    }

    public final Size c() {
        synchronized (this.f5141c) {
            if (this.f5144f != null) {
                Size size = this.f5144f;
                size.getClass();
                return size;
            }
            this.f5144f = a();
            Size size2 = this.f5144f;
            size2.getClass();
            return size2;
        }
    }
}
