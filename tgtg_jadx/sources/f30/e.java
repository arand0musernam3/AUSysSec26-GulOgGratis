package f30;

import a30.o;
import a90.v;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends g30.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17278b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17280d;

    public e(o oVar, IBinder iBinder) {
        this.f17279c = iBinder;
        this.f17280d = oVar;
    }

    @Override // g30.e
    public final void a() {
        HashMap map;
        g30.d bVar = null;
        switch (this.f17278b) {
            case 0:
                try {
                    g gVar = (g) this.f17280d;
                    g30.d dVar = gVar.f17285a.f19928m;
                    String str = gVar.f17286b;
                    Bundle bundle = new Bundle();
                    HashMap map2 = h.f17287a;
                    synchronized (h.class) {
                        map = h.f17287a;
                        map.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
                    if (map.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
                    }
                    if (map.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
                    }
                    g gVar2 = (g) this.f17280d;
                    d10.g gVar3 = (d10.g) this.f17279c;
                    String str2 = gVar2.f17286b;
                    f fVar = new f(gVar2, gVar3);
                    g30.b bVar2 = (g30.b) dVar;
                    bVar2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    parcelObtain.writeString(str);
                    int i11 = g30.a.f19907a;
                    parcelObtain.writeInt(1);
                    bundle.writeToParcel(parcelObtain, 0);
                    parcelObtain.writeStrongBinder(fVar);
                    try {
                        bVar2.f19908g.transact(2, parcelObtain, null, 1);
                        parcelObtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        parcelObtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e5) {
                    g gVar4 = (g) this.f17280d;
                    v vVar = g.f17284c;
                    Object[] objArr = {gVar4.f17286b};
                    vVar.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", v.d(vVar.f1051b, "error requesting in-app review for %s", objArr), e5);
                    }
                    ((d10.g) this.f17279c).c(new RuntimeException(e5));
                    return;
                }
            default:
                g30.h hVar = (g30.h) ((o) this.f17280d).f666b;
                IBinder iBinder = (IBinder) this.f17279c;
                int i12 = g30.c.f19909h;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    bVar = iInterfaceQueryLocalInterface instanceof g30.d ? (g30.d) iInterfaceQueryLocalInterface : new g30.b(iBinder);
                }
                hVar.f19928m = bVar;
                v vVar2 = hVar.f19918b;
                vVar2.b("linkToDeath", new Object[0]);
                try {
                    hVar.f19928m.asBinder().linkToDeath(hVar.f19926j, 0);
                    break;
                } catch (RemoteException e11) {
                    Object[] objArr2 = new Object[0];
                    vVar2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", v.d(vVar2.f1051b, "linkToDeath failed", objArr2), e11);
                    }
                }
                hVar.f19923g = false;
                Iterator it = hVar.f19920d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                hVar.f19920d.clear();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, d10.g gVar2, d10.g gVar3) {
        super(gVar2);
        this.f17279c = gVar3;
        this.f17280d = gVar;
    }
}
