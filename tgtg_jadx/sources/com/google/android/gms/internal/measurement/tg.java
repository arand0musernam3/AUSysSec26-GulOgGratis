package com.google.android.gms.internal.measurement;

import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class tg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f11908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11911e;

    public tg(String str, Class cls, boolean z11, boolean z12) {
        char cCharAt = str.charAt(0);
        if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z')) {
            i4.a.f("identifier must start with an ASCII letter: ".concat(str));
            throw null;
        }
        for (int i11 = 1; i11 < str.length(); i11++) {
            char cCharAt2 = str.charAt(i11);
            if ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && ((cCharAt2 < '0' || cCharAt2 > '9') && cCharAt2 != '_'))) {
                i4.a.f("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
                throw null;
            }
        }
        this.f11907a = str;
        this.f11908b = cls;
        this.f11909c = z11;
        this.f11910d = z12;
        int iIdentityHashCode = System.identityHashCode(this);
        long j9 = 0;
        for (int i12 = 0; i12 < 5; i12++) {
            j9 |= 1 << (iIdentityHashCode & 63);
            iIdentityHashCode >>>= 6;
        }
        this.f11911e = j9;
    }

    public void a(Iterator it, gh ghVar) {
        while (it.hasNext()) {
            b(it.next(), ghVar);
        }
    }

    public void b(Object obj, gh ghVar) {
        ghVar.a(obj, this.f11907a);
    }

    public final String toString() {
        String name = getClass().getName();
        String name2 = this.f11908b.getName();
        int length = name.length();
        int length2 = name2.length();
        String str = this.f11907a;
        StringBuilder sb2 = new StringBuilder(str.length() + length + 1 + 1 + length2 + 1);
        j4.s.A(sb2, name, ExpiryDateInput.SEPARATOR, str, "[");
        return r8.k.p(sb2, name2, "]");
    }
}
