package androidx.camera.camera2.compat.quirk;

import android.util.Range;
import android.util.Size;
import com.app.tgtg.model.local.AppConstants;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.x0;
import s0.g2;
import s0.n1;
import y.d;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;", "Ls0/n1;", "zz/f", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtraCroppingQuirk implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f2183a = x0.f(new Pair("SM-T580", null), new Pair("SM-J710MN", new Range(21, 26)), new Pair("SM-A320FL", null), new Pair("SM-G570M", null), new Pair("SM-G610F", null), new Pair("SM-G610M", new Range(21, 26)));

    public static Size b(g2 g2Var) {
        g2Var.getClass();
        if (!f.x()) {
            return null;
        }
        int i11 = d.$EnumSwitchMapping$0[g2Var.ordinal()];
        if (i11 == 1) {
            return new Size(1920, 1080);
        }
        if (i11 == 2) {
            return new Size(1280, AppConstants.REQUEST_CODE_HELP_CENTER);
        }
        if (i11 != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
