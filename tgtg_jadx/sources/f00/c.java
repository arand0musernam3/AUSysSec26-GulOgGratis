package f00;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import jz.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.common.api.h f17030b = new com.google.android.gms.common.api.h("Auth.Api.Identity.SignIn.API", new a10.b(5), new com.google.android.gms.common.api.g());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17031a;

    public c(Context context, m mVar) {
        super(context, null, f17030b, mVar, k.f11084c);
        this.f17031a = f.a();
    }

    public static jz.j c(Intent intent) throws ApiException {
        Status status = Status.f11056g;
        if (intent == null) {
            throw new ApiException(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : m0.c.a0(byteArrayExtra, creator));
        if (status2 == null) {
            throw new ApiException(Status.f11058i);
        }
        if (!status2.d()) {
            throw new ApiException(status2);
        }
        Parcelable.Creator<jz.j> creator2 = jz.j.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        jz.j jVar = (jz.j) (byteArrayExtra2 != null ? m0.c.a0(byteArrayExtra2, creator2) : null);
        if (jVar != null) {
            return jVar;
        }
        throw new ApiException(status);
    }
}
