package j5;

import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2 f24612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24613c;

    public a0(String str, Function2 function2) {
        this.f24611a = str;
        this.f24612b = function2;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f24611a;
    }

    public /* synthetic */ a0(String str) {
        this(str, l.f24654u);
    }

    public a0(String str, int i11) {
        this(str);
        this.f24613c = true;
    }

    public a0(String str, boolean z11, Function2 function2) {
        this(str, function2);
        this.f24613c = z11;
    }
}
