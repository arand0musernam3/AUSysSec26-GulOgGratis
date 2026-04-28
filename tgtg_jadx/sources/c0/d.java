package c0;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import e0.v;
import f0.t0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m0.i1;
import u70.l;
import u70.o;
import u70.p;
import u70.q;
import u70.t;
import x.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Range f6795f = new Range(120, 120);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f6796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f6797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f6798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f6799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f6800e;

    public d(v vVar) {
        vVar.getClass();
        this.f6796a = vVar;
        final int i11 = 0;
        this.f6797b = l.b(new Function0(this) { // from class: c0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f6794b;

            {
                this.f6794b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List listT;
                switch (i11) {
                    case 0:
                        v vVar2 = this.f6794b.f6796a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((t0) vVar2).c(key);
                        boolean z11 = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i12 = 0;
                            while (true) {
                                if (i12 < length) {
                                    if (iArr[i12] == 9) {
                                        z11 = true;
                                    } else {
                                        i12++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z11);
                    case 1:
                        List list = (List) this.f6794b.f6800e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            i1.c();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = b1.a.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = b1.a.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        v vVar3 = this.f6794b.f6796a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((t0) vVar3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new i(streamConfigurationMap, new z.f(vVar3));
                        }
                        i4.a.f("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((i) this.f6794b.f6799d.getValue()).f43616d.f39648a;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return (highSpeedVideoSizes == null || (listT = y.T(highSpeedVideoSizes)) == null) ? n0.f26529a : listT;
                }
            }
        });
        final int i12 = 1;
        this.f6798c = l.b(new Function0(this) { // from class: c0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f6794b;

            {
                this.f6794b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List listT;
                switch (i12) {
                    case 0:
                        v vVar2 = this.f6794b.f6796a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((t0) vVar2).c(key);
                        boolean z11 = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i122 = 0;
                            while (true) {
                                if (i122 < length) {
                                    if (iArr[i122] == 9) {
                                        z11 = true;
                                    } else {
                                        i122++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z11);
                    case 1:
                        List list = (List) this.f6794b.f6800e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            i1.c();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = b1.a.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = b1.a.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        v vVar3 = this.f6794b.f6796a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((t0) vVar3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new i(streamConfigurationMap, new z.f(vVar3));
                        }
                        i4.a.f("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((i) this.f6794b.f6799d.getValue()).f43616d.f39648a;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return (highSpeedVideoSizes == null || (listT = y.T(highSpeedVideoSizes)) == null) ? n0.f26529a : listT;
                }
            }
        });
        final int i13 = 2;
        this.f6799d = l.b(new Function0(this) { // from class: c0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f6794b;

            {
                this.f6794b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List listT;
                switch (i13) {
                    case 0:
                        v vVar2 = this.f6794b.f6796a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((t0) vVar2).c(key);
                        boolean z11 = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i122 = 0;
                            while (true) {
                                if (i122 < length) {
                                    if (iArr[i122] == 9) {
                                        z11 = true;
                                    } else {
                                        i122++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z11);
                    case 1:
                        List list = (List) this.f6794b.f6800e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            i1.c();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = b1.a.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = b1.a.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        v vVar3 = this.f6794b.f6796a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((t0) vVar3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new i(streamConfigurationMap, new z.f(vVar3));
                        }
                        i4.a.f("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((i) this.f6794b.f6799d.getValue()).f43616d.f39648a;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return (highSpeedVideoSizes == null || (listT = y.T(highSpeedVideoSizes)) == null) ? n0.f26529a : listT;
                }
            }
        });
        final int i14 = 3;
        this.f6800e = l.b(new Function0(this) { // from class: c0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f6794b;

            {
                this.f6794b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List listT;
                switch (i14) {
                    case 0:
                        v vVar2 = this.f6794b.f6796a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((t0) vVar2).c(key);
                        boolean z11 = false;
                        if (iArr != null) {
                            int length = iArr.length;
                            int i122 = 0;
                            while (true) {
                                if (i122 < length) {
                                    if (iArr[i122] == 9) {
                                        z11 = true;
                                    } else {
                                        i122++;
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z11);
                    case 1:
                        List list = (List) this.f6794b.f6800e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            i1.c();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = b1.a.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = b1.a.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        v vVar3 = this.f6794b.f6796a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((t0) vVar3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new i(streamConfigurationMap, new z.f(vVar3));
                        }
                        i4.a.f("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((i) this.f6794b.f6799d.getValue()).f43616d.f39648a;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return (highSpeedVideoSizes == null || (listT = y.T(highSpeedVideoSizes)) == null) ? n0.f26529a : listT;
                }
            }
        });
    }

    public static List a(List list) {
        if (list.isEmpty()) {
            return n0.f26529a;
        }
        ArrayList arrayListT0 = CollectionsKt.t0((Collection) CollectionsKt.O(list));
        Iterator it = CollectionsKt.J(1, list).iterator();
        while (it.hasNext()) {
            arrayListT0.retainAll((List) it.next());
        }
        return arrayListT0;
    }

    public final Range[] b(List list) {
        int size = list.size();
        if (1 <= size && size < 3 && CollectionsKt.r0(CollectionsKt.u0(list)).size() == 1) {
            List listC = c((Size) list.get(0));
            if (listC.isEmpty()) {
                listC = null;
            }
            if (listC != null) {
                if (list.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listC) {
                        Range range = (Range) obj;
                        if (Intrinsics.areEqual(range.getLower(), range.getUpper())) {
                            arrayList.add(obj);
                        }
                    }
                    listC = arrayList;
                }
                return (Range[]) listC.toArray(new Range[0]);
            }
        }
        return null;
    }

    public final List c(Size size) {
        Object pVar;
        List listR0;
        try {
            o oVar = q.f40850b;
            i iVar = (i) this.f6799d.getValue();
            iVar.getClass();
            size.getClass();
            t10.c cVar = iVar.f43616d;
            cVar.getClass();
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cVar.f39648a;
            pVar = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size) : null;
        } catch (Throwable th2) {
            o oVar2 = q.f40850b;
            pVar = new p(th2);
        }
        Range[] rangeArr = (Range[]) (pVar instanceof p ? null : pVar);
        return (rangeArr == null || (listR0 = CollectionsKt.r0(y.w(rangeArr))) == null) ? n0.f26529a : listR0;
    }
}
