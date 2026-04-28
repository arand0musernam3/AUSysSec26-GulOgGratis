package l00;

import android.os.Parcelable;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.j;
import pz.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f26751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f26752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d[] f26753c;

    static {
        d dVar = new d("GET_CREDENTIAL", 1L);
        f26751a = dVar;
        d dVar2 = new d("CREDENTIAL_REGISTRY", 1L);
        d dVar3 = new d("CLEAR_REGISTRY", 2L);
        d dVar4 = new d("CLEAR_CREATION_OPTIONS", 1L);
        d dVar5 = new d("CLEAR_CREDENTIAL_STATE", 1L);
        f26752b = dVar5;
        f26753c = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, new d("CREATE_CREDENTIAL", 3L), new d("REGISTER_CREATION_OPTIONS", 1L), new d("REGISTER_EXPORT", 1L), new d("IMPORT_CREDENTIALS", 1L), new d("SIGNAL_CREDENTIAL_STATE", 1L), new d("CLEAR_EXPORT", 1L), new d("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new d("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new d("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }

    public static i a() {
        j jVar = new j(-1, -1, 0, true);
        Parcelable.Creator<i> creator = i.CREATOR;
        i iVar = new i(jVar, false);
        iVar.f11069c = false;
        return iVar;
    }
}
