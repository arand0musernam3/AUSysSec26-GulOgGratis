package xh;

import com.app.tgtg.feature.charity.ui.model.CharityIdError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class i0 extends m0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u70.j[] f44329d = {null, u70.l.a(u70.m.PUBLICATION, new d(14))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f44330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharityIdError f44331c;

    public /* synthetic */ i0(int i11, String str, CharityIdError charityIdError) {
        if ((i11 & 1) == 0) {
            this.f44330b = null;
        } else {
            this.f44330b = str;
        }
        if ((i11 & 2) == 0) {
            this.f44331c = null;
        } else {
            this.f44331c = charityIdError;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.areEqual(this.f44330b, i0Var.f44330b) && this.f44331c == i0Var.f44331c;
    }

    public final int hashCode() {
        String str = this.f44330b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharityIdError charityIdError = this.f44331c;
        return iHashCode + (charityIdError != null ? charityIdError.hashCode() : 0);
    }

    public final String toString() {
        return "ProvideCharityIdScreen(charityId=" + this.f44330b + ", error=" + this.f44331c + ")";
    }

    public i0(String str, CharityIdError charityIdError) {
        this.f44330b = str;
        this.f44331c = charityIdError;
    }
}
