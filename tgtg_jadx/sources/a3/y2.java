package a3;

import android.view.textclassifier.TextClassification;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClassification f639c;

    public y2(CharSequence charSequence, long j9, TextClassification textClassification) {
        this.f637a = charSequence;
        this.f638b = j9;
        this.f639c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return Intrinsics.areEqual(this.f637a, y2Var.f637a) && m5.t0.c(this.f638b, y2Var.f638b) && Intrinsics.areEqual(this.f639c, y2Var.f639c);
    }

    public final int hashCode() {
        int iHashCode = this.f637a.hashCode() * 31;
        int i11 = m5.t0.f29649c;
        return this.f639c.hashCode() + e0.f.b(iHashCode, 31, this.f638b);
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f637a) + ", selection=" + ((Object) m5.t0.i(this.f638b)) + ", textClassification=" + this.f639c + ')';
    }
}
