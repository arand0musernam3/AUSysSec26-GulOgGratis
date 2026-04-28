package c5;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClipboardManager f7260a;

    public j(Context context) {
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        this.f7260a = (ClipboardManager) systemService;
    }
}
