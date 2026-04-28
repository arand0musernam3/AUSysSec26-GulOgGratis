package w6;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f43251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f43252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43253c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f43251a = colorStateList;
        this.f43252b = configuration;
        this.f43253c = theme == null ? 0 : theme.hashCode();
    }
}
