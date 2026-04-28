package f70;

import android.os.Bundle;
import com.app.tgtg.R;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f17470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f17471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f17475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f17476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f17477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f17478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f17479j;

    public b(Class cls, Bundle bundle, boolean z11, boolean z12, boolean z13, Integer num, List list, Integer num2, Integer num3, boolean z14, int i11) {
        bundle = (i11 & 2) != 0 ? null : bundle;
        z11 = (i11 & 4) != 0 ? false : z11;
        z12 = (i11 & 8) != 0 ? false : z12;
        z13 = (i11 & 16) != 0 ? false : z13;
        num = (i11 & 32) != 0 ? null : num;
        list = (i11 & 64) != 0 ? n0.f26529a : list;
        num2 = (i11 & 128) != 0 ? Integer.valueOf(R.anim.slide_in_from_right_to_left) : num2;
        num3 = (i11 & 256) != 0 ? Integer.valueOf(R.anim.slide_out_from_right_to_left) : num3;
        z14 = (i11 & 512) != 0 ? false : z14;
        cls.getClass();
        list.getClass();
        this.f17470a = cls;
        this.f17471b = bundle;
        this.f17472c = z11;
        this.f17473d = z12;
        this.f17474e = z13;
        this.f17475f = num;
        this.f17476g = list;
        this.f17477h = num2;
        this.f17478i = num3;
        this.f17479j = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f17470a, bVar.f17470a) && Intrinsics.areEqual(this.f17471b, bVar.f17471b) && this.f17472c == bVar.f17472c && this.f17473d == bVar.f17473d && this.f17474e == bVar.f17474e && Intrinsics.areEqual(this.f17475f, bVar.f17475f) && Intrinsics.areEqual(this.f17476g, bVar.f17476g) && Intrinsics.areEqual(this.f17477h, bVar.f17477h) && Intrinsics.areEqual(this.f17478i, bVar.f17478i) && this.f17479j == bVar.f17479j;
    }

    public final int hashCode() {
        int iHashCode = this.f17470a.hashCode() * 31;
        Bundle bundle = this.f17471b;
        int iE = r8.k.e(r8.k.e(r8.k.e((iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31, 31, this.f17472c), 31, this.f17473d), 31, this.f17474e);
        Integer num = this.f17475f;
        int iC = e0.f.c(this.f17476g, (iE + (num == null ? 0 : num.hashCode())) * 31, 31);
        Integer num2 = this.f17477h;
        int iHashCode2 = (iC + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f17478i;
        return Boolean.hashCode(this.f17479j) + ((iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GoToActivityEvent(activityClass=");
        sb2.append(this.f17470a);
        sb2.append(", bundle=");
        sb2.append(this.f17471b);
        sb2.append(", finish=");
        b3.i.C(sb2, this.f17472c, ", finishAffinity=", this.f17473d, ", finishAndRemoveTask=");
        sb2.append(this.f17474e);
        sb2.append(", resultRequestCode=");
        sb2.append(this.f17475f);
        sb2.append(", flags=");
        sb2.append(this.f17476g);
        sb2.append(", enterAnimResId=");
        sb2.append(this.f17477h);
        sb2.append(", exitAnimResId=");
        sb2.append(this.f17478i);
        sb2.append(", checkNetwork=");
        sb2.append(this.f17479j);
        sb2.append(")");
        return sb2.toString();
    }
}
