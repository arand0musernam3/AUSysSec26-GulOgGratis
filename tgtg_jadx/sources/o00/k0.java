package o00;

import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f31698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f31699c;

    public k0(String str, Class cls, boolean z11, int i11) {
        char cCharAt = str.charAt(0);
        if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')) {
            i4.a.f("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        for (int i12 = 1; i12 < str.length(); i12++) {
            char cCharAt2 = str.charAt(i12);
            if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
                i4.a.f("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                throw null;
            }
        }
        this.f31697a = str;
        this.f31698b = cls;
        this.f31699c = z11;
        System.identityHashCode(this);
        for (int i13 = 0; i13 < 5; i13++) {
        }
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.f31698b.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.f31697a;
        StringBuilder sb2 = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        j4.s.A(sb2, name, ExpiryDateInput.SEPARATOR, str, "[");
        return r8.k.p(sb2, name2, "]");
    }
}
