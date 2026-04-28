package u3;

import kotlin.text.CharsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40654a = 0;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f40654a);
        sb2.append(")@");
        String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        string.getClass();
        sb2.append(string);
        return sb2.toString();
    }
}
