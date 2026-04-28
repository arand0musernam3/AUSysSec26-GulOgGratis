package i0;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import e0.j0;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r80.d f22751a = w.b.r(new b0(null, null, null, null, null, null, null, null, null, null));

    /* JADX WARN: Removed duplicated region for block: B:64:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(i0.y r18, e0.a r19, e0.b r20, e0.d r21, e0.j0 r22, java.util.List r23, java.util.List r24, java.util.List r25, java.lang.Boolean r26, java.lang.Boolean r27, java.lang.Boolean r28, int r29) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.y.b(i0.y, e0.a, e0.b, e0.d, e0.j0, java.util.List, java.util.List, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int):void");
    }

    public final LinkedHashMap a() {
        b0 b0Var = (b0) this.f22751a.f37785a;
        b0Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e0.a aVar = b0Var.f22592a;
        if (aVar != null) {
            int i11 = aVar.f15306a;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            key.getClass();
            linkedHashMap.put(key, Integer.valueOf(i11));
        }
        e0.b bVar = b0Var.f22593b;
        if (bVar != null) {
            int i12 = bVar.f15309a;
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_MODE;
            key2.getClass();
            linkedHashMap.put(key2, Integer.valueOf(i12));
        }
        e0.d dVar = b0Var.f22594c;
        if (dVar != null) {
            int i13 = dVar.f15326a;
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
            key3.getClass();
            linkedHashMap.put(key3, Integer.valueOf(i13));
        }
        j0 j0Var = b0Var.f22595d;
        if (j0Var != null) {
            int i14 = j0Var.f15362a;
            CaptureRequest.Key key4 = CaptureRequest.FLASH_MODE;
            key4.getClass();
            linkedHashMap.put(key4, Integer.valueOf(i14));
        }
        List list = b0Var.f22596e;
        if (list != null) {
            CaptureRequest.Key key5 = CaptureRequest.CONTROL_AE_REGIONS;
            key5.getClass();
            linkedHashMap.put(key5, list.toArray(new MeteringRectangle[0]));
        }
        List list2 = b0Var.f22597f;
        if (list2 != null) {
            CaptureRequest.Key key6 = CaptureRequest.CONTROL_AF_REGIONS;
            key6.getClass();
            linkedHashMap.put(key6, list2.toArray(new MeteringRectangle[0]));
        }
        List list3 = b0Var.f22598g;
        if (list3 != null) {
            CaptureRequest.Key key7 = CaptureRequest.CONTROL_AWB_REGIONS;
            key7.getClass();
            linkedHashMap.put(key7, list3.toArray(new MeteringRectangle[0]));
        }
        Boolean bool = b0Var.f22599h;
        if (bool != null) {
            CaptureRequest.Key key8 = CaptureRequest.CONTROL_AE_LOCK;
            key8.getClass();
            linkedHashMap.put(key8, bool);
        }
        Boolean bool2 = b0Var.f22601j;
        if (bool2 != null) {
            CaptureRequest.Key key9 = CaptureRequest.CONTROL_AWB_LOCK;
            key9.getClass();
            linkedHashMap.put(key9, bool2);
        }
        return linkedHashMap;
    }
}
