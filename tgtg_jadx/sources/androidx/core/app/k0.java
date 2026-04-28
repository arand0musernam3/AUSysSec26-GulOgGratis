package androidx.core.app;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2625d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IconCompat f2627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public IconCompat f2628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IconCompat f2629h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f2622a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f2623b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2624c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2626e = true;

    public static IconCompat c(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            return IconCompat.b((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.c((Bitmap) parcelable);
        }
        return null;
    }

    @Override // androidx.core.app.l0
    public final void addCompatExtras(Bundle bundle) {
        super.addCompatExtras(bundle);
        if (Build.VERSION.SDK_INT < 36) {
            ArrayList arrayList = this.f2622a;
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    j0 j0Var = (j0) arrayList.get(i11);
                    if (j0Var.f2606a > 0) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("length", j0Var.f2606a);
                        bundle2.putInt("id", j0Var.f2607b);
                        bundle2.putInt("colorInt", j0Var.f2608c);
                        arrayList2.add(bundle2);
                    }
                }
            }
            bundle.putParcelableArrayList("android.progressSegments", arrayList2);
            ArrayList arrayList3 = this.f2623b;
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                    i0 i0Var = (i0) arrayList3.get(i12);
                    if (i0Var.f2603a >= 0) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putInt("position", i0Var.f2603a);
                        bundle3.putInt("id", i0Var.f2604b);
                        bundle3.putInt("colorInt", i0Var.f2605c);
                        arrayList4.add(bundle3);
                    }
                }
            }
            bundle.putParcelableArrayList("android.progressPoints", arrayList4);
            bundle.putInt("android.progress", this.f2624c);
            bundle.putBoolean("android.progressIndeterminate", this.f2625d);
            bundle.putInt("android.progressMax", d());
            bundle.putBoolean("android.styledByProgress", this.f2626e);
            s sVar = this.mBuilder;
            Context context = sVar != null ? sVar.f2664a : null;
            if (context == null) {
                return;
            }
            IconCompat iconCompat = this.f2627f;
            if (iconCompat != null) {
                bundle.putParcelable("android.progressTrackerIcon", iconCompat.h(context));
            } else {
                bundle.remove("android.progressTrackerIcon");
            }
            IconCompat iconCompat2 = this.f2628g;
            if (iconCompat2 != null) {
                bundle.putParcelable("android.progressStartIcon", iconCompat2.h(context));
            } else {
                bundle.remove("android.progressStartIcon");
            }
            IconCompat iconCompat3 = this.f2629h;
            if (iconCompat3 != null) {
                bundle.putParcelable("android.progressEndIcon", iconCompat3.h(context));
            } else {
                bundle.remove("android.progressEndIcon");
            }
        }
    }

    @Override // androidx.core.app.l0
    public final void apply(i iVar) {
        Notification.Builder builder = ((o0) iVar).f2650b;
        if (Build.VERSION.SDK_INT < 36) {
            int iD = d();
            builder.setProgress(iD, Math.min(this.f2624c, iD), this.f2625d);
            return;
        }
        Context context = iVar instanceof o0 ? ((o0) iVar).f2649a : null;
        Notification.ProgressStyle progressStyleB = g0.b();
        h0.h(progressStyleB, this.f2626e);
        h0.a(progressStyleB, this.f2624c);
        h0.c(progressStyleB, this.f2625d);
        IconCompat iconCompat = this.f2628g;
        h0.f(progressStyleB, iconCompat != null ? iconCompat.h(context) : null);
        IconCompat iconCompat2 = this.f2629h;
        h0.b(progressStyleB, iconCompat2 != null ? iconCompat2.h(context) : null);
        IconCompat iconCompat3 = this.f2627f;
        h0.g(progressStyleB, iconCompat3 != null ? iconCompat3.h(context) : null);
        h0.d(progressStyleB, this.f2623b);
        h0.e(progressStyleB, this.f2622a);
        builder.setStyle(progressStyleB);
    }

    @Override // androidx.core.app.l0
    public final void clearCompatExtraKeys(Bundle bundle) {
        super.clearCompatExtraKeys(bundle);
        bundle.remove("android.progressSegments");
        bundle.remove("android.progress");
        bundle.remove("android.styledByProgress");
        bundle.remove("android.progressTrackerIcon");
        bundle.remove("android.progressStartIcon");
        bundle.remove("android.progressEndIcon");
        bundle.remove("android.progressPoints");
        bundle.remove("android.progressIndeterminate");
    }

    public final int d() {
        ArrayList arrayList = this.f2622a;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i11 = 0;
            int iAddExact = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                int i13 = ((j0) arrayList.get(i12)).f2606a;
                if (i13 > 0) {
                    try {
                        iAddExact = Math.addExact(iAddExact, i13);
                        i11++;
                    } catch (ArithmeticException unused) {
                        return 100;
                    }
                }
            }
            if (i11 != 0) {
                return iAddExact;
            }
        }
        return 100;
    }

    @Override // androidx.core.app.l0
    public final boolean displayCustomViewInline() {
        return true;
    }

    @Override // androidx.core.app.l0
    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$ProgressStyle";
    }

    @Override // androidx.core.app.l0
    public final void restoreFromCompatExtras(Bundle bundle) {
        super.restoreFromCompatExtras(bundle);
        ArrayList arrayListG = Build.VERSION.SDK_INT >= 34 ? a70.a.g(bundle, "android.progressSegments", Bundle.class) : bundle.getParcelableArrayList("android.progressSegments");
        ArrayList arrayList = new ArrayList();
        if (arrayListG != null && !arrayListG.isEmpty()) {
            for (int i11 = 0; i11 < arrayListG.size(); i11++) {
                Bundle bundle2 = (Bundle) arrayListG.get(i11);
                int i12 = bundle2.getInt("length");
                if (i12 > 0) {
                    int i13 = bundle2.getInt("id");
                    int i14 = bundle2.getInt("colorInt", 0);
                    j0 j0Var = new j0();
                    j0Var.f2606a = i12;
                    j0Var.f2607b = i13;
                    j0Var.f2608c = i14;
                    arrayList.add(j0Var);
                }
            }
        }
        this.f2622a = arrayList;
        this.f2624c = bundle.getInt("android.progress", 0);
        this.f2625d = bundle.getBoolean("android.progressIndeterminate", false);
        this.f2626e = bundle.getBoolean("android.styledByProgress", true);
        ArrayList arrayListG2 = Build.VERSION.SDK_INT >= 34 ? a70.a.g(bundle, "android.progressPoints", Bundle.class) : bundle.getParcelableArrayList("android.progressPoints");
        ArrayList arrayList2 = new ArrayList();
        if (arrayListG2 != null && !arrayListG2.isEmpty()) {
            for (int i15 = 0; i15 < arrayListG2.size(); i15++) {
                Bundle bundle3 = (Bundle) arrayListG2.get(i15);
                int i16 = bundle3.getInt("position");
                if (i16 >= 0) {
                    int i17 = bundle3.getInt("id");
                    int i18 = bundle3.getInt("colorInt", 0);
                    i0 i0Var = new i0();
                    i0Var.f2603a = i16;
                    i0Var.f2604b = i17;
                    i0Var.f2605c = i18;
                    arrayList2.add(i0Var);
                }
            }
        }
        this.f2623b = arrayList2;
        this.f2627f = c((Parcelable) h0.g.t(bundle, "android.progressTrackerIcon", Icon.class));
        this.f2628g = c((Parcelable) h0.g.t(bundle, "android.progressStartIcon", Icon.class));
        this.f2629h = c((Parcelable) h0.g.t(bundle, "android.progressEndIcon", Icon.class));
    }
}
