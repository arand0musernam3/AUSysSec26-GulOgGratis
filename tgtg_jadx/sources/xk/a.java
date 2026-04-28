package xk;

import com.app.tgtg.model.remote.item.LatLngInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLngInfo f44436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f44437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f44438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f44439d;

    public a(LatLngInfo latLngInfo, b bVar, Integer num, Integer num2, int i11) {
        latLngInfo = (i11 & 1) != 0 ? new LatLngInfo(0.0d, 0.0d, 3, (DefaultConstructorMarker) null) : latLngInfo;
        bVar = (i11 & 2) != 0 ? new b(new LatLngInfo(0.0d, 0.0d, 3, (DefaultConstructorMarker) null), new LatLngInfo(0.0d, 0.0d, 3, (DefaultConstructorMarker) null)) : bVar;
        num = (i11 & 4) != 0 ? 0 : num;
        num2 = (i11 & 8) != 0 ? 0 : num2;
        this.f44436a = latLngInfo;
        this.f44437b = bVar;
        this.f44438c = num;
        this.f44439d = num2;
    }
}
