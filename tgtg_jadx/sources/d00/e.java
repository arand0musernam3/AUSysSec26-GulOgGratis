package d00;

import android.os.IInterface;
import d10.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends a30.d implements IInterface {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f13666i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i11, g gVar) {
        super(7);
        this.f13665h = i11;
        this.f13666i = gVar;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }
}
