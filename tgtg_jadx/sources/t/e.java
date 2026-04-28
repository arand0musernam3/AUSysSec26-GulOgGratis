package t;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f39291b;

    public e(int i11, CharSequence charSequence) {
        this.f39290a = i11;
        this.f39291b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f39290a != eVar.f39290a) {
            return false;
        }
        CharSequence charSequence = eVar.f39291b;
        CharSequence charSequence2 = this.f39291b;
        String string = charSequence2 != null ? charSequence2.toString() : null;
        String string2 = charSequence != null ? charSequence.toString() : null;
        if (string == null && string2 == null) {
            return true;
        }
        return string != null && string.equals(string2);
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.f39290a);
        CharSequence charSequence = this.f39291b;
        return Arrays.hashCode(new Object[]{numValueOf, charSequence != null ? charSequence.toString() : null});
    }
}
