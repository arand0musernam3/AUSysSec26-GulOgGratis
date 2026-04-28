package cy;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o extends g0 {

    @NotNull
    public static final Parcelable.Creator<o> CREATOR = new b(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ax.k f13551f;

    public o(Parcel parcel) {
        super(0, parcel);
        this.f13550e = "instagram_login";
        this.f13551f = ax.k.INSTAGRAM_APPLICATION_WEB;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // cy.c0
    public final String e() {
        return this.f13550e;
    }

    @Override // cy.c0
    public final int k(r rVar) {
        Object obj;
        rVar.getClass();
        String strT = b0.z.t();
        Context contextE = d().e();
        if (contextE == null) {
            contextE = ax.a0.a();
        }
        String str = rVar.f13556d;
        Set set = rVar.f13554b;
        boolean zA = rVar.a();
        e eVar = rVar.f13555c;
        if (eVar == null) {
            eVar = e.NONE;
        }
        e eVar2 = eVar;
        String strC = c(rVar.f13559g);
        String str2 = rVar.f13562j;
        String str3 = rVar.l;
        boolean z11 = rVar.f13564m;
        boolean z12 = rVar.f13566o;
        boolean z13 = rVar.f13567p;
        tx.h0 h0Var = tx.h0.f40515a;
        Set set2 = yx.a.f46339a;
        Intent intent = null;
        if (!set2.contains(tx.h0.class)) {
            try {
                contextE.getClass();
                str.getClass();
                set.getClass();
                eVar2.getClass();
                str2.getClass();
                Context context = contextE;
                try {
                    Intent intentC = tx.h0.f40515a.c(new tx.g0(1), str, set, strT, zA, eVar2, strC, str2, false, str3, z11, f0.INSTAGRAM, z12, z13, "", null, null);
                    obj = tx.h0.class;
                    try {
                        if (!set2.contains(obj) && intentC != null) {
                            try {
                                ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intentC, 0);
                                if (resolveInfoResolveActivity != null) {
                                    String str4 = resolveInfoResolveActivity.activityInfo.packageName;
                                    str4.getClass();
                                    if (tx.o.a(context, str4)) {
                                        intent = intentC;
                                    }
                                }
                            } catch (Throwable th2) {
                                yx.a.a(obj, th2);
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        yx.a.a(obj, th);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = tx.h0.class;
                }
            } catch (Throwable th5) {
                th = th5;
                obj = tx.h0.class;
            }
        }
        Intent intent2 = intent;
        a("e2e", strT);
        tx.h.Login.a();
        return t(intent2) ? 1 : 0;
    }

    @Override // cy.g0
    public final ax.k p() {
        return this.f13551f;
    }

    @Override // cy.c0, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        super.writeToParcel(parcel, i11);
    }

    public o(u uVar) {
        super(uVar);
        this.f13550e = "instagram_login";
        this.f13551f = ax.k.INSTAGRAM_APPLICATION_WEB;
    }
}
