package cy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.o0;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l extends c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f13531e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a0 f13530d = new a0();

    @NotNull
    public static final Parcelable.Creator<l> CREATOR = new b(2);

    public l(u uVar) {
        this.f13491b = uVar;
        this.f13532c = "device_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // cy.c0
    public final String e() {
        return this.f13532c;
    }

    @Override // cy.c0
    public final int k(r rVar) {
        rVar.getClass();
        o0 o0VarE = d().e();
        if (o0VarE == null || o0VarE.isFinishing()) {
            return 1;
        }
        k kVar = new k();
        kVar.show(o0VarE.getSupportFragmentManager(), "login_with_facebook");
        kVar.x(rVar);
        return 1;
    }

    public l(Parcel parcel) {
        super(parcel);
        this.f13532c = "device_auth";
    }
}
