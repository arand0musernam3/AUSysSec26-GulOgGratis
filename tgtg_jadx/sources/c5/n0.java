package c5;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f7297a = new n0();

    public final void a(@NotNull View view, @Nullable w4.s sVar) {
        Context context = view.getContext();
        PointerIcon systemIcon = sVar instanceof w4.a ? PointerIcon.getSystemIcon(context, ((w4.a) sVar).f43096b) : PointerIcon.getSystemIcon(context, 1000);
        if (Intrinsics.areEqual(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
