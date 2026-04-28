package c5;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f7248a;

    public i(j jVar) {
        this.f7248a = jVar;
    }

    public final Unit a(r1 r1Var) {
        ClipboardManager clipboardManager = this.f7248a.f7260a;
        if (r1Var != null) {
            clipboardManager.setPrimaryClip(r1Var.f7359a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            j1.a(clipboardManager);
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
        return Unit.f26487a;
    }
}
