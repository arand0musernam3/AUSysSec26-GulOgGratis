package bx;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6706a;

    public a(String str) {
        this.f6706a = str;
    }

    private final Object readResolve() throws ObjectStreamException {
        return new b(null, this.f6706a);
    }
}
