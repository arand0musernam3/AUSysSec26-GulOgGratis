package n8;

import android.text.Editable;
import l8.v;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f30684a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f30685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f30686c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f30686c;
        return cls != null ? new v(cls, charSequence) : super.newEditable(charSequence);
    }
}
