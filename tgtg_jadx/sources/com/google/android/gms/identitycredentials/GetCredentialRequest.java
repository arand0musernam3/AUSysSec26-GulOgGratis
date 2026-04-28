package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import ax.n0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import lx.u;
import org.jetbrains.annotations.NotNull;
import rz.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/gms/identitycredentials/GetCredentialRequest;", "Lrz/a;", "Lcom/google/android/gms/common/internal/ReflectedParcelable;", "Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "toBundle", "()Landroid/os/Bundle;", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GetCredentialRequest extends a implements ReflectedParcelable {

    @NotNull
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = new n0(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f11232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ResultReceiver f11234d;

    public GetCredentialRequest(ArrayList arrayList, Bundle bundle, String str, ResultReceiver resultReceiver) {
        arrayList.getClass();
        bundle.getClass();
        resultReceiver.getClass();
        this.f11231a = arrayList;
        this.f11232b = bundle;
        this.f11233c = str;
        this.f11234d = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        int iH0 = u.h0(20293, parcel);
        u.f0(parcel, 1, this.f11231a);
        u.S(parcel, 2, this.f11232b);
        u.b0(this.f11233c, parcel, 3);
        u.a0(parcel, 4, this.f11234d, i11);
        u.i0(iH0, parcel);
    }
}
