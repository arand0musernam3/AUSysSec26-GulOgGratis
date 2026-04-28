package ag;

import android.app.Activity;
import androidx.fragment.app.o0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f1443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f70.i f1445c;

    public l(o0 o0Var, String str, f70.i iVar) {
        o0Var.getClass();
        iVar.getClass();
        this.f1443a = o0Var;
        this.f1444b = str;
        this.f1445c = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.areEqual(this.f1443a, lVar.f1443a) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f1444b, lVar.f1444b) && Intrinsics.areEqual((Object) null, (Object) null) && this.f1445c == lVar.f1445c;
    }

    public final int hashCode() {
        int iE = r8.k.e(r8.k.e(this.f1443a.hashCode() * 29791, 31, false), 961, false);
        String str = this.f1444b;
        return this.f1445c.hashCode() + ((iE + (str != null ? str.hashCode() : 0)) * 961);
    }

    public final String toString() {
        return "DetailsDataMule(hostActivity=" + this.f1443a + ", deeplinkId=null, displayType=null, resumePayment=false, shouldFinish=false, fillerType=null, categoryType=" + this.f1444b + ", deeplinkParametersMap=null, origin=" + this.f1445c + ")";
    }
}
