package p2;

import kotlin.jvm.functions.Function1;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f34133d;

    public d(Object obj, String str, int i11, Function1 function1) {
        super(obj);
        this.f34131b = str;
        this.f34132c = i11;
        this.f34133d = function1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextContextMenuItem(key=");
        sb2.append(this.f34128a);
        sb2.append(", label=\"");
        sb2.append(this.f34131b);
        sb2.append("\", leadingIcon=");
        return k.o(sb2, this.f34132c, ')');
    }
}
