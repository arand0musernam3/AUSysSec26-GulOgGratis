package ok;

import com.app.tgtg.model.local.SnackBarType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements f70.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SnackBarType f32574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f32575b;

    public a0(SnackBarType snackBarType) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        snackBarType.getClass();
        this.f32574a = snackBarType;
        this.f32575b = jCurrentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f32574a == a0Var.f32574a && this.f32575b == a0Var.f32575b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32575b) + (this.f32574a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSnackBar(snackBarType=" + this.f32574a + ", timestamp=" + this.f32575b + ")";
    }
}
