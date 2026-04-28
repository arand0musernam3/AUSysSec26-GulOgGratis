package androidx.core.app;

import android.app.Notification;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Notification f2660d;

    public q0(String str, int i11, String str2, Notification notification) {
        this.f2657a = str;
        this.f2658b = i11;
        this.f2659c = str2;
        this.f2660d = notification;
    }

    public final void a(c.c cVar) {
        String str = this.f2657a;
        int i11 = this.f2658b;
        String str2 = this.f2659c;
        Notification notification = this.f2660d;
        c.a aVar = (c.a) cVar;
        aVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(c.c.f6787c);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i11);
            parcelObtain.writeString(str2);
            parcelObtain.writeTypedObject(notification, 0);
            aVar.f6785g.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f2657a);
        sb2.append(", id:");
        sb2.append(this.f2658b);
        sb2.append(", tag:");
        return r8.k.p(sb2, this.f2659c, "]");
    }
}
