package d30;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.integrity.IntegrityServiceException;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.integrity.internal.af;
import i30.k;
import i30.m;
import i30.n;
import i30.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f14010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f14011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d10.g f14012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ IntegrityTokenRequest f14013e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f14014f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, d10.g gVar, byte[] bArr, Long l, d10.g gVar2, IntegrityTokenRequest integrityTokenRequest) {
        super(gVar);
        this.f14014f = eVar;
        this.f14010b = bArr;
        this.f14011c = l;
        this.f14012d = gVar2;
        this.f14013e = integrityTokenRequest;
    }

    @Override // i30.o
    public final void a(Exception exc) {
        if (exc instanceof af) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // i30.o
    public final void b() {
        d10.g gVar = this.f14012d;
        e eVar = this.f14014f;
        try {
            m mVar = eVar.f14021d.f23215n;
            Bundle bundleA = e.a(eVar, this.f14010b, this.f14011c);
            d dVar = new d(eVar, gVar);
            k kVar = (k) mVar;
            kVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IIntegrityService");
            int i11 = i30.i.f23221a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(dVar);
            try {
                kVar.f23223g.transact(2, parcelObtain, null, 1);
            } finally {
                parcelObtain.recycle();
            }
        } catch (RemoteException e5) {
            n nVar = eVar.f14018a;
            Object[] objArr = {this.f14013e};
            nVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", n.b(nVar.f23225a, "requestIntegrityToken(%s)", objArr), e5);
            }
            gVar.c(new IntegrityServiceException(-100, e5));
        }
    }
}
